package Operaciones;

import Interfaces.IOperacion;

public class Resta implements IOperacion {
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