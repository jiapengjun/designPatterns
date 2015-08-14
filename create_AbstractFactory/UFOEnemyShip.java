public class UFOEnemyShip extends EnemyShip {
	EnemyShipFactory shipFactory ;

	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}

	void makeShip() {
		System.out.println("Makeing enemy ship " + getName()) ;

		weapon = shipFactory.addESGun() ;
		engine = shipFactory.addESEngine() ;
	}
}
