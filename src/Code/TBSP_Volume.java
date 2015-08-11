package Code;

public class TBSP_Volume implements QuantityVolume{
	private double value;
	private final double Factor_ToTSP = 3.00;
	@Override
	public double toBaseUnit() {		
		return value*Factor_ToTSP;
	}
	public TBSP_Volume(){}
	public TBSP_Volume(double value) {
		super();
		this.value = value;
	}
	@Override
	public QuantityVolume convertFrom(QuantityVolume toObjVal) {
		return new TBSP_Volume(toObjVal.toBaseUnit() / Factor_ToTSP);
	}
	@Override
	public QuantityVolume addThis(QuantityVolume toObjVal) {
		return new TBSP_Volume( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToTSP);
	}
}
