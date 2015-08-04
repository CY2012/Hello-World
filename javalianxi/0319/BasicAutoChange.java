public class BasicAutoChange{
	public static void main(String[] args){ 
                                            
											  
		char c ='a';
		byte b = 44;
		short s0 = b;
		// 声明一个整型变量
		int i0 = s0;
		int i1 = c;
		long l = i0;
		float f = l;
		double d = f;
		float f1 = 1.7f;
		double db = f1;
		// 一个数从一种类型转换成另外一种类型，再换回来时，值还是一样
		System.out.println("f1 ="+ f1 +"; dou = " + db);
		f1 = (float) db;
		System.out.println("f1 ="+ f1 + "; dou = " + db);
	  }
	}