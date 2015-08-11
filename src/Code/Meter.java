package Code;

public class Meter implements QuantityLength {

	private double value;
	private final double Factor_ToCenti = 100.0;

	public Meter() {
	}

	public Meter(double value) {
		super();
		this.value = value;
	}

	public double toBaseUnit() {
		return value * Factor_ToCenti;
	}

	@Override
	public QuantityLength convertFrom(QuantityLength toObjVal) {
		return new Meter(toObjVal.toBaseUnit() / Factor_ToCenti);
	}

	@Override
	public QuantityLength addThis(QuantityLength toObjVal) {
		return new Meter( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToCenti);
	}

}
