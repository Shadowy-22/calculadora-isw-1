package CalculadoraBasica.Factories;

import CalculadoraBasica.Interfaces.IOperacion;
import CalculadoraBasica.Operaciones.Division;
import CalculadoraBasica.Operaciones.Multiplicacion;
import CalculadoraBasica.Operaciones.Resta;
import CalculadoraBasica.Operaciones.Suma;

/**
 * Patrón Factory para crear instancias de operaciones matemáticas.
 * Centraliza la creación de objetos que implementan IOperacion.
 */
public class OperacionFactory {
    /**
     * Crea una instancia de operación basada en la opción seleccionada.
     * @param opcion Número de opción (1-4)
     * @return Instancia de la operación correspondiente
     * @throws IllegalArgumentException Si la opción no es válida
     */
    public static IOperacion crear(int opcion) {
        return switch (opcion) {
            case 1 -> new Suma();
            case 2 -> new Resta();
            case 3 -> new Multiplicacion();
            case 4 -> new Division();
            default -> throw new IllegalArgumentException("Opción no válida");
        };
    }
}