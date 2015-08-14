public class TestCloning {
	public static void main(String[] args) {
		CloneFactory animalMaker = new CloneFactory() ;

		Sheep sally = new Sheep() ;

		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally) ;

		System.out.println(sally) ;
		System.out.println(clonedSheep) ;

		System.out.println("Sally Hashcode: " + System.identityHashCode(sally)) ;
		System.out.println("Clone Hashcode: " + System.identityHashCode(clonedSheep)) ;
	}
}
