import java.util.Scanner;


public class GuessNum{
	public static void main(String[] args){
		/*int i = (int)(Math.random()*5 )+ 1;
		//System.out.println(i);


	    System.out.println("请输入您的分数");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();//运行到此时输入一个整数
		System.out.println("你的分数是" + score);
		for(int j = 1;j <= 3 ; j++){
			if(score == i){
				System.out.println("猜数正确");

		}
		else{
			System.out.println("猜数错误");
			}
		}
		*/
		int rand = (int)(Math.random() * 5) + 1;
		//System.out.println(rand);

		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入猜测的整数在1~5之间:");
		int data = 0;

		int i = 1;

		while(true){
			data = sc.nextInt();
			if(rand == data){
				System.out.println("恭喜你猜对了！rand =" + rand + ",data = " + data);
				break;
			}
			if(i > 3){
				System.out.println("您输入的次数过多！");
				break;
			}
			i++;
			System.out.println("您猜错了！rand = " + rand + ",data=" + data);

		}
	}
}