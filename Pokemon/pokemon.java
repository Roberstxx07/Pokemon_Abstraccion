package Pokemon.PoKemon;



public abstract class Pokemon {
    private int HP;
    private final int nivel;
    private final String nombre;
    private final Tipo tipo;
    Movimiento movimientos[];

    public Pokemon(String nombre, Tipo tipo, int nivel) {
        this.HP = 250;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.movimientos = new Movimiento[4];
    }

    public int getHP() {
        return HP;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    
    private void calculaDanio(int danio, double efectividad) {
        double puntosRestados = danio * efectividad;
        this.HP -= puntosRestados;
        System.out.printf("%s recibe %.2f puntos de daño\n", this.getNombre(), puntosRestados);
    }

    public void recibirAtaques(Movimiento movimiento, double efectividad) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);
    }

    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad = obtenerEfectividad(pokemon);

        if (movimiento.getPp() > 0) {
            pokemon.recibirAtaques(movimiento, efectividad);
            return true;
        } else {
            System.err.println("El movimiento no tiene puntos de PP");
            return false;
        }
    }

    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento = getMovimientos()[m]; // Utiliza corchetes para acceder a un elemento específico del arreglo
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemon);
        if (seHaConcretadoAtaque) {
            movimiento.setPp(movimiento.getPp() - 1);
        }
    }

    public abstract double obtenerEfectividad(Pokemon pokemon);
}
