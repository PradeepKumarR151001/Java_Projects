import java.util.*;

class forloop{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int i,a,j;
		
		System.out.println("Enter a number : ");
		a=sc.nextInt();
		
		System.out.println("The multiplication table for "+a + " is :");
		
		for(i=0;i<=10;i++){
			j=i*a;
			System.out.println(i+"*"+a+" = "+j);
		}
		
	}
}