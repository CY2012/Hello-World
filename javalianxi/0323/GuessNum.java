import java.util.Scanner;


public class GuessNum{
	public static void main(String[] args){
		/*int i = (int)(Math.random()*5 )+ 1;
		//System.out.println(i);


	    System.out.println("���������ķ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();//���е���ʱ����һ������
		System.out.println("��ķ�����" + score);
		for(int j = 1;j <= 3 ; j++){
			if(score == i){
				System.out.println("������ȷ");

		}
		else{
			System.out.println("��������");
			}
		}
		*/
		int rand = (int)(Math.random() * 5) + 1;
		//System.out.println(rand);

		Scanner sc = new Scanner(System.in);
		System.out.println("��������²��������1~5֮��:");
		int data = 0;

		int i = 1;

		while(true){
			data = sc.nextInt();
			if(rand == data){
				System.out.println("��ϲ��¶��ˣ�rand =" + rand + ",data = " + data);
				break;
			}
			if(i > 3){
				System.out.println("������Ĵ������࣡");
				break;
			}
			i++;
			System.out.println("���´��ˣ�rand = " + rand + ",data=" + data);

		}
	}
}