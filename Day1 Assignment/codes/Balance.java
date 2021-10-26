import java.util.*;

class Balance{

	Scanner sc = new Scanner(System.in);

		public void Deposit(Double Balance){

		System.out.println("Your Balance is:"+Balance);
	
		System.out.print("Enter Amount");
	
		Double Amount=sc.nextDouble();

		if(1<Amount){
	
		Balance = Balance+Amount;

		System.out.println("Your Balance is:"+Balance);

return;
	
		}

		
		}

	public void Withdraw(Double Balance,String Password){

	System.out.println("Your Password is:"+Password);

	System.out.print("Enter Amount");
	
	Double Amo=sc.nextDouble();

	if(1<Amo && Amo < Balance){

	System.out.print("Enter Password");

	String pass = sc.next();
	
	if(Password.equals(pass)){

	Balance = Balance-Amo;


	System.out.println("Your Balance is:"+Balance);
return;	
	}

	
}
	

}

}