package kata.supermarket.descuentos;

public class Porcentajes extends Descuentos {
	private double precio;
	private double porcentaje;
	
	public Porcentajes(double precio, double porcentaje){
		this.precio = precio;
		this.porcentaje = porcentaje;	
	}
	
	@Override
	public double devolverPrecio(int cantidad) {
		Double porcentajeCalculado = (double) ((100.0-this.porcentaje)/100.0);
		Double total =(double) ((cantidad*precio)*porcentajeCalculado); 
		return total.intValue();
	}

}
