import Factories.OperacionFactory;
import Interfaces.IOperacion;
import Validators.EntradaUsuario;

public class Calculadora {

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
