package tienda_organica;

class Verdura extends Producto_Organico {
	 
	private String tipoVerdura;

	    															// Constructor
	    public Verdura(String nombre, String tipo, double precio, String tipoVerdura) {
	        super(nombre, tipo, precio);
	        this.tipoVerdura = tipoVerdura;
	    }

	    public double calcularPrecioConDescuento(int cantidad) {
																	// Definir el l�mite para aplicar el descuento
	    	int limiteDescuento = 12; 								// Cambia este valor seg�n tu necesidad
	    															// Aplicar descuento del 10% si la cantidad es mayor que el l�mite
	    	if (cantidad >= limiteDescuento) {
	    		double descuento = (getPrecio() * cantidad) * 0.10;
	    		return getPrecio() * cantidad - descuento;
	    	} 
	    	else 
	    	{
	    		return getPrecio() * cantidad;
	    	}
}
	    
		public String getTipoVerdura() {
			return tipoVerdura;
		}

		public void setTipoVerdura(String tipoVerdura) {
			this.tipoVerdura = tipoVerdura;
		}
}