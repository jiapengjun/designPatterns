
public class TestStockMediator {

	public static void main(String[] args) {
		StockMediator nyse = new StockMediator() ;
		
		GormanSlacks broker = new GormanSlacks(nyse) ;
		
		broker.saleOffer("MSFT", 100);
		broker.saleOffer("GOOG", 50);
		
		broker.buyOffer("NRG", 10);
		nyse.getStockOfferings();
	}

}
