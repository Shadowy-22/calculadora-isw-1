package Operaciones;

import Interfaces.IOperacion;

public class Division implements IOperacion {
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
