package Code;

public class Material {

	public boolean quantityEqual(Quantity first, Quantity second) {
		return first.toCenti() == second.toCenti();
	}

	public Quantity convertQuantity(Quantity first, Quantity second) {
		return second.convertFrom(first);
	}
	
	public Quantity addQuantity(Quantity first, Quantity second) {
		return first.addThis(second);
	}
}
