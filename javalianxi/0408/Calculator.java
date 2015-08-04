import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

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
		System.out.println("按1进行计算\t按2退出计算器\n请输入命令");
		Scanner sc = new Scanner(System.in);
			int command = sc.nextInt();
			return command;
	}
	public void run(Calculator c ){
		System.out.println("欢迎使用计算机");
		Scanner sc = new Scanner(System.in);
			try {
			   System.out.println("请输入第一个数字:");
			   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			   String num1 = reader.readLine();
			   while(!num1.matches("\\d+"))
			   {
			   System.out.println("输入的不是数字，请重新输入");
			   num1 = reader.readLine();
			   }
			   System.out.println("请输入第二个数字:");
			   String num2 = reader.readLine();
			   while(!Pattern.compile("[0-9]*").matcher(num2).matches())
			   {
			   System.out.println("输入的不是数字，请重新输入");
			   num2 = reader.readLine();
			   }

			   	System.out.println("请输入要进行的操作：+，-，*，/");
				String sign = sc.next();
				int result = 0;				
					switch(sign){
						case "+":
							 result = Integer.parseInt(num1) + Integer.parseInt(num2);
							 System.out.println(num1 + " " + sign + " " + num2 + "=" + result);
							break;
						case "-":
							 result = Integer.parseInt(num1) - Integer.parseInt(num2);
							 System.out.println(num1 + " " + sign + " " + num2 + "=" + result);
							break;
						case "*":
							 result = Integer.parseInt(num1) * Integer.parseInt(num2);
							 System.out.println(num1 + " " + sign + " " + num2 + "=" + result);
							break;
						case "/":
							 result = Integer.parseInt(num1) / Integer.parseInt(num2);
							 System.out.println(num1 + " " + sign + " " + num2 + "=" + result);
							break;
						default:
							 System.out.println("输入有误，请重新输入");																			
							 
					}


			  // int result = Integer.parseInt(num1) * Integer.parseInt(num2);
			   //System.out.println("乘积是："+ result);
			   } catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			   }
		/*
		System.out.println("请输入第一个数");
		int i = 0;
		while(true){
		
		try{
			 i = sc.nextInt();
			
		}catch(Exception e){
			System.out.println("输入错误,请重新输入第一个数");
			*/


		//判断sign的符号，调用对应方法进行计算，打印结果。

		
		//c.powerOff();
	}

}


