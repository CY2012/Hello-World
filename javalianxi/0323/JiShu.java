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
		System.out.println("1~100之间的奇数之和" + sum );
		*/
		int i = 0;
		int sum = 0;
		while(i <= 100){
			i++;
			if(i % 2 != 0){
				sum += i;
				continue;//终止本次循环 跳到下一次循环
			sum += i;

			}
			System.out.println("1~100之间的偶数之和");
		}
	}
}
