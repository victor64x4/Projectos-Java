package tienda_organica;

class Fruta extends Producto_Organico {
																// Atributos adicionales espec�ficos de Fruta
    private String tipoFruta;

    															// Constructor
    public Fruta(String nombre, String tipo, double precio, String tipoFruta) {
        super(nombre, tipo, precio);
        this.tipoFruta = tipoFruta;
    }

    															// M�todo para calcular el precio con descuento
    public double calcularPrecioConDescuento(int cantidad) {
    															// Definir el l�mite para aplicar el descuento
        int limiteDescuento = 12; 								// Cambia este valor seg�n tu necesidad

        														// Aplicar descuento del 10% si la cantidad es mayor que el l�mite
        if (cantidad > limiteDescuento) {
            double descuento = (getPrecio() * cantidad) * 0.10;
            return getPrecio() * cantidad - descuento;
        } else {
            return getPrecio() * cantidad;
        }
    }

    															// Getters y setters para el atributo tipoFruta
    public String getTipoFruta() {
        return tipoFruta;
    }

    public void setTipoFruta(String tipoFruta) {
        this.tipoFruta = tipoFruta;
    }
}