import java.util.*;

class bank1{
	Scanner sc = new Scanner(System.in);
	
	int bal = 90000;
	int amt, rem;
	
	void deduction(){
		
	System.out.println("This is Sender's Bank:");
	System.out.println("Available balance is : "+bal);
	System.out.println("Enter amount you are going to transfer : ");
	amt = sc.nextInt();
	rem = bal-amt;
	System.out.println("Amout of Rs."+amt +" is deducted successfully, New balance is : "+rem);
	}
}

class apay extends bank1{
	
	int a;
	String name1;
	String name2;
	
	void transaction(){
	System.out.println("Enter your name : ");
	name2 = sc.next();
	System.out.println("Enter the name of the Receipient : ");
	name1 = sc.next();
	System.out.println("Enter the acc number : ");
	a = sc.nextInt();
	System.out.println("Amount of Rs."+amt + " is being transfered to "+a +"("+name1 +") ");
	
	}
}

class bank2 extends apay{
	
	int balance = 52300;
	int total;
	
	void receipient(){
		
	System.out.println("This is Receiver's bank : ");	
	System.out.println("Available balance is : "+balance);
	System.out.println("Amount of Rs."+amt +"is receivied from "+a +"("+name2 +") ");
	total = balance+amt;
	System.out.println("New Available balance in Bank2 is : "+balance);
	
	}
	
	public static void main(String[] args){
		
		bank2 b = new bank2();
		b.deduction();
		System.out.println();
		b.transaction();
		System.out.println();
		b.receipient();
		System.out.println();
	}
}