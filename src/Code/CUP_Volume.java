package Code;

public class CUP_Volume implements QuantityVolume{
	private double value;
	private final double Factor_ToTSP = 48.00;
	@Override
	public double toBaseUnit() {
		return value*Factor_ToTSP;
	}
	public CUP_Volume(){}
	public CUP_Volume(double value) {
		super();
		this.value = value;
	}
	@Override
	public QuantityVolume convertFrom(QuantityVolume toObjVal) {
		System.out.println(toObjVal.toBaseUnit() / Factor_ToTSP);
		return new CUP_Volume(toObjVal.toBaseUnit() / Factor_ToTSP);
	}
	@Override
	public QuantityVolume addThis(QuantityVolume toObjVal) {
		return new CUP_Volume( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToTSP);
	}
}
