import java.util.*;

class odd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a;
		
		System.out.println("Enter a number: ");
		a=sc.nextDouble();
		
		if(a%2==0){
			System.out.println("It is a even number ");
		}else{
			System.out.println("It is a odd number ");
		}
	}
}