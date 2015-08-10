package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.CentiM;
import Code.KiloM;
import Code.Material;
import Code.Meter;
import Code.Quantity;

public class TestCase {

	@Test
	public void ShouldQuantityEqual() 
	{
		Quantity met= new Meter(2.0);
		Quantity centi= new CentiM(200.0);
		Quantity kilo = new KiloM(2.0);
		Quantity met2 = new Meter(2000.0);
		Material material = new Material();
		
		assertEquals(true, material.quantityEqual(met,centi));
		assertEquals(true, material.quantityEqual(met2,kilo));

		
	}
	@Test
	public void ShouldQuantityUnEqual() 
	{
		Quantity met= new Meter(100.0);
		Quantity centi= new CentiM(200.0);
		
		Material material = new Material();
		
		assertEquals(false, material.quantityEqual(met,centi));
	}
	
	

}
