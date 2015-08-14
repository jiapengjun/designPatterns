public class ItalianHoagie extends Hoagie {

	String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
	String[] cheeseUsed = {"Provolone"};
	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = {"Oil", "Vinegar"};
	
	@Override
	void addMeat() {
		System.out.print("Adding the Meat: ");
		for (String meat : meatUsed) {
			System.out.print(meat + " ") ;
		}
		
	}

	@Override
	void addCheese() {
		System.out.print("Adding the Cheese: ");
		for (String cheese : cheeseUsed) {
			System.out.print(cheese + " ") ;
		}
				
	}

	@Override
	void addVegetables() {
		System.out.print("Adding the Veggies: ");
		for (String veggie : veggiesUsed) {
			System.out.print(veggie + " ") ;
		}
				
	}

	@Override
	void addCondiments() {
		System.out.print("Adding the Condiments: ");
		for (String condiment : condimentsUsed) {
			System.out.print(condiment + " ") ;
		}		
	}
	
}
