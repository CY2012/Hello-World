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
		System.out.println("����");
		return;
	}
	public void powerOff(){
		System.out.println("�ػ�");
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
		System.out.println("��ӭʹ�ü����");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int i = sc.nextInt();
		System.out.println("������ڶ�����");
		int j = sc.nextInt();
		System.out.println("������Ҫ���еĲ�����+��-��*��/");
		String sign = sc.next();
		int result = 0;
		//�ж�sign�ķ��ţ����ö�Ӧ�������м��㣬��ӡ�����

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
				System.out.println("��������");
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
		System.out.println("��1���м���\t��2�˳�������\n����������");
		Scanner sc = new Scanner(System.in);
			int command = sc.nextInt();
			return command;
	}
	public void run(Calculator c ){
		System.out.println("��ӭʹ�ü����");
		Scanner sc = new Scanner(System.in);
			try {
			   System.out.println("�������һ������:");
			   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			   String num1 = reader.readLine();
			   while(!num1.matches("\\d+"))
			   {
			   System.out.println("����Ĳ������֣�����������");
			   num1 = reader.readLine();
			   }
			   System.out.println("������ڶ�������:");
			   String num2 = reader.readLine();
			   while(!Pattern.compile("[0-9]*").matcher(num2).matches())
			   {
			   System.out.println("����Ĳ������֣�����������");
			   num2 = reader.readLine();
			   }

			   	System.out.println("������Ҫ���еĲ�����+��-��*��/");
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
							 System.out.println("������������������");																			
							 
					}


			  // int result = Integer.parseInt(num1) * Integer.parseInt(num2);
			   //System.out.println("�˻��ǣ�"+ result);
			   } catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			   }
		/*
		System.out.println("�������һ����");
		int i = 0;
		while(true){
		
		try{
			 i = sc.nextInt();
			
		}catch(Exception e){
			System.out.println("�������,�����������һ����");
			*/


		//�ж�sign�ķ��ţ����ö�Ӧ�������м��㣬��ӡ�����

		
		//c.powerOff();
	}

}


