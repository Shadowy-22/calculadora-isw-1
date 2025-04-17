package Operaciones;

import Interfaces.IOperacion;

public class Multiplicacion implements IOperacion {
    @Override
    public int calcular(int a, int b) {
        return a * b;
    }

    @Override
    public String getNombre() {
        return "MULTIPLICACION";
    }
}
