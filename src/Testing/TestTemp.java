package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.Degree;
import Code.Fahrenheit;
import Code.QuantityTemperature;

public class TestTemp {

	@Test
	public void shouldEqualTemp() {
		QuantityTemperature deg = new Degree(0);
		QuantityTemperature fah = new Fahrenheit(32);
		assertEquals(true, deg.isEqualQuntity(fah));
	}
	@Test
	public void shouldConvertTemp() {
		QuantityTemperature deg = new Degree(100);
		QuantityTemperature fah = new Fahrenheit(32);
		assertEquals(true, fah.convertFrom(deg) instanceof Fahrenheit);
	}
	@Test
	public void shouldConvertTempNew() {
		QuantityTemperature deg = new Degree(23);
		QuantityTemperature fah = new Fahrenheit(32);
		assertEquals(true, fah.convertFrom(deg) instanceof Fahrenheit);
	}
}
