package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.CentiM;
import Code.Foot;
import Code.Inch;
import Code.Material;
import Code.Meter;
import Code.QuantityLength;
import Code.Yard;

public class TestCase {

	@Test
	public void shouldQuantityEqual() {
		QuantityLength met = new Meter(2.0);
		QuantityLength centi = new CentiM(200.0);

		QuantityLength met2 = new Meter(2000.0);
		Material material = new Material();

		assertEquals(true, material.quantityEqual(met, centi));

	}

	@Test
	public void shouldQuantityUnEqual() {
		QuantityLength met = new Meter(100.0);
		QuantityLength centi = new CentiM(200.0);

		Material material = new Material();

		assertEquals(false, material.quantityEqual(met, centi));
	}

	@Test
	public void shouldConvertToFoot() {
		QuantityLength met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.convertQuantity(met, new Foot()) instanceof Foot);
	}

	@Test
	public void shouldConvertToInch() {
		QuantityLength met = new Meter(1.0);
		Material material = new Material();

		assertEquals(true, material.quantityEqual(material.convertQuantity(met, new CentiM()), new CentiM(100.0)));
	}

	@Test
	public void shouldConvertToYard() {
		QuantityLength met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.convertQuantity(met, new Yard()) instanceof Yard);
	}
	
	@Test
	public void shouldaddMeterAndYard() {
		QuantityLength met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new Yard(100)) instanceof Meter);
	}
	@Test
	public void shouldaddMeterAndInch() {
		QuantityLength met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new Inch(100)) instanceof Meter);
	}
	@Test
	public void shouldaddMeterAndFoot() {
		QuantityLength met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new Foot(100)) instanceof Meter);
	}
	@Test
	public void shouldaddMeterAndCenti() {
		QuantityLength met = new Meter(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(met, new CentiM(100)) instanceof Meter);
	}
	@Test
	public void shouldaddCentiAndFoot() {
		QuantityLength cen = new CentiM(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(cen, new Foot(100)) instanceof CentiM);
	}
	@Test
	public void shouldaddCentiAndInch() {
		QuantityLength cen = new CentiM(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(cen, new Inch(100)) instanceof CentiM);
	}
	@Test
	public void shouldaddCentiAndYard() {
		QuantityLength cen = new CentiM(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(cen, new Yard(100)) instanceof CentiM);
	}
	@Test
	public void shouldaddFootAndInch() {
		QuantityLength foot = new Foot(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(foot, new Inch(100)) instanceof Foot);
	}
	@Test
	public void shouldaddFootAndYard() {
		QuantityLength foot = new Foot(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(foot, new Yard(100)) instanceof Foot);
	}
	@Test
	public void shouldaddInchAndYard() {
		QuantityLength in = new Inch(100.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(in, new Yard(100)) instanceof Inch);
	}
	@Test
	public void shouldaddYardAndCenti() {
		QuantityLength yard = new Yard(1.0);
		Material material = new Material();

		assertEquals(true,material.addQuantity(yard, new CentiM(100)) instanceof Yard);
	}
	

}
