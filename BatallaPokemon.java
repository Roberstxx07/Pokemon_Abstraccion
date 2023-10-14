package pokemon;

import Pokemon.PoKemon.PokemonFuego;
import Pokemon.PoKemon.PokemonAgua;


public class BatallaPokemon {
    public static void main(String[] args) {
        // Crea instancias de las clases hijas con nombre y nivel 10
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 10);
        PokemonFuego charmander = new PokemonFuego("Charmander", 10);

        // Realiza la primera batalla
        squirtle.atacar(0, charmander); // Utiliza el índice del movimiento
        charmander.atacar(1, squirtle); // Utiliza el índice del movimiento
    }
}
