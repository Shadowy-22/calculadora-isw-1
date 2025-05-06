package CalculadoraBasica.Validators;

import java.util.Scanner;

/**
 * Clase utilitaria para manejar la entrada del usuario con validación.
 * Proporciona métodos estáticos para leer diferentes tipos de entrada.
 */
public class EntradaUsuario {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Lee un número entero positivo de la entrada estándar.
     * @param mensaje Mensaje a mostrar al usuario
     * @return Número positivo válido ingresado por el usuario
     */
    public static int leerNumeroPositivo(String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextInt();
                if (numero >= 0) return numero;
                System.out.println("El número debe ser positivo.");
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                scanner.nextLine();
            }
        }
    }

     /**
     * Solicita confirmación al usuario para continuar una operación.
     * @param operacion Nombre de la operación actual para mostrar en el mensaje
     * @return true si el usuario desea continuar, false en caso contrario
     */
    public static boolean confirmarContinuar(String operacion) {
        String opcion;
        while (true) {
            System.out.printf("¿Desea realizar otra %s? (Y/N): ", operacion.toUpperCase());
            opcion = scanner.next().toUpperCase();
            if (opcion.equals("Y") || opcion.equals("N")) {
                return opcion.equals("Y");
            }
            System.out.println("Opción inválida. Intente nuevamente.");
        }
    }

    /**
     * Lee una opción de menú válida (0-4).
     * @return Opción numérica válida seleccionada por el usuario
     */
    public static int leerOpcionMenu() {
        int opcion;
        while (true) {
            try {
                opcion = scanner.nextInt();
                if (opcion >= 0 && opcion <= 4) return opcion;
                System.out.println("Opción inválida. Intente nuevamente.");
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                scanner.nextLine();
            }
        }
    }
}