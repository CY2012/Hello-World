public class Zuoye6{
	public static void main(String[] args){
	    int sum = 0;
		int remain = 1;
		//ÿ���ʣ�����Ӽ�һ��������ǰһ�����ӵ�һ�룬
		//ÿ�����ӵ���������ǰһ��ʣ�����ӵ�������
		for (int day = 9; day >= 1 ;day-- ){
			sum = (remain+1)*2;
			remain = sum;
			System.out.println("��" + day + "�컹ʣ" + remain + "������");
		}
		System.out.println("���ӵ�����һ����" + sum);
	}
}