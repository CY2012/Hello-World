package pethospital;

public class Dog extends Animal{
	public Dog(){}

	public Dog(String name){
		super(name);
	}

	@Override
	public void makeNoise(){
		System.out.println("¹·ÕıÔÚÍôÍôµÄ½Ğ¡£¡£¡£");
	
	}
	
}