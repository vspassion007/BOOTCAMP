package Code;

public class Foot implements Quantity {

	private double value;
	private final double Factor_ToCenti = 30.36;

	public Foot() {
	}

	public Foot(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toCenti() {
		return value * Factor_ToCenti;
	}

	@Override
	public Quantity convertFrom(Quantity toObjVal) {
		return new Foot(toObjVal.toCenti() / Factor_ToCenti);
	}

	@Override
	public Quantity addThis(Quantity toObjVal) {
		return new Foot( (this.toCenti()+toObjVal.toCenti()) / Factor_ToCenti);
	}

}
