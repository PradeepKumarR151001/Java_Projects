//Parameterized Constructor

class paramc{
	
	String languages;
	paramc(String lang){//this is the parameterized constructor i.e paramc(String lang) here we are passing a string value as a parameter 
		languages = lang;
		System.out.println("Name of the languange is "+lang);		
	}
	
	public static void main(String[] args){
		paramc p = new paramc("java");
		paramc p2 = new paramc("python");
	
	}
}