public class Demo{
	public static void main(String[] args){
	    Beverage m = new Mocha(10.0);
		Beverage mx = new Sugar(m,"ÌÇ");
		System.out.println(mx + ",¼Û¸ñ£º" + mx.cost());
	}
}