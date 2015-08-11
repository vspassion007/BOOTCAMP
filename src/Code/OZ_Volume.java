package Code;

public class OZ_Volume implements QuantityVolume{
	private double value;
	private final double Factor_ToTSP = 6.00;
	@Override
	public double toBaseUnit() {
		return value*Factor_ToTSP;
	}
	public OZ_Volume(){}
	public OZ_Volume(double value) {
		super();
		this.value = value;
	}
	@Override
	public QuantityVolume convertFrom(QuantityVolume toObjVal) {
		return new OZ_Volume(toObjVal.toBaseUnit() / Factor_ToTSP);
	}
	@Override
	public QuantityVolume addThis(QuantityVolume toObjVal) {
		return new OZ_Volume( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToTSP);
	}
}
