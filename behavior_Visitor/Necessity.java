
public class Necessity implements Visitable{
	
	private double price;
	
	Necessity(double item) {
		price = item ;
	}

	public double getPrice() {
		return price ;
	}	
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this); 
	}	
}
