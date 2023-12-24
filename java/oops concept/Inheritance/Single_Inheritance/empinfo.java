import java.util.*;

class employee{
	
	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	String dept;
	
	void details(){
		
		System.out.println("Enter Employee id : ");
		id = sc.nextInt();
		
		System.out.println("Enter Employee name : ");
		name = sc.next();
		
		System.out.println("Enter Employee department : ");
		dept = sc.next();
		
	}
}

class empinfo extends employee{
	
	int bonus,basic,lop,total;
	
	void salinfo(){
		
		System.out.println("Enter "+name+"'s basic salary :" );
		basic = sc.nextInt();
		
		System.out.println("Enter "+name+"'s bonus amount :" );
		bonus = sc.nextInt();
		
		System.out.println("Enter "+name+"'s loss of pay :" );
		lop = sc.nextInt();
	}
	
	void display(){
		
		System.out.println("Employee id :"+id);
		System.out.println("Employee name :"+name);
		System.out.println(name+"'s department :"+dept);
		System.out.println(name+"'s basic salary is :"+basic);
		System.out.println(name+"'s bonus is :"+bonus);
		System.out.println(name+"'s loss of pay is :"+lop);
		total=basic+bonus-lop;
		System.out.println(name+"'s Total Salary is :"+total);
	}
	
	public static void main(String[] args){
		
		empinfo e = new empinfo();
		e.details();
		e.salinfo();
		e.display();
	}
}