package Code;

public class CentiM implements QuantityLength {

	private double value;

	public CentiM() {
	}

	public CentiM(double value) {
		super();
		this.value = value;
	}

	public double toBaseUnit() {
		return value;
	}

	@Override
	public QuantityLength convertFrom(QuantityLength toObjVal) {
		return new CentiM(toObjVal.toBaseUnit());
	}

	@Override
	public QuantityLength addThis(QuantityLength toObjVal) {
		return new CentiM(this.toBaseUnit()+toObjVal.toBaseUnit());
	}

}
