
//������TestJava1.java
//���������Ҫ����������е����ֵ����Сֵ
public class TestJava{

	public static void main(String args[]){
		int i,min,max;
		int A[]={74,48,30,17,62};  // ������������ A,������ֵ

		min=max=A[0];
		System.out.print("���� A ��Ԫ�ذ����� ");
		for(i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		if(A[i]>max) // �ж����ֵ
			max=A[i];
		if(A[i]<min) // �ж���Сֵ
			min=A[i];
	}
	System.out.println("\n��������ֵ�ǣ�" + max); // ������ֵ
	System.out.println("�������Сֵ�ǣ�" + min);   // �����Сֵ
	}
}