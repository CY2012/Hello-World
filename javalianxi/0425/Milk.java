public class Milk extends Decorator{

	public Milk(Beverage b){
		super(b);
	}

	public double cost(){
		return 1.0 + getBeverage().cost();
	}
	public String detail(){
		return getBeverage().detail() + "¡¢Å£ÄÌ";
	}
}