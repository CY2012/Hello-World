import java.util.Scanner;

class Test1{

	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("��������Ӯ�õ���ȯ����");
		int x = sc.nextInt();
		if (x < 3){
			System.out.println("��ȯ�������٣������Թ�����Ʒ");
		}else{
			int a = x / 10;
			System.out.println("���Թ���ĵ�����װ�Ŀ�״�ǵ�����Ϊ" + a);
			int b = x - a*10;
			int c = b / 3;
			System.out.println("���Թ�������ο����ǵ�����Ϊ" + c);
		}
	}
}