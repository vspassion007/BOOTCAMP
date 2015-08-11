package Code;

public interface QuantityTemperature {
	public double toBaseUnit();
	public QuantityTemperature convertFrom(QuantityTemperature toObjVal);	
	default boolean isEqualQuntity(QuantityTemperature other)
	{
		return this.toBaseUnit()==other.toBaseUnit();
	}
}
