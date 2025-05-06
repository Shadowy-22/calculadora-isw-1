package CalculadoraBasica.Interfaces;

/**
 * Interfaz que define las operaciones matemáticas básicas.
 * Todas las operaciones deben implementar estos métodos.
 */
public interface IOperacion {
    /**
     * Realiza el cálculo entre dos números enteros.
     * @param a Primer operando
     * @param b Segundo operando
     * @return Resultado de la operación
     * @throws ArithmeticException En casos como división por cero
     */
    int calcular(int a, int b);

    /**
     * @return Nombre descriptivo de la operación en mayúsculas (ej: "SUMA")
     */
    String getNombre();
} 
