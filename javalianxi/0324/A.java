/*
import java.util.Scanner;

class A {
	int v = 100;
}
class GuessDemo{
	public static void main(String[] args){
		System.out.println("�������������");
		Scanner sc = new Scanner(System.in);
		int shu = sc.nextInt();
		if (shu > v){
			System.out.println("����������ִ���");
		}
		else if (shu < v){
			System.out.println("�����������С��");
		}
		else if(shu == v){
			System.out.println("�²�ɹ�");
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
		System.out.println("��ʼ����");
		while (true){
			System.out.println("��������²������");
			int data = sc.nextInt();
			if (a.BigSmallEqual(data) > 0){
				System.out.println("����");
			}else if (a.BigSmallEqual(data) < 0){
				System.out.println("С��");
			}else {
				System.out.println("��ϲ���¶��ˣ�");
				break;
			}
		}
	}
}