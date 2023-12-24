class bird{
	void birdsound(){
		System.out.println("This is the sound from bird");
	}
}
class dog extends bird{
	void birdsound(){
		System.out.println("This is the sound from dog");
	}
}
class rabbit extends bird{
	void birdsound(){
		System.out.println("This is the sound from rabbit");
	}
}
class test{
	public static void main(String[] args){
		bird b = new bird();
		dog d = new dog();
		rabbit r = new rabbit();
		r.birdsound();
		d.birdsound();
		b.birdsound();
	}
}
