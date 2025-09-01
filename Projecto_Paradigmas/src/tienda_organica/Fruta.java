package tienda_organica;

class Fruta extends Producto_Organico {
																// Atributos adicionales específicos de Fruta
    private String tipoFruta;

    															// Constructor
    public Fruta(String nombre, String tipo, double precio, String tipoFruta) {
        super(nombre, tipo, precio);
        this.tipoFruta = tipoFruta;
    }

    															// Método para calcular el precio con descuento
    public double calcularPrecioConDescuento(int cantidad) {
    															// Definir el límite para aplicar el descuento
        int limiteDescuento = 12; 								// Cambia este valor según tu necesidad

        														// Aplicar descuento del 10% si la cantidad es mayor que el límite
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