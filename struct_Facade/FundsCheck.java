
public class FundsCheck {

	private double cashInAccount = 1000.00 ;
	
	public double getCashInAccount() {return cashInAccount;}
	
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited ;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn){
		cashInAccount -= cashWithdrawn;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawn){
		if(cashToWithdrawn > getCashInAccount()) {
			System.out.println("Error: You don't have enough money");
			System.out.println("Current Balance: " + getCashInAccount());
			
			return false;
		}else {
			decreaseCashInAccount(cashToWithdrawn) ;
			System.out.println("Withdraw Complete: Current Balance is "+ getCashInAccount());
			
			return true;
		}			
	}
	
	public void makeDeposit(double cashToDeposit){
		increaseCashInAccount(cashToDeposit) ;
		System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
	}
	
}
