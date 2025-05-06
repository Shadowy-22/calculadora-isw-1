package Factories;

import Interfaces.IOperacion;
import Operaciones.Division;
import Operaciones.Multiplicacion;
import Operaciones.Resta;
import Operaciones.Suma;

public class OperacionFactory {
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