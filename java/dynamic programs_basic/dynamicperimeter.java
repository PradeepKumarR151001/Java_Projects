import java.util.*;
class dynamicperimeter{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int r;
		double pi=3.14,a;
		
		System.out.println("Enter the radius :");
		r=sc.nextInt();
		a=(pi*r)*2;
		System.out.println("Perimeter is : "+a);
	}
}