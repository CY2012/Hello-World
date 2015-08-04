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
		System.out.println("按1进行字符串拼接\t按2进行整数相加\t按3进行浮点数相加\n按0退出请输入命令：");
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
			System.out.println("请输入第一个整数：");
			int x = sc.nextInt();
			System.out.println("请输入第二个整数：");
			int y = sc.nextInt();
			int sum = ol.add(x,y);
			System.out.println(x + " + " + y + " = " + sum);
			
		}else if(m == 1){
			System.out.println("请输入第一个字符串：");
			String x = sc.next();
			System.out.println("请输入第二个字符串：");
			String y = sc.next();
			String str = ol.add(x,y);
			System.out.println(x + " 和 " + y + " 连接 " + str);
			
		}else if(m == 3){
			System.out.println("请输入第一个浮点数：");
			float x = sc.nextFloat();
			System.out.println("请输入第二个浮点数：");
			float y = sc.nextFloat();
			float f = ol.add(x,y);
			System.out.println(x + " + " + y + " = " + f);
		}else{
			System.exit(0);
		}
		
	}
}