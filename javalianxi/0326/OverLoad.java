import java.util.Scanner;
class OverLoad{
	

	public String add(String a,String b){
		return a + b;
	}

	public int add(int a,int b){
		return a + b;
	}

	public float add(float a,float b){
		return a + b;
	}
}
class Main{

	public static void main(String[] args){
		Main main = new Main();
		OverLoad ol = new OverLoad();

		while (true){
			main.run();
		}
	    
		  	
	}
	public int menu(){
		System.out.println("��1�����ַ���ƴ��\t��2�����������\t��3���и��������\n��0�˳����������");
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		return command;
	}
	public void run(){
		OverLoad ol = new OverLoad();
		int m = menu();
		System.out.println(m);
		Scanner sc = new Scanner(System.in);
		if(m == 2){
			System.out.println("�������һ��������");
			int x = sc.nextInt();
			System.out.println("������ڶ���������");
			int y = sc.nextInt();
			int sum = ol.add(x,y);
			System.out.println(x + " + " + y + " = " + sum);
			
		}else if(m == 1){
			System.out.println("�������һ���ַ�����");
			String x = sc.next();
			System.out.println("������ڶ����ַ�����");
			String y = sc.next();
			String str = ol.add(x,y);
			System.out.println(x + " �� " + y + " ���� " + str);
			
		}else if(m == 3){
			System.out.println("�������һ����������");
			float x = sc.nextFloat();
			System.out.println("������ڶ�����������");
			float y = sc.nextFloat();
			float f = ol.add(x,y);
			System.out.println(x + " + " + y + " = " + f);
		}else{
			System.exit(0);
		}
		
	}
}