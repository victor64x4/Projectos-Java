package tienda_organica;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    																					// M�todo para mostrar el inventario basado en la opci�n del usuario
	public static void mostrarInventario(List<Fruta> frutas, List<Verdura> verduras) {
	    @SuppressWarnings("resource")
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("�Opciones de Inventario?");
	    System.out.println("");
	    System.out.println("1. Frutas");
	    System.out.println("2. Verduras");
	    System.out.println("3. Lista Completa");
	    System.out.println("");
	    System.out.print("Ingrese su opci�n: ");
	    
	    try {
	        int opcion = scanner.nextInt();
	        scanner.nextLine(); // Limpiar el buffer del scanner

	        switch (opcion) {
	            case 1:
	                mostrarFrutas(frutas);
	                break;
	            case 2:
	                mostrarVerduras(verduras);
	                break;
	            case 3:
	                mostrarTodo(frutas, verduras);
	                break;
	            default:
	                System.out.println("Opci�n inv�lida.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("Entrada inv�lida. Por favor, ingrese un n�mero.");
	        scanner.nextLine(); // Limpiar el buffer del scanner en caso de error
	    }
	}

    																	      		// M�todo para mostrar la lista de frutas
    private static void mostrarFrutas(List<Fruta> frutas) {
        System.out.println("Lista de frutas:");
        System.out.println("");
        for (Fruta producto : frutas) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Tipo: " + producto.getTipo() +
                    ", Precio: $" + producto.getPrecio() +
                    ", Tipo de Fruta: " + producto.getTipoFruta());
        }
    }

    																// M�todo para mostrar la lista de verduras
    private static void mostrarVerduras(List<Verdura> verduras) {
        System.out.println("Lista de verduras:");
        System.out.println("");
        for (Verdura producto : verduras) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Tipo: " + producto.getTipo() +
                    ", Precio: $" + producto.getPrecio() +
                    ", Tipo de Verdura: " + producto.getTipoVerdura());
        }
    }

    																	// M�todo para mostrar toda la lista de frutas y verduras
    private static void mostrarTodo(List<Fruta> frutas, List<Verdura> verduras) {
        System.out.println(""); // Mostrar la lista de frutas
        System.out.println("Lista de frutas:");
        System.out.println("");
        for (Fruta producto : frutas) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Tipo: " + producto.getTipo() +
                    ", Precio: $" + producto.getPrecio() +
                    ", Tipo de Fruta: " + producto.getTipoFruta());
        }

        																// Mostrar la lista de verduras
        System.out.println("\nLista de verduras:");
        System.out.println("");
        for (Verdura producto : verduras) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Tipo: " + producto.getTipo() +
                    ", Precio: $" + producto.getPrecio() +
                    ", Tipo de Verdura: " + producto.getTipoVerdura());
        }
    }
}
