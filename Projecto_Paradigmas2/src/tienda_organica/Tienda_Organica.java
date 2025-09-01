package tienda_organica;

import java.util.*;

public class Tienda_Organica {

	public static void main(String[] args) {
																			// Crear listas para almacenar productos orgánicos
	    List<Fruta> frutas = inicializarFrutas();							// apartir de nuestras clases 
	    List<Verdura> verduras = inicializarVerduras();						
	    																	// Mostrar el menú y procesar la opción del usuario
	    mostrarMenu(frutas, verduras);
	}

																			// Método para inicializar las frutas
	private static List<Fruta> inicializarFrutas() {
	    List<Fruta> frutas = new ArrayList<>();
	    																	// Agregar datos iniciales: frutas
	    frutas.add(new Fruta("Manzana", "Fruta", 0.25, "neutro"));
	    frutas.add(new Fruta("Naranja", "Fruta", 0.15, "cítrico"));
	    frutas.add(new Fruta("Plátano", "Fruta", 0.45, "neutro"));
	    frutas.add(new Fruta("Uva", "Fruta", 1.50, "neutro"));
	    return frutas;
	}

																			// Método para inicializar las verduras
	private static List<Verdura> inicializarVerduras() {
	    List<Verdura> verduras = new ArrayList<>();
	    																	// Agregar datos iniciales: verduras
	    verduras.add(new Verdura("Espinaca", "Verdura", 1.00, "hoja"));
	    verduras.add(new Verdura("Brócoli", "Verdura", 1.25, "hoja"));
	    verduras.add(new Verdura("Zanahoria", "Verdura", 0.75, "tallo"));
	    verduras.add(new Verdura("Habas", "Verdura", 0.60, "habas"));
	    return verduras;
	}

    																			
	 private static void mostrarMenu(List<Fruta> frutas, List<Verdura> verduras) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
        	System.out.println("");
            System.out.println("Bienvenido a su tienda organica");
            System.out.println("");
            System.out.println("1. Inventario");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Realizar Compra");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.print("Ingrese su Opción: ");
            System.out.println("");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    mostrarInventario(frutas,verduras);
                    break;
                case 2:
                	agregarProducto(frutas,verduras);
                    break;
                case 3:
                	buscarProducto(frutas,verduras);
                    break;
                case 4:
                	eliminarProducto(frutas,verduras);
                    break;
                case 5:
                	realizarCompra(frutas,verduras);
                    break;
                case 6:
                    System.out.println("Gracias por visitar nuestra tienda.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 6.");
            }
        } while (opcion != 6);
    }
	 private static void mostrarInventario(List<Fruta> frutas, List<Verdura> verduras) {
		 Inventario.mostrarInventario(frutas, verduras);								// Llama al método para mostrar el inventario de frutas y verduras
    }
    																					
    private static void agregarProducto(List<Fruta> frutas, List<Verdura> verduras) {
    	Agrega_Producto.agregarProducto(frutas, verduras);  							// Llama al método para agregar un producto al inventario
    }
    private static void buscarProducto(List<Fruta> frutas, List<Verdura> verduras) { 	
       Buscar_Productos.buscarProducto(frutas, verduras);								// Llama al método para buscar un producto en el inventario
    }

    private static void eliminarProducto(List<Fruta> frutas, List<Verdura> verduras) {
      Eliminar_Producto.eliminarProducto(frutas, verduras);      						// Llama al método para eliminar un producto del inventario
    }
 
    private static void realizarCompra(List<Fruta> frutas, List<Verdura> verduras) {
       Realizar_Compra.realizarCompra(frutas, verduras);								// Llama al método para realizar una compra de productos del inventario
}
}