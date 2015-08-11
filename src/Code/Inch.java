package Code;

public class Inch implements QuantityLength {

	private double value;
	private final double Factor_ToCenti = 2.53;

	public Inch() {
	}

	public Inch(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return value * Factor_ToCenti;
	}

	@Override
	public QuantityLength convertFrom(QuantityLength toObjVal) {
		return new Inch(toObjVal.toBaseUnit() / Factor_ToCenti);
	}

	@Override
	public QuantityLength addThis(QuantityLength toObjVal) {
		return new Inch( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToCenti);
	}

}
