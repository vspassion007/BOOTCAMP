package Code;

public class Foot implements QuantityLength {

	private double value;
	private final double Factor_ToCenti = 30.36;

	public Foot() {
	}

	public Foot(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return value * Factor_ToCenti;
	}

	@Override
	public QuantityLength convertFrom(QuantityLength toObjVal) {
		return new Foot(toObjVal.toBaseUnit() / Factor_ToCenti);
	}

	@Override
	public QuantityLength addThis(QuantityLength toObjVal) {
		return new Foot( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToCenti);
	}

}
