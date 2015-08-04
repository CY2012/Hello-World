package pethospital;

public class Animal{

	private static int count = 0;

	private String name;

	public Animal(){
		count++;
	}

	public Animal(String name){
		this();
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	
	public void makeNoise(){
		System.out.println("什么动物发声");
	
	}
	public static void setCount(){
		this.count = count;
	}
	public int getCount(){
		return count;
	}

}