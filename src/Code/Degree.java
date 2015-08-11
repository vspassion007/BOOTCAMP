package Code;

public class Degree implements QuantityTemperature{
	private double value;

	public Degree(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toBaseUnit() {		
		return value;
	}

	@Override
	public QuantityTemperature convertFrom(QuantityTemperature toObjVal) {
		
		return new Degree(toObjVal.toBaseUnit());
	}

}