public class BasicAutoChange{
	public static void main(String[] args){ 
                                            
											  
		char c ='a';
		byte b = 44;
		short s0 = b;
		// ����һ�����ͱ���
		int i0 = s0;
		int i1 = c;
		long l = i0;
		float f = l;
		double d = f;
		float f1 = 1.7f;
		double db = f1;
		// һ������һ������ת��������һ�����ͣ��ٻ�����ʱ��ֵ����һ��
		System.out.println("f1 ="+ f1 +"; dou = " + db);
		f1 = (float) db;
		System.out.println("f1 ="+ f1 + "; dou = " + db);
	  }
	}