public class MaiTang{
	public static void main(String[] args){
	  /*  double money = 1.0;
		int count = 0;
		double price = .1;

		for (; money >= price ; price = price + .1 ){
			System.out.println("money = " + money + ",price = " + price);
			money -= price;
			count++;
		}
		
	 
	  System.out.println("共买了" + count + "块糖，兜里还剩" + money );
	  */
		int money = 10;
		int count = 0;
		double price = 1;

		for (; money >= price ; price = price + 1 ){
			System.out.println("money = " + money/10.0 + ",price = " + price/10.0);
			money -= price;
			count++;
		}
		
		System.out.println("共买了" + count + "块糖，兜里还剩" + money/10.0 + "元钱" );


	}
}