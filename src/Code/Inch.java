package Code;

public class Inch implements Quantity {

	private double value;
	private final double Factor_ToCenti = 2.53;

	public Inch() {
	}

	public Inch(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toCenti() {
		return value * Factor_ToCenti;
	}

	@Override
	public Quantity convertFrom(Quantity toObjVal) {
		return new Inch(toObjVal.toCenti() / Factor_ToCenti);
	}

	@Override
	public Quantity addThis(Quantity toObjVal) {
		return new Inch( (this.toCenti()+toObjVal.toCenti()) / Factor_ToCenti);
	}

}
