//��1~200֮�����������һһ��ӡ�����������������������������������£�
public class Sushu{
	private static boolean[] primeNumber(int num){ //������
		if(num<=0){								   //���ָ���ķ�Χ
		System.out.println("��Χ�������0");
		return null;
	}
	 boolean[]primes=new boolean[num+1];//���������������飬����Ϊ��Χ1
	 primes[1]=false;					//����������1�׳�����Ϊ1��������
	 Arrays.fill(primes, 2,num+1��true);//����������Ԫ�ص�ֵ����Ϊtrue
	 int n=(int)Math.sqrt(num);			//Math.sqrt()���������󿪷�
	 for(int i=1;i<n;i++){
		if(primes[i]){					//�������������ôi�ı�����������
			for(int j=2*i;j<=num;j+=i ){
				primes[j]=false;

			}
		}
	}
	return primes;
}
public static void showPrimeNumber(int num){	//��ʾ����
	boolean [] primes=primeNumber(num);	//���÷�����ֵ���������͵�����
	int n=0;
	if(primes!=null){
		for(int i=1;i<primes.length;i++){ // ѭ��������������Ԫ��
			if(primes[i]){				  //�������Ԫ��ֵΪtrue�����±�ֵΪ����
				System.out.print(i+" ");  //�������
				if(++n%10==0)			  //��ÿ��10���������
					System.out.println();
			}
		}
		System.out.println();
	}
	System.out.println("һ����"+n+"��");
}
public static void main(String[] args){
    int sum = 100;							//�����������ķ�Χ
	System.out.println("��Χ��"+num+"�ڵ�������:");
	showPrimeznumber(num);					//���÷�����ʾ����
	}
}