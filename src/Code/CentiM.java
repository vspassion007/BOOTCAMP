package Code;

public class CentiM implements Quantity {

	private double value;

	public CentiM() {
	}

	public CentiM(double value) {
		super();
		this.value = value;
	}

	public double toCenti() {
		return value;
	}

	@Override
	public Quantity convertFrom(Quantity toObjVal) {
		return new CentiM(toObjVal.toCenti());
	}

	@Override
	public Quantity addThis(Quantity toObjVal) {
		return new CentiM(this.toCenti()+toObjVal.toCenti());
	}

}
