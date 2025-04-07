import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.print("""
                    
                    *** CALCULADORA BÁSICA ***
                    
                    [1] - SUMAR.
                    [2] - RESTAR.
                    [3] - MULTIPLICAR.
                    [4] - DIVIDIR.
                    [0] - SALIR DEL PROGRAMA.
                    
                    SELECCIONAR UNA OPCION [0 a 4] Y PRESIONAR ENTER: """);

            int entrada;
            try {
                entrada = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida. Intente nuevamente.");
                in.nextLine();
                continue;
            }

            if (entrada < 0 || entrada > 4) {
                System.out.println("Opcion invalida. Intente nuevamente.");
                continue;
            }

            switch (entrada) {
                case 0 -> {
                    System.out.println("Finalizando calculadora...");
                    in.close();
                    return;
                }
                case 1 -> sumar();
                case 2 -> restar();
                case 3 -> multiplicar();
                case 4 -> dividir();
            }
        }
    }

    private static void sumar() {
        System.out.println("SUMAR");
        do {
            int num1 = leerNumeroPositivo("Ingrese un numero: ");
            int num2 = leerNumeroPositivo("Ingrese otro numero: ");
            System.out.printf("La suma entre %d + %d = %d\n", num1, num2, num1 + num2);
        } while (preguntarOtraOperacion());
    }

    private static void restar() {
        System.out.println("RESTAR");
        do {
            int num1 = leerNumeroPositivo("Ingrese un numero: ");
            int num2 = leerNumeroPositivo("Ingrese otro numero: ");

            if(num2>num1){
                int temp;
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.printf("La resta entre %d - %d = %d\n", num1, num2, num1 - num2);
        } while (preguntarOtraOperacion());
    }

    private static void multiplicar() {
        System.out.println("MULTIPLICAR");
        do {
            int num1 = leerNumeroPositivo("Ingrese un número: ");
            int num2 = leerNumeroPositivo("Ingrese otro número: ");
            System.out.printf("La multiplicación entre %d * %d = %d\n", num1, num2, num1 * num2);
        } while (preguntarOtraOperacion());
    }

    private static void dividir() {
        System.out.println("DIVIDIR");
        do {

            int num1 = leerNumeroPositivo("Ingrese un numero: ");
            int num2;
            while (true) {
                num2 = leerNumeroPositivo("Ingrese otro numero: ");
                if (num2 != 0) break;
                System.out.println("No se puede dividir por cero. Intente de nuevo.");
            }
            // Realizar el swap solo si num1 no es cero (para evitar 0/10 -> 10/0)
            if (num2 > num1 && num1 != 0) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            } else if (num1 == 0) {
                System.out.println("Error: No se puede realizar la división con 0 como primer número.");
                continue; // Vuelve al inicio del bucle
            }

            System.out.printf("La division entre %d / %d = %.2f\n", num1, num2, (double) num1 / num2);

        } while (preguntarOtraOperacion());
    }

    private static int leerNumeroPositivo(String mensaje) {
        int num;
        while (true) {
            System.out.print(mensaje);
            try {
                num = in.nextInt();
                if (num >= 0) return num;
                System.out.println("El numero debe ser positivo.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                in.nextLine();
            }
        }
    }

    private static boolean preguntarOtraOperacion() {
        String opcion;
        while (true) {
            System.out.print("¿Desea realizar otra operacion? (Y/N): ");
            opcion = in.next();
            if (opcion.matches("[YNyn]")) break;
            System.out.println("Opcion invalida. Intente nuevamente.");
        }
        return opcion.equalsIgnoreCase("Y");
    }
}
