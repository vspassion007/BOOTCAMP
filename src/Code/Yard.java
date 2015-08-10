package Code;

public class Yard implements Quantity {

	private double value;
	private final double Factor_ToCenti = 91.08;

	public Yard() {
	}

	public Yard(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toCenti() {
		return value * Factor_ToCenti;
	}

	@Override
	public Quantity convertFrom(Quantity toObjVal) {
		return new Yard(toObjVal.toCenti() / Factor_ToCenti);
	}

}
