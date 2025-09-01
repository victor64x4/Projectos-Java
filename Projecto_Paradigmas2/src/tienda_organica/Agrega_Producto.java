package tienda_organica;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Agrega_Producto {

    																					// Método para agregar un producto a las listas de frutas o verduras
	public static void agregarProducto(List<Fruta> frutas, List<Verdura> verduras) {
	    @SuppressWarnings("resource")
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("¿Qué tipo de producto desea agregar?");
	    System.out.println("");
	    System.out.println("1. Fruta");
	    System.out.println("2. Verdura");
	    System.out.println("");
	    System.out.print("Ingrese su opción: ");
	    
	    try {
	        int opcion = scanner.nextInt();
	        scanner.nextLine();  // Limpiar el buffer del scanner

	        if (opcion == 1) {
	            agregarFruta(frutas);
	        } else if (opcion == 2) {
	            agregarVerdura(verduras);
	        } else {
	            System.out.println("Opción inválida.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("Entrada inválida. Por favor, ingrese un número.");
	        scanner.nextLine();  // Limpiar el buffer del scanner en caso de error
	    }
	}
    																					// Método para agregar una fruta
    private static void agregarFruta(List<Fruta> frutas) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la fruta: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio de la fruta: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tipo de fruta (secos, cítrico, neutro): ");
        scanner.nextLine(); // Limpiar el buffer del scanner
        String tipoFruta = scanner.nextLine();
        frutas.add(new Fruta(nombre, "Fruta", precio, tipoFruta));
        System.out.println("Fruta agregada correctamente.");
    }

    																				// Método para agregar una verdura
    private static void agregarVerdura(List<Verdura> verduras) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la verdura: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio de la verdura: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tipo de verdura (hoja, tallo, habas): ");
        scanner.nextLine(); // Limpiar el buffer del scanner
        String tipoVerdura = scanner.nextLine();
        verduras.add(new Verdura(nombre, "Verdura", precio, tipoVerdura));
        System.out.println("Verdura agregada correctamente.");
    }
}
