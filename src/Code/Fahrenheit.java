package Code;

public class Fahrenheit implements QuantityTemperature {

	private double value;
	public Fahrenheit(){}
	public Fahrenheit(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return ((value - 32) * 5) / 9;
	}

	@Override
	public QuantityTemperature convertFrom(QuantityTemperature toObjVal) {
		System.out.println(((toObjVal.toBaseUnit() * 9) / 5) + 32);
		return new Fahrenheit(((toObjVal.toBaseUnit() * 9) / 5) + 32);
	}
}
