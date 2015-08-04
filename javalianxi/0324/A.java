/*
import java.util.Scanner;

class A {
	int v = 100;
}
class GuessDemo{
	public static void main(String[] args){
		System.out.println("请输入你的数字");
		Scanner sc = new Scanner(System.in);
		int shu = sc.nextInt();
		if (shu > v){
			System.out.println("您输入的数字大了");
		}
		else if (shu < v){
			System.out.println("您输入的数字小了");
		}
		else if(shu == v){
			System.out.println("猜测成功");
		} 
		A a = new A();
	    
	}
	
}
*/
import java.util.Scanner;

class A{
	int v = (int)(Math.random() * 100);

	public int BigSmallEqual(int num){
		if (v > num){
			return -1;
		}else if(v < num){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static void main(String[] args){
		A a = new A();
		Scanner sc = new Scanner(System.in);
		System.out.println("开始猜数");
		while (true){
			System.out.println("请输入你猜测的数：");
			int data = sc.nextInt();
			if (a.BigSmallEqual(data) > 0){
				System.out.println("大了");
			}else if (a.BigSmallEqual(data) < 0){
				System.out.println("小了");
			}else {
				System.out.println("恭喜您猜对了！");
				break;
			}
		}
	}
}
