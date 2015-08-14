public class Main{
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber() ;
		StockObserver observer1 = new StockObserver(stockGrabber) ;

		stockGrabber.setIBMPrice(197.00) ;
		stockGrabber.setAAPLPrice(677.00) ;
		stockGrabber.setGOOGPrice(614.00) ;

		StockObserver observer2 = new StockObserver(stockGrabber) ;
		stockGrabber.setIBMPrice(197.00) ;
		stockGrabber.setAAPLPrice(677.00) ;
		stockGrabber.setGOOGPrice(614.00) ;

		stockGrabber.unregister(observer1) ;
		stockGrabber.setIBMPrice(197.00) ;
		stockGrabber.setAAPLPrice(677.00) ;
		stockGrabber.setGOOGPrice(614.00) ;


		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 193.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 183.00);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 143.00);

		new Thread(getIBM).start() ; 
		new Thread(getAAPL).start() ;
		new Thread(getGOOG).start() ;
	}
}
