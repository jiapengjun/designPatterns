public class Sheep implements Animal {
	public Sheep() {
		System.out.println("Sheep is Made") ;
	}
	public Animal makeCopy() {
		System.out.println("Sheep is Being Made") ;

		Sheep sheepObject = null ;

		try {
			sheepObject = (Sheep) super.clone() ;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace() ;
		}

		return sheepObject;
	}

	public String toString(){
		return "Dolly is my Hero, Braaa";
	}
}
