package CalculadoraBasica.Operaciones;

import CalculadoraBasica.Interfaces.IOperacion;

/**
 * Implementación de la operación de suma aritmética.
 * Realiza la adición de dos números enteros.
 */
public class Suma implements IOperacion {
    
     /**
     * Calcula la suma de dos números enteros.
     * @param a Primer sumando
     * @param b Segundo sumando
     * @return Resultado de la suma (a + b)
     */
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }

    @Override
    public String getNombre() {
        return "SUMA";
    }
}