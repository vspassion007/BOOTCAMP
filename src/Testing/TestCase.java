package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.CentiM;
import Code.Foot;
import Code.Inch;
import Code.Material;
import Code.Meter;
import Code.Quantity;
import Code.Yard;

public class TestCase {

	@Test
	public void shouldQuantityEqual() {
		Quantity met = new Meter(2.0);
		Quantity centi = new CentiM(200.0);

		Quantity met2 = new Meter(2000.0);
		Material material = new Material();

		assertEquals(true, material.quantityEqual(met, centi));

	}

	@Test
	public void shouldQuantityUnEqual() {
		Quantity met = new Meter(100.0);
		Quantity centi = new CentiM(200.0);

		Material material = new Material();

		assertEquals(false, material.quantityEqual(met, centi));
	}

	@Test
	public void shouldConvertToFoot() {
		Quantity met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.convertQuantity(met, new Foot()) instanceof Foot);
	}

	@Test
	public void shouldConvertToInch() {
		Quantity met = new Meter(1.0);
		Material material = new Material();

		assertEquals(true, material.quantityEqual(material.convertQuantity(met, new CentiM()), new CentiM(100.0)));
	}

	@Test
	public void shouldConvertToYard() {
		Quantity met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.convertQuantity(met, new Yard()) instanceof Yard);
	}
	
	

}
