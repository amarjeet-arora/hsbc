package common;
 
public class BankingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
 		Account account = new Account(5000);
		DepositThread t1 = new DepositThread(account, "A", 2500);
		
		DepositThread t2 = new DepositThread(account, "\tB", 3000);
		
		WithdrawThread t3 = new WithdrawThread(account, "\t\tC", 2000);
		System.out.println("All Threads started...");
		try{
		t1.start();
 		t2.start();
 		t3.start();
 		}catch (Exception e) {
			// TODO: handle exception
		}
		//System.out.println("All Threads started...");
		
		
		
		System.out.println("Final Balance : " + account.getBalance());
	}

}
