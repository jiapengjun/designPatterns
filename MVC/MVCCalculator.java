
public class MVCCalculator {

	public static void main(String[] args) {
		
		CalculatorView theView = new CalculatorView() ;
		
		CalculatorModel theModel = new CalculatorModel() ;

		@SuppressWarnings("unused")
		CalculatorController theController = new CalculatorController(theView, theModel) ;
		 
		theView.setVisible(true);
	}

}
