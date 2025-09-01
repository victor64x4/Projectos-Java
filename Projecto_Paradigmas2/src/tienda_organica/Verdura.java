package tienda_organica;

class Verdura extends Producto_Organico {
	 
	private String tipoVerdura;

	    															// Constructor
	    public Verdura(String nombre, String tipo, double precio, String tipoVerdura) {
	        super(nombre, tipo, precio);
	        this.tipoVerdura = tipoVerdura;
	    }

	    public double calcularPrecioConDescuento(int cantidad) {
																	// Definir el límite para aplicar el descuento
	    	int limiteDescuento = 12; 								// Cambia este valor según tu necesidad
	    															// Aplicar descuento del 10% si la cantidad es mayor que el límite
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