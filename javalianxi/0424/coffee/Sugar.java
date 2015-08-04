public class Sugar extends Decorator{
	
	public Sugar(){}
	public Sugar(Beverage beverage){
		super(beverage);
	}
	public Sugar(Beverage beverage,String desc){
		super(beverage,desc);
	}
	public double cost(){
		return 1.0 + getBeverage().cost();
	}
}