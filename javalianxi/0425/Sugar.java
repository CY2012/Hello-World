public class Sugar extends Decorator{

	public Sugar(Beverage b){
		super(b);
	}

	public double cost(){
		return .5 + getBeverage().cost();
	}
	public String detail(){
		return getBeverage().detail() + "¡¢ÌÇ";
	}
}