package pokemon.PoKemon; 

import java.util.ArrayList;

public class ListaMovimientos {
    private final ArrayList<Movimiento> movimientos = new ArrayList<>();

    public ListaMovimientos() {
        // Movimentos tipo Agua
        movimientos.add(new Movimiento("Hidrobomba", 110, Tipo.AGUA, 5));
        movimientos.add(new Movimiento("Pistola de Agua", 40, Tipo.AGUA, 25));
        movimientos.add(new Movimiento("Mordisco", 100, Tipo.SINIESTRO, 25));
        movimientos.add(new Movimiento("Acua Cola", 90, Tipo.AGUA, 10));
        
        // Movimientos tipo Fuego
        movimientos.add(new Movimiento("Ascuas", 40, Tipo.FUEGO, 25));
        movimientos.add(new Movimiento("Dragoaliento", 60, Tipo.FUEGO, 20));
        movimientos.add(new Movimiento("Lanza llamas", 90, Tipo.FUEGO, 15));
        movimientos.add(new Movimiento("Giro Fuego", 35, Tipo.FUEGO, 15));
    }

    // Método que devuelve el movimiento buscando por nombre
    public Movimiento buscarMovimientoPorNombre(String nombre) {
        for (Movimiento movimiento : movimientos) {
            if (movimiento.getNombre().equals(nombre)) {
                return movimiento;
            }
        }
        return null;
    }
}
