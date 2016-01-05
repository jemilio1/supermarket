package kata.supermarket.descuentos.comparador;
import java.util.Comparator;

import kata.supermarket.descuentos.DescuentoCantidad;

public class CriterioOrdenacionDescuentos implements Comparator<DescuentoCantidad> {

	public int compare(DescuentoCantidad descuentoCantidad1, DescuentoCantidad descuentoCantidad2) {
		return -1*Integer.compare(descuentoCantidad1.getCantidad(), descuentoCantidad2.getCantidad());
	}

}
