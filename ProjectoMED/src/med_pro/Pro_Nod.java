package med_pro;
import java.util.Scanner;

public class Pro_Nod {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println("*---*Trabajando con Nodos*---*");
            System.out.println("Menú:");
            System.out.println("1. Agregar un nodo al inicio de la lista.");
            System.out.println("2. Suprimir un nodo de la lista");
            System.out.println("3. Ordenar los elementos de la lista.");
            System.out.println("4. Agregar un nodo al final de la lista.");
            System.out.println("5. Listar todos los elementos de la lista.");
            System.out.println("6. Vaciar la lista completa");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    agregar_nodo();
                    break;
                case 2:
                    eliminar_nodo();
                    break;
                case 3:
                	ordenar_nodo();
                    break;
                case 4:
                    agregar_nodo_final();
                    break;
                case 5:
                    listar_nodo();
                    break;
                case 6:
                    vaciar_nodo();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.\n");
            }
        }
    }
	static class Nodo {
	    int dato;
	    Nodo siguiente;

	    public Nodo(int dato) {
	        this.dato = dato;
	        this.siguiente = null;
	    }
	}

	public static Nodo cabeza = null;
	private static void agregar_nodo() {
		int nuevoDato;
		
		while (true) {
	        System.out.print("Ingrese el valor del nodo: ");
	        if (scanner.hasNextInt()) {
	            nuevoDato = scanner.nextInt();
	            scanner.nextLine(); 					// Limpiar el buffer del scanner
	            break; 									// Salir del bucle si el valor es válido
	        } else {
	            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
	            scanner.nextLine(); 					// Limpiar la entrada incorrecta
	        }
	    }

	    Nodo nuevoNodo = new Nodo(nuevoDato);
	    nuevoNodo.siguiente = cabeza; 					// Enlazar el nuevo nodo con el anterior
	    cabeza = nuevoNodo; 							// Actualizar la cabeza de la lista

	    System.out.println("Nodo agregado correctamente.\n");
	
	}

	private static void eliminar_nodo() {
	    if (cabeza == null) {
	        System.out.println("La lista está vacía. No hay nodos para eliminar.");
	        return;
	    }

	    int valorEliminar;
	    while (true) {
	        System.out.print("Ingrese el valor del nodo a eliminar: ");
	        if (scanner.hasNextInt()) {
	            valorEliminar = scanner.nextInt();
	            scanner.nextLine(); 		// Limpiar el buffer del scanner
	            break;
	        } else {
	            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
	            scanner.nextLine(); 		// Limpiar la entrada incorrecta
	        }
	    }

	    									// Caso: eliminar la cabeza
	    if (cabeza.dato == valorEliminar) {
	        cabeza = cabeza.siguiente;
	        System.out.println("Nodo eliminado correctamente.\n");
	        return;
	    }

	    									// Caso: eliminar un nodo intermedio o final
	    Nodo actual = cabeza;
	    Nodo anterior = null;

	    while (actual != null && actual.dato != valorEliminar) {
	        anterior = actual;
	        actual = actual.siguiente;
	    }

	    if (actual == null) {
	        System.out.println("El nodo con el valor ingresado no existe en la lista.\n");
	    } else {
	        anterior.siguiente = actual.siguiente; // Desvincular el nodo de la lista
	        System.out.println("Nodo eliminado correctamente.\n");
	    }
	}

	private static void ordenar_nodo() {
		 if (cabeza == null || cabeza.siguiente == null) {
		        System.out.println("La lista está vacía o tiene solo un nodo. No hay nada que ordenar.\n");
		        return;
		    }

		    boolean cambiado;
		    do {
		        cambiado = false;
		        Nodo actual = cabeza;
		        while (actual.siguiente != null) {
		            if (actual.dato > actual.siguiente.dato) {
		                int temp = actual.dato;					// Intercambiar valores (no nodos, solo datos)
		                actual.dato = actual.siguiente.dato;
		                actual.siguiente.dato = temp;
		                cambiado = true;
		            }
		            actual = actual.siguiente;
		        }
		    } while (cambiado);

		    System.out.println("Lista ordenada correctamente.\n");
	
	}
	private static void agregar_nodo_final() {
		 int nuevoDato;

		    while (true) {
		        System.out.print("Ingrese el valor del nodo: ");
		        if (scanner.hasNextInt()) {
		            nuevoDato = scanner.nextInt();
		            scanner.nextLine(); 						// Limpiar el buffer del scanner
		            break;
		        } else {
		            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
		            scanner.nextLine(); 						// Limpiar la entrada incorrecta
		        }
		    }

		    Nodo nuevoNodo = new Nodo(nuevoDato);

		    if (cabeza == null) {
		        cabeza = nuevoNodo;
		    } else {
		        Nodo actual = cabeza;
		        while (actual.siguiente != null) {
		            actual = actual.siguiente;
		        }
		        actual.siguiente = nuevoNodo;
		    }

		    System.out.println("Nodo agregado al final correctamente.\n");
	}
	
	private static void listar_nodo() {
		 if (cabeza == null) {
		        System.out.println("La lista está vacía.");
		        return;
		    }

		    Nodo actual = cabeza;
		    System.out.println("Elementos en la lista:");
		    while (actual != null) {						//con el while recorremos he imprimimos el dato
		        System.out.print(actual.dato + " -> ");
		        actual = actual.siguiente;
		    }
		    System.out.println("Final\n"); 					// Indicar el final de la lista
		}
private static void vaciar_nodo() {
	    cabeza = null;										//Al eliminar la cabeza se elimina toda la lista 
	    System.out.println("La lista ha sido vaciada.\n");
	}
}
