package pethospital;

public class Cat extends Animal{
	public Cat(){}

	public Cat(String name){
		super(name);
	}

	@Override
	public void makeNoise(){
		System.out.println("è���������ĽС�����");
	}
}