package Code;

public class CentiM implements Quantity{

	private double value;

	public CentiM(double value) {
		super();
		this.value = value;
	}
	
	
	public double ToCenti()
	{
		return value;
	}


	@Override
	public double FromCenti() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
