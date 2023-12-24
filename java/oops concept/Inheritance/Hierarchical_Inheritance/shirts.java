import java.util.*;

class shopping{
	Scanner sc = new Scanner(System.in);
	
	int ch;
	int pant = 149;
	int shirt = 99;
	
	void list(){
		System.out.println("Welcome to our Shop ");
		System.out.println("Available products are as follows : ");
		System.out.println("1. Pants ");
		System.out.println("2. Shirts ");
		System.out.println("Enter your choice (1 or 2 ):");
		ch = sc.nextInt();
	}
}
class pants extends shopping{
	
	int amt,q;
	String s;
	
	void shop(){
		if(ch==1){
			System.out.println("Enter the size of your pant(S/M/L/XL) : ");
			s = sc.next();
			System.out.println("Enter the Quantity : ");
			q = sc.nextInt();
			switch(s){
				case("S"):
					amt=q*pant;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				case("M"):
					amt=q*pant+90;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				case("L"):
					amt=q*pant+110;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				case("XL"):
					amt=q*pant+130;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				default:
					System.out.println("Enter valid choice :");
			
			}
		}else if(ch==2){
			
			System.out.println("Enter the size of your Shirt(S/M/L/XL) : ");
			s = sc.next();
			System.out.println("Enter the Quantity : ");
			q = sc.nextInt();
			switch(s){
				case("S"):
					amt=q*shirt;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				case("M"):
					amt=q*shirt+50;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				case("L"):
					amt=q*shirt+80;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				case("XL"):
					amt=q*shirt+90;
					System.out.println("Total Quantity ordered "+q+" of size "+s);
					System.out.println("Total cost is :"+amt);
					break;
				default:
					System.out.println("Enter valid choice :");
			}
			
		}else
			
		System.out.println("Wrong Choice ");
	} 
	
}class shirts extends pants{
	
	void price(){
		
		System.out.println("Price of Shirts starting from: "+shirt);
		System.out.println("Price of Pants starting from: "+pant);
		
	}
	public static void main(String[] args){
		
		pants p = new pants();
		shirts sh = new shirts();
		p.list();
		System.out.println();
		sh.price();
		System.out.println();
		p.shop();
		System.out.println();
		
	}
}