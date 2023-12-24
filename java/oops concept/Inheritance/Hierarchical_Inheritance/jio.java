import java.util.*;

class paytm{
	
	int amt;
	String pho;
	
	void info(int am, String ph){
		
		amt=am;
		pho=ph;
	}
}
class airtel extends paytm{
	
	void a_recharge(){
		
		int amount = amt;
		String phone = pho;
		System.out.println("Recharge of Rs."+amt +" on "+pho+" is Successful");
	}
}
class jio extends paytm{
	
	void j_recharge(){
		
		int amount = amt;
		String phone = pho;
		System.out.println("Recharge of Rs."+amt +" on "+pho+" is Successful");
	}
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int ch;
	System.out.println("Enter 1 for airtel recharge 2 for jio recharge");
	ch = sc.nextInt();
	switch(ch){
		case 1 :
			System.out.println("Welcome to airtel recharge.");
			airtel ar = new airtel();
			ar.info(500,"9504010668");
			ar.a_recharge();
			break;
			
		case 2:
			System.out.println("Welcome to jio recharge.");
			jio j = new jio();
			j.info(499,"7266840123");
			j.j_recharge();
			break;
		
		default:
			System.out.println("Enter valid choice ");
			break;
			
	}
}
}