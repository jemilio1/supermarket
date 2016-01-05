package kata.supermarket;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import kata.supermarket.exceptions.ArticuloNoEncontradoException;

/**
 * Unit test for simple App.
 */
public class SupermarketTestRangos 
{
	private Compra compra;
	@Before
	public void inic(){
		compra = new Compra();
	}
	@Test
	public void testCompra1Articulo() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("D", 1), 50.0);
	}
	@Test
	public void testCompra2Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("D", 2), 50.0);
	}
	@Test
	public void testCompra3Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("D", 3), 100.0);
	}
	@Test
	public void testCompra4Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("D", 4), 100.0);
	}
	@Test
	public void testCompra5Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("D", 5), 150.0);
	}
	@Test
	public void testCompra6Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("D", 6), 40.0);
	}
	@Test
	public void testCompra7Articulos() throws ArticuloNoEncontradoException{
		Assert.assertEquals("testCompra1Articulo",compra.obtenerPrecioArticulo("D", 7), 90.0);
	}
}
