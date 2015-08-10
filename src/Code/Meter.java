package Code;

public class Meter implements Quantity {

	private double value;
	private final double Factor_ToCenti = 100.0;

	public Meter() {
	}

	public Meter(double value) {
		super();
		this.value = value;
	}

	public double toCenti() {
		return value * Factor_ToCenti;
	}

	@Override
	public Quantity convertFrom(Quantity toObjVal) {
		return new Meter(toObjVal.toCenti() / Factor_ToCenti);
	}

	@Override
	public Quantity addThis(Quantity toObjVal) {
		return new Meter( (this.toCenti()+toObjVal.toCenti()) / Factor_ToCenti);
	}

}
