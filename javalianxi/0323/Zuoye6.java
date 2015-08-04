public class Zuoye6{
	public static void main(String[] args){
	    int sum = 0;
		int remain = 1;
		//每天吃剩的桃子加一个正好是前一天桃子的一半，
		//每天桃子的总数就是前一天剩下桃子的数量。
		for (int day = 9; day >= 1 ;day-- ){
			sum = (remain+1)*2;
			remain = sum;
			System.out.println("第" + day + "天还剩" + remain + "个桃子");
		}
		System.out.println("桃子的数量一共是" + sum);
	}
}