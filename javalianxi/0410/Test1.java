import java.util.Scanner;

class Test1{

	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("请输入所赢得的礼券数：");
		int x = sc.nextInt();
		if (x < 3){
			System.out.println("礼券数量过少，不足以购买物品");
		}else{
			int a = x / 10;
			System.out.println("可以购买的单独包装的块状糖的数量为" + a);
			int b = x - a*10;
			int c = b / 3;
			System.out.println("可以购买的球形口香糖的数量为" + c);
		}
	}
}