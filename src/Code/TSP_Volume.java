package Code;

public class TSP_Volume implements QuantityVolume {
	private double value;
	private final double Factor_ToTSP = 1.00;
	@Override
	public double toBaseUnit() {		
		return value*Factor_ToTSP;
	}
	public TSP_Volume(){}
	public TSP_Volume(double value) {
		super();
		this.value = value;
	}
	@Override
	public QuantityVolume convertFrom(QuantityVolume toObjVal) {
		return new TSP_Volume(toObjVal.toBaseUnit() / Factor_ToTSP);
	}
	@Override
	public QuantityVolume addThis(QuantityVolume toObjVal) {		
		return new TSP_Volume( (this.toBaseUnit()+toObjVal.toBaseUnit()) / Factor_ToTSP);
	}

}
