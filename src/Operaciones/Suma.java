package Operaciones;

import Interfaces.IOperacion;

public class Suma implements IOperacion {
    
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }

    @Override
    public String getNombre() {
        return "SUMA";
    }
}