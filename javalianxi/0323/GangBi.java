public class GangBi{
	public static void main(String[] args){
	    int money = 1000;
		int count = 0;
		while(money >= 38){
			money -= 38;
			count++;
	
			}
		System.out.println("1000元买了" + count + "支钢笔，兜里还剩" + money + "元");
	}
}



