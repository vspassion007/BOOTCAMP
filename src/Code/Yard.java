package Code;

public class Yard implements QuantityLength {

	private double value;
	private final double Factor_ToCenti = 91.08;

	public Yard() {
	}

	public Yard(double value) {
		super();
		this.value = value;
	}

	@Override
	public double toBaseUnit() {
		return value * Factor_ToCenti;
	}

	@Override
	public QuantityLength convertFrom(QuantityLength toObjVal) {
		return new Yard(toObjVal.toBaseUnit() / Factor_ToCenti);
	}

	@Override
	public QuantityLength addThis(QuantityLength toObjVal) {
		System.out.println((this.toBaseUnit()+toObjVal.toBaseUnit())/ Factor_ToCenti);
		return new Yard( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToCenti);
	}

}
