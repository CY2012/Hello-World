

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Caculator{


	public int add(int a,int b){
		return a + b;
	}
	public int sub(int a,int b){
		return a - b;
	}
	public int mul(int a,int b){
		return a * b;
	}
	public int div(int a,int b){
		return a / b;
	}
	public int menu(){
		Scanner sc = null;
		System.out.println("欢迎使用计算器");
		System.out.println("按1进行计算，按2退出");
		System.out.println("请选择:");
		int command = 0;
		boolean flag = false;
		Pattern p = Pattern.compile("[1-2]");
		Matcher m = null;
		while(true){
			try{
				sc = new Scanner(System.in);
				command = sc.nextInt();
				m = p.matcher(String.valueOf(command));
				boolean b = m.matches();
				if (b){
					// System.out.println(s);
					flag = true;
					break;
				}else{
					System.out.println("输入有误 请输入1,2两个数字");
					System.out.println("请选择");
				}
			}catch(InputMismatchException e){
				System.out.println("输入有误 请输入1,2两个数字");
				System.out.println("请选择");
			}
		}
		return command;
	}
	public void calc(){
		int m;
		while (true){
			try{
				System.out.println("请输入第一个数");
				Scanner sc = new Scanner(System.in);
				m = sc.nextInt();	
				break;
			}catch (InputMismatchException e){
				System.out.println("输入的不是数字，请输入数字");
			}
		}
		int n;
		while (true){
			try{
				System.out.println("请输入第二个数");
				Scanner sc = new Scanner(System.in);
				n = sc.nextInt();	
				break;
			}catch (InputMismatchException e){
				System.out.println("输入的不是数字，请输入数字");
			}
		}
				System.out.println("请输入要进行的操作：+，-，*，/");
				Scanner sc = new Scanner(System.in);
				String sign = sc.next();
				int result = 0;
				//判断sign的符号，调用对应方法进行计算，打印结果。
				switch(sign){
					case "+":
						result = add(m,n);
						break;
					case "-":
						result = sub(m,n);
						break;
					case "*":
						result = mul(m,n);
						break;
					case "/":
						result = div(m,n);
						break;
					default:
						System.out.println("输入有误");
						break;									
				}
				System.out.println(m + " " + sign + " " + n + " = " + result);
	}
	
	public void exit(){
		System.exit(0);
	}
	public static void main(String[] args){
	    Caculator c = new Caculator();
		int cmd = c.menu();
		if (cmd == 2){
			c.exit();
		}else{
			c.calc();
		}

	}

}