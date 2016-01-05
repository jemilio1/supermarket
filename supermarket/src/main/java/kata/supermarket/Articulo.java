package kata.supermarket;

import kata.supermarket.descuentos.Descuentos;

public class Articulo {
	private String nombre;
	private Descuentos descuento;
	
	public Articulo(String nombre){
		this.nombre = nombre;
	}
	
	public Articulo(String nombre, Descuentos descuento){
		this.nombre = nombre;
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double devolverTotal(int cantidad){
		return descuento.devolverPrecio(cantidad);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
