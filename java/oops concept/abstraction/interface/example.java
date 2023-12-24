interface printable{
void print();
}
interface showable{
	 void show();
}
class example implements printable,showable{
	public void print()
	{
		System.out.println("This is printed from printable");
	}
	public void show()
	{
		System.out.println("This is printed from showable");
	}
public static void main(String[] args){
	example e = new example();
	e.show();
	e.print();
}
} 