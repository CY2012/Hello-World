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
		System.out.print("医生" + name + "为" + dog.getName() + "打针\t");
		dog.makeNoise();
	}
	public void giveShot(Cat cat){
		System.out.print("医生" + name + "为" + cat.getName() + "打针\t");
		cat.makeNoise();
	}
	public void giveShot(Mouse mouse){
		System.out.print("医生" + name + "为" + mouse.getName() + "打针\t");
		mouse.makeNoise();		
	}
	public void giveShot(Lizard lizard){
		System.out.print("医生" + name + "为" + lizard.getName() + "打针\t");
		lizard.makeNoise();		
	}
	public void giveShot(Snake snake){
		System.out.print("医生" + name + "为" + snake.getName() + "打针\t");
		snake.makeNoise();		
	}
		
	

}