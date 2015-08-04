public class A{
	public static void main(String[] args){
		/*
	    int a = 1;
		while(a <= 10){
			System.out.println(a);
			a++;
		}
		*/
		byte i = 4;
		switch (i){
			case 1 :
				System.out.println("i = 1");
			case 2 :
				System.out.println("i = 2");
			case 3 :
				System.out.println("i = 3");
			case 4 :
				System.out.println("i = 4");
			default :
				System.out.println("没有匹配上Switch中的数值");


		}
		System.out.println("结束");
	}
}