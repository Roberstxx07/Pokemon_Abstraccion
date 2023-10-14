package pokemon.pokemon;

public class Movimiento {
    private final String nombre;
    private final int puntosDeAtaque;
    private int pp;
    private final Tipo tipo;

public Movimiento(String nombre, int puntosDeAtaque, Tipo tipo, int pp) {
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
        this.pp = pp;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public int getPp() {
        return pp;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

private Movimiento movimientos[];

public void setMovimiento(int indice, Movimiento movimiento) {
    movimientos[indice] = movimiento;
}

public Movimiento getMovimiento(int indice) {
    return movimientos[indice];
}

}
