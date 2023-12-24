//Default constructor Example

class defaultc{
	String name = "Pen";
	int quan = 17, price = 6;
defaultc(){//this is the default constructor i.e defaultc() . Since we are not passing any parameters it is called as default constructor
	System.out.println("Name of the product : "+name);
	System.out.println("Quantity brought : "+quan);
	System.out.println("Price of one product : "+price);
}

public static void main(String[] args){
	defaultc d = new defaultc();
}	
}
