import java.util.*;

class dowhile{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,ch;
				
		do{
			System.out.println("Enter value for a :");
			a=sc.nextInt();
			System.out.println("Enter value for b : ");
			b=sc.nextInt();
			c=a+b;
			System.out.println("The answer is "+c);
			System.out.println();
			System.out.println("Do you want to continue ? Type 1 for Yes or 0 for No");
			ch = sc.nextInt();
			
		}while(ch!=0);
	}
}