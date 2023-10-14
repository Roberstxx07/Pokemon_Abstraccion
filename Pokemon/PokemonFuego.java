package Pokemon.PoKemon;
public class PokemonFuego extends Pokemon {

    private Pokemon pokemonObjetivo;
    public PokemonFuego(String nombre, int nivel) {
    super(nombre, Tipo.Fuego, nivel); // Cambiar el tipo a Tipo.Fuego
    // Asigna movimientos específicos para Pokémon de tipo Fuego
    setMovimiento(0, new Movimiento("Ascuas", 40, Tipo.Fuego, 25));
    setMovimiento(1, new Movimiento("Dragoaliento", 60, Tipo.Fuego, 20));
    setMovimiento(2, new Movimiento("Lanza llamas", 90, Tipo.Fuego, 15));
    setMovimiento(3, new Movimiento("Giro Fuego", 35, Tipo.Fuego, 15));
             setMovimientos(movimientos);

}
 

 @Override
public double obtenerEfectividad(Pokemon pokemon) {
      double efectividad = 1.0;

        //No efectivo
        if (pokemon.getTipo() == Tipo.AGUA || 
            pokemon.getTipo() == Tipo.ROCA || 
            pokemon.getTipo() == Tipo.FUEGO || 
            pokemon.getTipo() == Tipo.DRAGON) {
            efectividad = 0.0;
        }

        //Efectivo
        if (pokemon.getTipo() == Tipo.BICHO || 
            pokemon.getTipo() == Tipo.PLANTA || 
            pokemon.getTipo() == Tipo.ACERO || 
            pokemon.getTipo() == Tipo.HIELO) {
            efectividad = 2.0;
        }

        return efectividad;        
    }
}
