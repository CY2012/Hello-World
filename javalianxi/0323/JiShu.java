public class JiShu{
	public static void main(String[] args){
	    /*
		int i = 1;
		int sum = 0;
		while(i <= 100){
			if(i % 2 ! = 0){
				sum += i;
			}
				i++;
		}
		System.out.println("1~100֮�������֮��" + sum );
		*/
		int i = 0;
		int sum = 0;
		while(i <= 100){
			i++;
			if(i % 2 != 0){
				sum += i;
				continue;//��ֹ����ѭ�� ������һ��ѭ��
			sum += i;

			}
			System.out.println("1~100֮���ż��֮��");
		}
	}
}