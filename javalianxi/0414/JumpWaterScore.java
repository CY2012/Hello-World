import java.util.Scanner;
class JumpWaterScore{
	/*	
	public static void main(String[] args){
		double[] x = new double[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < x.length ;i++ ){
			System.out.println("请输入第"+ (i+1) +"位裁判打出的分数,输入的范围为1-10，请输入：");
			x[i] = sc.nextDouble();
			//System.out.println(x[i]);
		}
		System.out.println("请输入难度系数,");
		double y = sc.nextDouble();	
	}
	*/

	double[] score;

	public JumpWaterScore(){
		score = new double[7];
	}
	public JumpWaterScore(int i){
		//Score = new double[i];	
	}
	Scanner sc = new Scanner(System.in);
	public void inputScore(){
		if (score != null){
			
			for (int i = 0;i < score.length ;i++ ){
				System.out.println("请第" + (i + 1) + "位裁判给分");
				score[i] = sc.nextDouble(); // 0 < 成绩 <=10
			}
		}else{
			System.out.println("数组未初始化");
		}
	}
	
	public void calcScore(){
		
		int j;
		double min,max;	 
		min=max=score[0];
		System.out.println("数组Score的元素包括：");
		for(j=0;j<score.length;j++){
			System.out.print(score[j]+" ");
		    if(score[j]>max)   // 判断最大值
			max=score[j];
			if(score[j]<min)   // 判断最小值
			min=score[j];
		} 
		System.out.println("\n数组的最大值是：" + max); // 输出最大值
		System.out.println("数组的最小值是：" + min); // 输出最小值
		double sum = 0;
		for (int m = 0;m < score.length ; m++ ){
			sum = sum + score[m];
		}
		System.out.println(sum);
		System.out.println("请输入难度系数:");
		double y = sc.nextDouble();		
		System.out.println("最后的得分为：" + (sum-max-min)*y*0.6);
	}
	
	public static void main(String[] args){
	    JumpWaterScore jws = new JumpWaterScore();
		jws.inputScore();
		jws.calcScore();
	}
}
