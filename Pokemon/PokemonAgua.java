package Pokemon.PoKemon;


public class PokemonAgua extends Pokemon {
    public PokemonAgua(String nombre, int nivel) {
    super(nombre, Tipo.Agua, nivel);
    // Asigna movimientos específicos para Pokémon de tipo Agua
    setMovimiento(0, new Movimiento("Burbuja", 40, Tipo.Agua, 25));
    setMovimiento(1, new Movimiento("Hidrobomba", 110, Tipo.Agua, 5));
    setMovimiento(2, new Movimiento("Mordisco", 100, Tipo.Agua, 25));
    setMovimiento(3, new Movimiento("Acua Cola", 90, Tipo.Agua, 10));
  
   
}

 @Override
public double obtenerEfectividad(Pokemon pokemon) {
   double efectividad = 1.0;

        //No efectivo
        if (pokemon.getTipo() == Tipo.AGUA| || 
            pokemon.getTipo() == Tipo.ROCA || 
            pokemon.getTipo() == Tipo.FUEGO || 
            pokemon.getTipo() == Tipo.DRAGON) {
            efectividad = 0.0;
        }

        //Efectivo
        if (pokemon.getTipo() == Tipo.BICHO || 
            pokemon.getTipo() == Tipo.PLANTA || 
            pokemon.getTipo() == Tipo.ACERO || 
            pokemon.getTipo() == Tipo.FUEGO) {
            efectividad = 2.0;
        }

        return efectividad;        
    }
}
