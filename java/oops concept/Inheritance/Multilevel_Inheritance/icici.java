/* Here the base class is sbi ;
   The inherited classes are gpay and icici ;
   What we are doing here is we are creating methods in each class to perform a transaction;
   the base class contains the balance from sbi bank account , it is displayed using the balinfo() method;
   next the gpay class is the transaction class here we have a method which gets input while calling the method in main class. 
	So while calling the transfer() method, we give an amount which gets stored in am and is deducted from sbi acc's balance.
	The deducted amount is getting deposited in icici class  */

class sbi{
	
	int bal = 45000;
	int amt;
	
	void balinfo(){
		
		System.out.println("The available balance is : "+bal);
	}
}
class gpay extends sbi{
	
	void transfer(int am){
	
	amt = am;
	bal = bal-am;
	System.out.println("Amount transfered is : "+amt);
	}
}
class icici extends gpay{
	
	void deposit(){
		
		int ibal = 90000;
		System.out.println("The initial balance is : "+ibal);
		ibal = ibal+amt;
		System.out.println("The available balance after transaction is : "+ibal);
		System.out.println("The credited amount is : "+amt);
	}
	
	public static void main(String[] args ){
		
		icici ic = new icici();
		System.out.println();
		System.out.println("This is the available balance in sbi bank ");
		ic.balinfo();
		System.out.println();
		System.out.println("Now we are going to transfer amount to icici bank : ");
		System.out.println();
		ic.transfer(8000);
		System.out.println();
		System.out.println("The available balance of icici is shown below after the transaction : ");
		System.out.println();
		ic.deposit();
		
	}
}