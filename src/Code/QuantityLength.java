package Code;

public interface QuantityLength{

	public double toBaseUnit();
	public QuantityLength convertFrom(QuantityLength toObjVal);
	public QuantityLength addThis(QuantityLength toObjVal);
	default boolean isEqualQuntity(QuantityLength other)
	{
		return this.toBaseUnit()==other.toBaseUnit();
	}
}
