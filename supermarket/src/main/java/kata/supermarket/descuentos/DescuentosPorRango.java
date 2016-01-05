package kata.supermarket.descuentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kata.supermarket.descuentos.comparador.CriterioOrdenacionDescuentos;

public class DescuentosPorRango extends Descuentos{
	private List<DescuentoCantidad> descuentoCantidad;
	private double precioUnitario;
	
	public DescuentosPorRango(DescuentoCantidad descuentoCantidad, double precioUnitario){
		this.descuentoCantidad = new ArrayList<DescuentoCantidad>();
		this.descuentoCantidad.add(descuentoCantidad);
		this.precioUnitario = precioUnitario;
		
	}
	public DescuentosPorRango(List<DescuentoCantidad> descuentoCantidad, double precioUnitario){
		this.descuentoCantidad = descuentoCantidad;
		Collections.sort(this.descuentoCantidad,new CriterioOrdenacionDescuentos());
		this.precioUnitario = precioUnitario;
	}
	
	@Override
	public double devolverPrecio(int cantidad){
		int cantidadRestante = cantidad;
		int precio = 0;
		for (DescuentoCantidad tipoDescuento : descuentoCantidad) {
			if(tipoDescuento.getCantidad() <= cantidadRestante){
				precio += devolverPrecioConDescuento(cantidadRestante, tipoDescuento);
				cantidadRestante = cantidadRestante % tipoDescuento.getCantidad();
			}
		}
		return precio+devolverPrecioNormal(cantidadRestante);
	}

	private double devolverPrecioConDescuento(int cantidad, DescuentoCantidad tipoDescuento) {
		return (cantidad/tipoDescuento.getCantidad())*tipoDescuento.getPrecio();
	}
	
	private double devolverPrecioNormal(int cantidad) {
		return (cantidad)*precioUnitario;
	}
}
