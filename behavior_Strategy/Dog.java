public class Dog extends Animal {
	public void digHole() {
		System.out.println("Dug a hore") ;
	}

	public Dog() {
		super();
		setSound("Bark") ;
		flyingType = new CantFly() ;
	}


}
