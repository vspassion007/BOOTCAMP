package Code;

public interface Quantity {
	
	public double toCenti();
	public Quantity convertFrom(Quantity toObjVal);
	public Quantity addThis(Quantity toObjVal);
}
