package CalculadoraBasica;

import CalculadoraBasica.Factories.OperacionFactory;
import CalculadoraBasica.Interfaces.IOperacion;
import CalculadoraBasica.Validators.EntradaUsuario;

/**
 * Clase principal que implementa una calculadora con operaciones básicas.
 * Maneja el flujo principal de la aplicación y la interacción con el usuario.
 */

public class Calculadora {

    /**
     * Punto de entrada principal de la aplicación.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = EntradaUsuario.leerOpcionMenu();

            if (opcion == 0) {
                System.out.println("Finalizando calculadora...");
                break;
            }

            IOperacion operacion = OperacionFactory.crear(opcion);
            ejecutarOperacion(operacion);
        }
    }

    /**
     * Muestra el menú principal de la calculadora.
     */
    private static void mostrarMenu() {
        System.out.print("""
            *** CALCULADORA BÁSICA ***
                
            [1] - SUMAR.
            [2] - RESTAR.
            [3] - MULTIPLICAR.
            [4] - DIVIDIR.
            [0] - SALIR.
                
            Seleccione una opción [0-4]: """);
    }

    /**
     * Ejecuta una operación matemática seleccionada.
     * @param operacion Operación a ejecutar (implementación de IOperacion)
     */
    private static void ejecutarOperacion(IOperacion operacion) {
        System.out.println("\n" + operacion.getNombre());
        do {
            int num1 = EntradaUsuario.leerNumeroPositivo("Ingrese un número: ");
            int num2 = EntradaUsuario.leerNumeroPositivo("Ingrese otro número: ");

            try {
                int resultado = operacion.calcular(num1, num2);
                System.out.printf("Resultado: %d%n", resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (EntradaUsuario.confirmarContinuar(operacion.getNombre()));
    }
}
