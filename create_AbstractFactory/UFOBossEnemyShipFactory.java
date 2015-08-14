public class UFOBossEnemyShipFactory implements EnemyShipFactory {
	public ESWeapon addESGun() {
		return new ESUFOGun() ;
	}

	public ESEngine addESEngine() {
		return new ESUFOEngine(); 
	}
}
