public class Digui{
	public static int circleFactorial(int n){				//����ѭ���ķ�ʽ��׳�
		int sum = 1;
		if (n < 0){											//�жϲ���n�Ƿ�Ϊ����
			throw new IllegalArgumentException("����Ϊ������");
															// �׳�����������쳣
		}
		for (int i = 1;i <=  n ; i++ ){						//ִ��n��ѭ������
			sum *= i;										//ÿѭ��һ�ν��г˷�����
		}
		return sum;											//���ؽ׳˵�ֵ
	  }
	  public static int recursiveFactorial(int n){			//���õݹ��㷨��׳�
		  int sum = 1;
		  if(n<0)
			  throw new IllegalArgumentException("����Ϊ������");
															// �׳�����������쳣
		  if(n == 1){
			  return 1;										//���n=1������ѭ��
		  }else{
			  sum = n * recursiveFactorial(n-1);			//���õݹ����
			  return sum;
		  }
	   }
	   public static void main(String[] args){
		   int n = 5;
		   System.out.println("����ѭ���ķ�ʽ��" + n + "�Ľ׳�" +
					"\n����Ϊ��"							//����circleFactorial
					+ circleFactorial(n) + "\n");
					System.out.println("���õݹ��㷨��" + n + "�Ľ׳�" +
							"\n����Ϊ��"					//����recursiveFactorial
							+ recursiveFactorial(n));
		}
	}