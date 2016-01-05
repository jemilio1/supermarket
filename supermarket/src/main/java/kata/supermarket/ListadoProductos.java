package kata.supermarket;

import java.util.ArrayList;
import java.util.List;

import kata.supermarket.descuentos.DescuentoCantidad;
import kata.supermarket.descuentos.DescuentosPorRango;
import kata.supermarket.descuentos.Porcentajes;

public class ListadoProductos {
	private List<Articulo> articulos;

	public ListadoProductos() {
		articulos = new ArrayList<Articulo>(3);
		articulos.add(new Articulo("A",new DescuentosPorRango(new DescuentoCantidad(2, 50),50)));
		articulos.add(new Articulo("B",new DescuentosPorRango(new DescuentoCantidad(3,60),60)));
		articulos.add(new Articulo("C",new Porcentajes(10,50)));
		List<DescuentoCantidad> descuentos  = new ArrayList<DescuentoCantidad>();
		descuentos.add(new DescuentoCantidad(2,50));
		descuentos.add(new DescuentoCantidad(6,40));
		articulos.add(new Articulo("D", new DescuentosPorRango(descuentos, 50)));
	}
	public List<Articulo> obtenerArticulos(){
		return articulos;
	}
}