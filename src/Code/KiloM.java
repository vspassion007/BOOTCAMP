package Code;

public class KiloM implements Quantity{

	private double value;
	private final double Factor_CentiToKiloMeter = 100000.0;

	public KiloM(double value) {
		super();
		this.value = value;
	}
	public double ToCenti()
	{
		return value*Factor_CentiToKiloMeter;
	}
	@Override
	public double FromCenti() {
		// TODO Auto-generated method stub
		return 0;
	}
}
