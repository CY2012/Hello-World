public abstract class Beverage{

	private double price;
	private String desc;

	public Beverage(){}

	public Beverage(double price,String desc){
		this.price = price;
		this.desc = desc;
	}

	public double getPrice(){
		return price;
	}

	public String getDesc(){
		return desc;
	}

	abstract double cost();

	public String toString(){
		return desc;
	}


}
