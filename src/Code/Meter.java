package Code;

public class Meter implements Quantity{

	private double value;
	private final double Factor_CentiToMeter = 100.0;

	
	public Meter(double value) {
		super();
		this.value = value;
	}
	
	public double ToCenti()
	{
		return value*Factor_CentiToMeter;
	}

	@Override
	public double FromCenti() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
