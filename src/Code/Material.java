package Code;

public class Material {

	public boolean quantityEqual(QuantityLength first, QuantityLength second) {
		return first.toBaseUnit() == second.toBaseUnit();
	}

	public QuantityLength convertQuantity(QuantityLength first, QuantityLength second) {
		return second.convertFrom(first);
	}
	
	public QuantityLength addQuantity(QuantityLength first, QuantityLength second) {
		return first.addThis(second);
	}
}
