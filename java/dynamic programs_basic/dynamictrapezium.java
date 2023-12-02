import java.util.*;
class dynamictrapezium{
	public static void main(String[] args){
	int a,b,h,t;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of one side : ");
	a=sc.nextInt();
	System.out.println("Enter the value of another side :");
	b=sc.nextInt();
	System.out.println("Enter the height : ");
	h=sc.nextInt();
	t=((a+b)*h)/2;
	System.out.println("Area of trapezium is : "+t);
	}
}