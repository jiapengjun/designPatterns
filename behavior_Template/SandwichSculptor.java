
public class SandwichSculptor {

	public static void main(String[] args) {
		Hoagie cust12Hoagie = new ItalianHoagie() ;
		cust12Hoagie.makeSandwich(); 
		
		System.out.println();
		
		Hoagie cust13Hoagie = new VeggieHoagie() ;
		cust13Hoagie.makeSandwich(); 
	}

}
