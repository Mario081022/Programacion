package programselector;
import java.util.Scanner;

public class ProgramSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Programa de calificaciones");
        System.out.println("2. Programa de cajero automático");
        System.out.println("3. Programa de descuento");
        System.out.print("Ingrese el número de opción que desea ejecutar: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ejecutarProgramaCalificaciones();
                break;
            case 2:
                ejecutarProgramaCajeroAutomatico();
                break;
            case 3:
                ejecutarProgramaDescuento();
                break;
            default:
                System.out.println("Opción inválida. La opción seleccionada no existe.");
                break;
        }
    }

    public static void ejecutarProgramaCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de calificaciones");
        System.out.print("Ingrese la calificación: ");
        int calificacion = scanner.nextInt();

        String mensaje = null;

        switch (calificacion) {
            case 0:
                    System.out.println("MUY MAL");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("INSUFICIENTE");
                    break;
                case 6:
                    System.out.println("SUFICIENTE");
                    break;
                case 7:
                case 8:
                    System.out.println("BIEN");
                    break;
                case 9:
                    System.out.println("NOTABLE");
                    break;
                case 10:
                    System.out.println("SOBRESALIENTE");
                    break;
                default:
                    System.out.println("ERROR DE CALIFICACION");
                    break;
            }

        System.out.println("Resultado: " + mensaje);
    }

    public static void ejecutarProgramaCajeroAutomatico() {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;

        System.out.println("Programa de cajero automático");

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Opciones disponibles:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar retiro");
            System.out.println("3. Salir");
            System.out.print("Ingrese el número de opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double cantidadRetiro = scanner.nextDouble();

                    if (cantidadRetiro > saldo) {
                        System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
                    } else {
                        saldo -= cantidadRetiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }

                    break;
                case 3:
                    System.out.println("Gracias por utilizar el Cajero Automático. ¡Hasta pronto!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                    break;
            }
        }
    }

    public static void ejecutarProgramaDescuento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de descuento");
        System.out.print("Ingrese el código: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el precio del artículo: $");
        double precio = scanner.nextDouble();

        double precioConDescuento = 0.0;

        switch (codigo) {
            case "DESC10":
                precioConDescuento = precio * 0.9;
                break;
            case "DESC20":
                precioConDescuento = precio * 0.8;
                break;
            case "DESC30":
                precioConDescuento = precio * 0.7;
                break;
            default:
                System.out.println("Código inválido. No se aplica descuento.");
                return;
        }

        System.out.println("Precio original: $" + precio);
        System.out.println("Precio con descuento: $" + precioConDescuento);
    }
}
}}    

    
}
}
