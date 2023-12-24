class employee{
	
	int id;
	String name;
	String dept;
	
	void empinfo(int i,String n,String d){
		
		id=i;
		name=n;
		dept=d;
		
	}
}
class salary extends employee{
	
	int bonus,basic,lop,total;
	
	void salinfo(int bo,int ba,int l){
		
		bonus=bo;
		basic=ba;
		lop=l;
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
	
	public static void main (String[] args){
		
		salary sal = new salary();
		sal.empinfo(101,"Ram","CSE");
		sal.salinfo(5000,15000,3600);
		sal.display();
		
	}
}
