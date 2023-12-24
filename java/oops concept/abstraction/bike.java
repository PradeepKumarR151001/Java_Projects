abstract class honda{
	abstract void run();
	void display()
	{
	System.out.println("It is a example");
	}
}
class bike extends honda{
	
	void run(){
		System.out.println("It is a abstraction method");
	}
	
	public static void main(String[] args){
		
		honda h = new bike();
		h.run();
		h.display();
	}
}