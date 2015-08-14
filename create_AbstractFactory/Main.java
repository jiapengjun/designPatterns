public class Main {
	public static void main(String[] args) {
		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding() ;

		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO") ;
		System.out.println(theGrunt + "\n") ;

		EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS") ;
		System.out.println(theBoss + "\n") ;
	}
}

