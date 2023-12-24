class adder{
	static int add(int a,int b){
		return a+b;
	}
	static double add(double a,double b,double c){
		return a+b+c;
	};
}
class test {
	public static void main(String[] args){
	System.out.println(adder.add(15,20));
	System.out.println(adder.add(45,20.25,12.5));

	}
}