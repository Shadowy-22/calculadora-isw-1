package CalculadoraBasica.Operaciones;

import CalculadoraBasica.Interfaces.IOperacion;

/**
 * Implementación de la operación de multiplicación.
 * Realiza el producto aritmético de dos números enteros.
 */
public class Multiplicacion implements IOperacion {
    /**
     * Calcula el producto de dos números enteros.
     * @param a Multiplicando (primer operando)
     * @param b Multiplicador (segundo operando)
     * @return Resultado de la multiplicación (a × b)
     */
    @Override
    public int calcular(int a, int b) {
        return a * b;
    }

    @Override
    public String getNombre() {
        return "MULTIPLICACION";
    }
}
