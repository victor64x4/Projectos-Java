package tienda_organica;

import java.util.List;
import java.util.Scanner;

public class Buscar_Productos {
    public static void buscarProducto(List<Fruta> frutas, List<Verdura> verduras) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto que desea buscar:");
        String nombreBuscado = scanner.nextLine();

        boolean encontradoEnFrutas = false;
        boolean encontradoEnVerduras = false;

        																	// Buscar en la lista de frutas
        for (Fruta producto : frutas) {
            if (producto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                if (!encontradoEnFrutas) {
                    System.out.println("\nBuscando en la lista de frutas:");
                    encontradoEnFrutas = true;
                }
                System.out.println("Nombre: " + producto.getNombre() +
                        ", Tipo: " + producto.getTipo() +
                        ", Precio: $" + producto.getPrecio() +
                        ", Tipo de Fruta: " + producto.getTipoFruta());
            }
        }

        																	// Buscar en la lista de verduras
        for (Verdura producto : verduras) {
            if (producto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                if (!encontradoEnVerduras) {
                    System.out.println("\nBuscando en la lista de verduras:");
                    encontradoEnVerduras = true;
                }
                System.out.println("Nombre: " + producto.getNombre() +
                        ", Tipo: " + producto.getTipo() +
                        ", Precio: $" + producto.getPrecio() +
                        ", Tipo de Verdura: " + producto.getTipoVerdura());
            }
        }

        																	// Mensaje si no se encontró en ninguna lista
        if (!encontradoEnFrutas && !encontradoEnVerduras) {
            System.out.println("Producto no encontrado.");
        }
    }
}