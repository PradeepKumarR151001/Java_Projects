import java.util.*;
class dynamicsi{
	public static void main(String [] args){
		int p,r,t,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount : ");
		p=sc.nextInt();
		System.out.println("Enter the rate of intrest : ");
		r=sc.nextInt();
		System.out.println("Enter the time : ");
		t=sc.nextInt();
		a=p*(1+r*t);
		System.out.println("The Simple Intrest is : "+a);
		
	}
}