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

    																			// Método para mostrar la lista de frutas
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
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("¿Opciones de Inventario?");
	        System.out.println("");
	        System.out.println("1. Frutas");
	        System.out.println("2. Verduras");
	        System.out.println("3. Lista Completa");
	        System.out.println("");
	        System.out.print("Ingrese su opción: ");
	        int opcion = scanner.nextInt();
	        scanner.nextLine(); 												// Limpiar el buffer del scanner
	        if (opcion == 1) {
	            mostrarFrutas(frutas);
	        } else if (opcion == 2) {
	            mostrarVerduras(verduras);
	        } else if (opcion == 3) {
	            mostrarTodo(frutas, verduras);
	        } else {
	            System.out.println("Opción inválida.");
	        }
	 }																			// Método para mostrar la lista de frutas
    private static void mostrarFrutas(List<Fruta> frutas) {
        System.out.println("Lista de frutas:");
        System.out.println("");
        for (Fruta producto : frutas) {
            if (producto instanceof Fruta) {
                System.out.println("Nombre: " + producto.getNombre() +
                        ", Tipo: " + producto.getTipo() +
                        ", Precio: $" + producto.getPrecio() + " Tipo de Fruta:" + producto.getTipoFruta() );
            }
        }
    }

    																			// Método para mostrar la lista de verduras
    private static void mostrarVerduras(List<Verdura> verduras) {
        System.out.println("Lista de verduras:");
        System.out.println("");
        for (Verdura producto : verduras) {
            if (producto instanceof Verdura) {
                System.out.println("Nombre: " + producto.getNombre() +
                        ", Tipo: " + producto.getTipo() +
                        ", Precio: $" + producto.getPrecio() + " Tipo de Verdura:" + producto.getTipoVerdura());
            }
        }
    }
    private static void mostrarTodo(List<Fruta> frutas, List<Verdura> verduras) {
    	System.out.println("");													// Mostrar la lista de frutas
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
    																					// Método para agregar un producto
    private static void agregarProducto(List<Fruta> frutas, List<Verdura> verduras) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de producto desea agregar?");
        System.out.println("");
        System.out.println("1. Fruta");
        System.out.println("2. Verdura");
        System.out.println("");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 															// Limpiar el buffer del scanner
        if (opcion == 1) {
            agregarFruta(frutas);
        } else if (opcion == 2) {
            agregarVerdura(verduras);
        } else {
            System.out.println("Opción inválida.");
           
        }
    }

    																					// Método para agregar una fruta
    private static void agregarFruta(List<Fruta> frutas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la fruta: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio de la fruta: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tipo de fruta (secos, citrico, neutro): ");
        scanner.nextLine(); 															// Limpiar el buffer del scanner
        String tipoFruta = scanner.nextLine();
        frutas.add(new Fruta(nombre, "Fruta", precio, tipoFruta));
        System.out.println("Fruta agregada correctamente.");
        
    }

    																					// Método para agregar una verdura
    private static void agregarVerdura(List<Verdura> verduras) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la verdura: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio de la verdura: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tipo de verdura (hoja, tallo, habas): ");
        scanner.nextLine(); 															// Limpiar el buffer del scanner
        String tipoVerdura = scanner.nextLine();
        verduras.add(new Verdura(nombre, "Verdura", precio, tipoVerdura));
        System.out.println("Verdura agregada correctamente.");
        
    }
    private static void buscarProducto(List<Fruta> frutas, List<Verdura> verduras) {
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
    private static void eliminarProducto(List<Fruta> frutas, List<Verdura> verduras) {
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
 
    private static void realizarCompra(List<Fruta> frutas, List<Verdura> verduras) {
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
        	total = Math.round(total * 100.0) / 100.0;
            System.out.println("Cantidad comprada: " + cantidadComprada);
            System.out.println("El total a pagar es: $" + total);
        }
    }
}