package CalculadoraBasica.Operaciones;

import CalculadoraBasica.Interfaces.IOperacion;

public class Resta implements IOperacion {
    /**
     * Calcula la diferencia entre dos números enteros.
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