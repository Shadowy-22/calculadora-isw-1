package CalculadoraBasica.Operaciones;

import CalculadoraBasica.Interfaces.IOperacion;

/**
 * Implementación de la operación de división con manejo de casos especiales:
 * - División por cero (lanza excepción)
 * - Optimización para divisiones donde el divisor es mayor que el dividendo
 * - Caso especial cuando el dividendo es cero
 */
public class Division implements IOperacion {
     /**
     * Calcula la división entre dos números enteros positivos.
     * @param a Dividendo (numero a dividir)
     * @param b Divisor (numero que divide)
     * @return Resultado no negativo de la division (a / b o b / a)
     */
    @Override
    public int calcular(int a, int b) {
        // Validar divisor != 0
        if (b == 0) throw new ArithmeticException("No se puede dividir por cero");
        
        // Swap si b > a (excepto cuando a es 0)
        if (b > a && a != 0) {
            int temp = a;
            a = b;
            b = temp;
        } else if (a == 0) {
            return 0; // 0 / cualquier número (no cero) es 0
        }
        
        return a / b;
    }

    @Override
    public String getNombre() {
        return "DIVISION";
    }
}
