package facturas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Gestión de Facturas");

        System.out.print("Cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();

        System.out.println("Seleccione el tipo de factura:");
        System.out.println("1. Factura de Productos");
        System.out.println("2. Factura de Servicios");
        int opcion = scanner.nextInt();

        Factura factura;

        if (opcion == 1) {
            System.out.print("Subtotal: $");
            double subtotal = scanner.nextDouble();
            factura = new FacturaProducto(cliente, fecha, subtotal);
        } else if (opcion == 2) {
            System.out.print("Costo del Servicio: $");
            double costoServicio = scanner.nextDouble();
            factura = new FacturaServicio(cliente, fecha, costoServicio);
        } else {
            System.out.println("Opción no válida");
            return;
        }

        double total = factura.calcularTotal();
        String detalle = factura.generarDetalle();

        System.out.println("\nResumen de Factura:");
        System.out.println(detalle);

        if (opcion == 2) {
            System.out.println("¡Se ha agregado el 8% de IVA!");
        }

        System.out.println("Total a pagar: $" + total);
    }
}
