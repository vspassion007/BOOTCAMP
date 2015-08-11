package Code;

public interface QuantityVolume{
	public double toBaseUnit();
	public QuantityVolume convertFrom(QuantityVolume toObjVal);
	public QuantityVolume addThis(QuantityVolume toObjVal);
	default boolean isEqualQuntity(QuantityVolume other)
	{
		return this.toBaseUnit()==other.toBaseUnit();
	}
}
