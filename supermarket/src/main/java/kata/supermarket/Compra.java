package kata.supermarket;

import java.util.List;

import kata.supermarket.exceptions.ArticuloNoEncontradoException;

public class Compra {
	private ListadoProductos productos = new ListadoProductos();
	
	public double obtenerPrecioArticulo(String nombreArticulo, int cantidad) throws ArticuloNoEncontradoException {
		try {
			Articulo articulo = buscarArticulo(nombreArticulo);
			return articulo.devolverTotal(cantidad);
		} catch (Exception e) {
			throw new ArticuloNoEncontradoException();
		}
	}

	private Articulo buscarArticulo(String nombreArticulo) {
		List<Articulo> listadoProductos = productos.obtenerArticulos();
		return listadoProductos.get(listadoProductos.lastIndexOf(new Articulo(nombreArticulo)));
	}
}
