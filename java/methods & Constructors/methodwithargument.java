//Method with argument Example
//in main method we are passing values so it is called as method with argument

class methodwithargument{
	
	void param(String name,int quan,int price){
		System.out.println("Name of the product : "+name);
		System.out.println("Quantity brought : "+quan);
		System.out.println("Price of one product : "+price);
		int total = quan * price;
		System.out.println("Total cost: "+total);
		System.out.println();
		
	}
	public static void main(String[] args){
		methodwithargument m = new methodwithargument();
		m.param("Pen",17,5);
		m.param("Pencil",27,3);
		m.param("Eraser",8,4); 
	} 
}