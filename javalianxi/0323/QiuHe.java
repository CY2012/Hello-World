public class QiuHe{
	public static void main(String[] args){
	    int i = 10;
		int sum = 0;
		while (i <= 20){
			sum = sum + i;
			i++;
			System.out.println("sum" + i + " = " + sum);
		}
		//while(i++ < 20) 另一种方法
		//	 sum += i;
			System.out.println("sum = " + sum);
	}
}