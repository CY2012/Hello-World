

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
		System.out.println("��ӭʹ�ü�����");
		System.out.println("��1���м��㣬��2�˳�");
		System.out.println("��ѡ��:");
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
					System.out.println("�������� ������1,2��������");
					System.out.println("��ѡ��");
				}
			}catch(InputMismatchException e){
				System.out.println("�������� ������1,2��������");
				System.out.println("��ѡ��");
			}
		}
		return command;
	}
	public void calc(){
		int m;
		while (true){
			try{
				System.out.println("�������һ����");
				Scanner sc = new Scanner(System.in);
				m = sc.nextInt();	
				break;
			}catch (InputMismatchException e){
				System.out.println("����Ĳ������֣�����������");
			}
		}
		int n;
		while (true){
			try{
				System.out.println("������ڶ�����");
				Scanner sc = new Scanner(System.in);
				n = sc.nextInt();	
				break;
			}catch (InputMismatchException e){
				System.out.println("����Ĳ������֣�����������");
			}
		}
				System.out.println("������Ҫ���еĲ�����+��-��*��/");
				Scanner sc = new Scanner(System.in);
				String sign = sc.next();
				int result = 0;
				//�ж�sign�ķ��ţ����ö�Ӧ�������м��㣬��ӡ�����
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
						System.out.println("��������");
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