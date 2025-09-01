package tienda_organica;

import java.util.List;
import java.util.Scanner;

public class Eliminar_Producto {

    																				// Método para eliminar un producto de las listas de frutas o verduras
    public static void eliminarProducto(List<Fruta> frutas, List<Verdura> verduras) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto que desea eliminar: ");
        String nombreProducto = scanner.nextLine();
        boolean eliminado = false;

        																				// Buscar en la lista de frutas
        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
                frutas.remove(i);
                eliminado = true;
                System.out.println("Fruta eliminada correctamente.");
                break;
            }
        }

        																				// Si no se encontró en la lista de frutas, buscar en la lista de verduras
        if (!eliminado) {
            for (int i = 0; i < verduras.size(); i++) {
                if (verduras.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
                    verduras.remove(i);
                    eliminado = true;
                    System.out.println("Verdura eliminada correctamente.");
                    break;
                }
            }
        }

        																				// Si no se encontró en ninguna lista, mostrar un mensaje
        if (!eliminado) {
            System.out.println("No se encontró ningún producto con ese nombre.");
        }
    }
}

