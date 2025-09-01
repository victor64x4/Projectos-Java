package tienda_organica;

import java.util.List;
import java.util.Scanner;

public class Realizar_Compra {

    																					// Método para realizar una compra de frutas o verduras
    public static void realizarCompra(List<Fruta> frutas, List<Verdura> verduras) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        double total = 0;
        int cantidadComprada = 0;

        System.out.println("Ingrese el nombre del producto que desea comprar: ");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        																				// Buscar el producto en la lista de frutas
        for (Fruta producto : frutas) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                cantidadComprada = cantidad;
                total = producto.calcularPrecioConDescuento(cantidad); 					// Calcular precio con descuento
                System.out.println("Producto comprado: " + producto.getNombre()); 		// Mostrar el nombre del producto
                break;    
            }
        }

        																				// Si el producto no se encuentra en la lista de frutas, buscarlo en la lista de verduras
        if (total == 0) {
            for (Verdura producto : verduras) {
                if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                    cantidadComprada = cantidad;
                    total = producto.calcularPrecioConDescuento(cantidad); 				// Calcular precio con descuento
                    System.out.println("Producto comprado: " + producto.getNombre()); 	// Mostrar el nombre del producto
                    break;
                }
            }
        }

        																				// Si no se encontró el producto en ninguna lista
        if (total == 0) {
            System.out.println("Error: No se encontró ningún producto con ese nombre.");
        } else {
            total = Math.round(total * 100.0) / 100.0; 									// Redondear el total a dos decimales
            System.out.println("Cantidad comprada: " + cantidadComprada);
            System.out.println("El total a pagar es: $" + total);
        }
    }
}


