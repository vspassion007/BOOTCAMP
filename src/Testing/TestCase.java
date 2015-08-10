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
	
	@Test
	public void shouldaddMeterAndYard() {
		Quantity met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new Yard(100)) instanceof Meter);
	}
	@Test
	public void shouldaddMeterAndInch() {
		Quantity met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new Inch(100)) instanceof Meter);
	}
	@Test
	public void shouldaddMeterAndFoot() {
		Quantity met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new Foot(100)) instanceof Meter);
	}
	@Test
	public void shouldaddMeterAndCenti() {
		Quantity met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new CentiM(100)) instanceof Meter);
	}
	@Test
	public void shouldaddCentiAndFoot() {
		Quantity cen = new CentiM(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(cen, new Foot(100)) instanceof CentiM);
	}
	@Test
	public void shouldaddCentiAndInch() {
		Quantity cen = new CentiM(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(cen, new Inch(100)) instanceof CentiM);
	}
	@Test
	public void shouldaddCentiAndYard() {
		Quantity cen = new CentiM(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(cen, new Yard(100)) instanceof CentiM);
	}
	@Test
	public void shouldaddFootAndInch() {
		Quantity foot = new Foot(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(foot, new Inch(100)) instanceof Foot);
	}
	@Test
	public void shouldaddFootAndYard() {
		Quantity foot = new Foot(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(foot, new Yard(100)) instanceof Foot);
	}
	@Test
	public void shouldaddInchAndYard() {
		Quantity in = new Inch(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(in, new Yard(100)) instanceof Inch);
	}
	@Test
	public void shouldaddYardAndCenti() {
		Quantity yard = new Yard(1.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(yard, new CentiM(100)) instanceof Yard);
	}
	

}
