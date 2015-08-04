package pethospital;

public class Vet{

	private String name;

	public Vet(){}

	public Vet(String name){
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void giveShot(Dog dog){
		System.out.print("ҽ��" + name + "Ϊ" + dog.getName() + "����\t");
		dog.makeNoise();
	}
	public void giveShot(Cat cat){
		System.out.print("ҽ��" + name + "Ϊ" + cat.getName() + "����\t");
		cat.makeNoise();
	}
	public void giveShot(Mouse mouse){
		System.out.print("ҽ��" + name + "Ϊ" + mouse.getName() + "����\t");
		mouse.makeNoise();		
	}
	public void giveShot(Lizard lizard){
		System.out.print("ҽ��" + name + "Ϊ" + lizard.getName() + "����\t");
		lizard.makeNoise();		
	}
	public void giveShot(Snake snake){
		System.out.print("ҽ��" + name + "Ϊ" + snake.getName() + "����\t");
		snake.makeNoise();		
	}
		
	

}