import java.util.Scanner;

class Overload{
 
	public void add(String a){
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("�������һ���ַ���");		
		String x = sc.next();

		System.out.println("������ڶ����ַ���");
		String y = sc.next();
		
		String sum = x + y;
		System.out.println(sum);
		
	}
	public void add(int a){
		Scanner sc = new Scanner(System.in);
	    System.out.println("�������һ���ַ���");		
		int x = sc.nextInt();

		System.out.println("������ڶ����ַ���");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println(sum);
		
	
	}
	public void add(double a){
		Scanner sc = new Scanner(System.in);
	    System.out.println("�������һ���ַ���");		
		double x = sc.nextDouble();

		System.out.println("������ڶ����ַ���");
		double y = sc.nextDouble();
		
		double sum = x + y;
		System.out.println(sum);
		
	
	}

	public static void main(String[] args){
		
	Overload ol= new Overload();

	System.out.println("��1�����ַ������\n��2�����������\n��3���и��������");
	Scanner sc = new Scanner(System.in);
	int z = sc.nextInt();
	
	switch (z){
	case 1:
		ol.add("h");
		break;
	case 2:
		ol.add(2);
		break;
	case 3:
		ol.add(0.5);
		break;
	
		}
	}
}
/*
		Scanner sc = new Scanner(System.in);
	    System.out.println("�������һ���ַ���");		
		int x = sc.nextInt();

		System.out.println("������ڶ����ַ���");
		int y = sc.nextInt();
		*/