package pethospital;

public class Mouse extends Animal{
	public Mouse(){}

	public Mouse(String name){
		super(name);
	}
	
	@Override
	public void makeNoise(){
		System.out.println("��������֨֨�ĽС�����");
	}
}