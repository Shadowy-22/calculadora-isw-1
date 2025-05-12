package CalculadoraBasica.Operaciones;

import CalculadoraBasica.Interfaces.IOperacion;

/**
 * Implementación de la operación de resta.
 * Realiza la diferencia de dos números enteros positivos con manejo para casos especiales:
 * - Se realiza un swap de los numeros si el sustraendo es mayor que el minuendo para evitar resultados negativos.
 */
public class Resta implements IOperacion {
    /**
     * Calcula la diferencia entre dos números enteros positivos.
     * @param a Minuendo (valor inicial)
     * @param b Sustraendo (valor a restar)
     * @return Resultado no negativo de la resta (a - b o b - a)
     */
    @Override
    public int calcular(int a, int b) {
        // Swap si b > a para evitar resultados negativos
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        return a - b;
    }


    @Override
    public String getNombre() {
        return "RESTA";
    }
}