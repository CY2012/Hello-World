public class CoffeeApp{

	public static void main(String[] args){
	    Beverage m = new Mocha();
		Beverage milk = new Milk(m);
		System.out.println(milk.detail() + ";价格=" + milk.cost());
		Beverage sugar = new Sugar(milk);
		System.out.println(sugar.detail() + ";价格=" + sugar.cost());
	}
}