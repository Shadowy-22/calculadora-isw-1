package Validators;

import java.util.Scanner;

public class EntradaUsuario {
    private static final Scanner scanner = new Scanner(System.in);

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