package Factura;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        try
        {
            String nombreFactura, respuesta;
            double precioProducto01, precioProducto02, totalSuma, totalImpuesto, impuesto;
            Scanner oScanner = new Scanner(System.in);
            System.out.println("Nombre Factura: ");
            nombreFactura = oScanner.nextLine();
            System.out.println("Precio 01: ");
            precioProducto01 = oScanner.nextDouble();
            System.out.println("Precio 02: ");
            precioProducto02 = oScanner.nextDouble();
            totalSuma = precioProducto01 + precioProducto02;
            impuesto = (totalSuma * 19)/100;
            totalImpuesto = totalSuma + impuesto;
            respuesta = "La factura producto de oficina tiene un total de " + totalSuma + "," +
                      " con un impuesto de " + impuesto  + " y el monto después de impuesto es de " + totalImpuesto;
            System.out.println(respuesta);
        }catch (Exception ex){
            System.out.println("Error debe ingresar precios");
            main(args);
            System.exit(0);
        }
    }
}
