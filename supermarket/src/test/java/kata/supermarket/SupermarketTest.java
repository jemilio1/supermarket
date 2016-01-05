package kata.supermarket;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import kata.supermarket.exceptions.ArticuloNoEncontradoException;

/**
 * Unit test for simple App.
 */
public class SupermarketTest 
{
	private Compra compra;
	@Before
	public void inic(){
		compra = new Compra();
	}
	@Test
	public void testCompra1Articulo() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("A", 1), 50.0);
	}
	@Test
	public void testCompra2Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("A", 2), 50.0);
	}
	@Test
	public void testCompra3Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("A", 3), 100.0);
	}
	@Test
	public void testCompra4Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("A", 4), 100.0);
	}
	@Test
	public void testCompra5Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("A", 5), 150.0);
	}
	@Test
	public void testCompra15Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra15Articulos",compra.obtenerPrecioArticulo("A", 15), 400.0);
	}
	@Test
	public void testCompra1ArticuloB() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1ArticuloB", compra.obtenerPrecioArticulo("B", 1),60.0);
	}
	@Test
	public void testCompra2ArticuloB() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1ArticuloB", compra.obtenerPrecioArticulo("B", 2),120.0);
	}
	@Test
	public void testCompra3ArticuloB() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1ArticuloB", compra.obtenerPrecioArticulo("B", 3),60.0);
	}
	@Test
	public void testCompra4ArticuloB() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1ArticuloB", compra.obtenerPrecioArticulo("B", 4),120.0);
	}
	@Test
	public void testCompraDescuento5p() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompraDescuento5p",compra.obtenerPrecioArticulo("C", 5), 25.0);
	}
	@Test(expected=ArticuloNoEncontradoException.class)
	public void testArticuloNoEncontrado() throws ArticuloNoEncontradoException{
		compra.obtenerPrecioArticulo("W",5);
	}
}
