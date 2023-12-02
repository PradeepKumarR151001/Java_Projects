import java.util.*;
class dynpara{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p,b,h;
		System.out.println("Enter Breadth :");
		b=sc.nextInt();
		System.out.println("Enter Height : ");
		h=sc.nextInt();
		p=b*h;
		System.out.println("Area of parallelogram is : "+p);
	}
}