import java.util.Scanner;


class Calculator{
	/*int a = 8;
	int b = 4;
	public int add(){
		System.out.println(a + b);
			return a + b;
	}
	public int jian(){
		System.out.println(a - b);
			return a - b;
	
	}
	public int cheng(){
		System.out.println(a * b);
			return a * b;
	
	}
	public int chu(){
		System.out.println(a / b);
			return a / b;
	
	}
}
class CalculatorDemo{
	public static void main(String[] args){
	    Calculator c = new Calculator();
		
			c.add();
			c.jian();
			c.cheng();
			c.chu();


	}
	*/

	public int add(int a, int b){
		return a + b;
	}
	public int jian(int a, int b){
		return a - b;
	}
	public int cheng(int a, int b){
		return a * b;
	}
	public int chu(int a, int b){
		return a / b;
	}
	public void powerOn(){
		System.out.println("开机");
		return;
	}
	public void powerOff(){
		System.out.println("关机");
	}
}
/*
class CalculatorDemo{
	public static void main(String[] args){
	    Calculator c = new Calculator();
			//c.add();
			//c.jian();
			//c.cheng();
			//c.chu();
		c.powerOn();
		System.out.println("欢迎使用计算机");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int i = sc.nextInt();
		System.out.println("请输入第二个数");
		int j = sc.nextInt();
		System.out.println("请输入要进行的操作：+，-，*，/");
		String sign = sc.next();
		int result = 0;
		//判断sign的符号，调用对应方法进行计算，打印结果。

		switch(sign){
			case "+":
				result = c.add(i,j);
				break;
			case "-":
				result = c.jian(i,j);
				break;
			case "*":
				result = c.cheng(i,j);
				break;
			case "/":
				result = c.chu(i,j);
				break;
			default:
				System.out.println("输入有误");
				break;
							
		}
		System.out.println(i + " " + sign + " " + j + "=" + result);
		c.powerOff();
*/
class Main{

	public static void main(String[] args){
		Main main = new Main();
	    Calculator c = new Calculator();
			//c.add();
			//c.jian();
			//c.cheng();
			//c.chu();
		c.powerOn();
		while (true){
			int r = main.menu();
			if (r == 1){
				main.run(c);
			}else {
				break;
			}
		}
		c.powerOff();
	}
	public int menu(){
		System.out.println("按1进行计算\t按2推出计算器\n请输入命令");
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		return command;
	}
	public void run(Calculator c ){
		System.out.println("欢迎使用计算机");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int i = sc.nextInt();
		System.out.println("请输入第二个数");
		int j = sc.nextInt();
		System.out.println("请输入要进行的操作：+，-，*，/");
		String sign = sc.next();
		int result = 0;
		//判断sign的符号，调用对应方法进行计算，打印结果。

		switch(sign){
			case "+":
				result = c.add(i,j);
				break;
			case "-":
				result = c.jian(i,j);
				break;
			case "*":
				result = c.cheng(i,j);
				break;
			case "/":
				result = c.chu(i,j);
				break;
			default:
				System.out.println("输入有误");
				break;
							
		}
		System.out.println(i + " " + sign + " " + j + "=" + result);
		//c.powerOff();
	}

}


