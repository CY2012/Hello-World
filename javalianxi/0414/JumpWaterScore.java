import java.util.Scanner;
class JumpWaterScore{
	/*	
	public static void main(String[] args){
		double[] x = new double[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < x.length ;i++ ){
			System.out.println("�������"+ (i+1) +"λ���д���ķ���,����ķ�ΧΪ1-10�������룺");
			x[i] = sc.nextDouble();
			//System.out.println(x[i]);
		}
		System.out.println("�������Ѷ�ϵ��,");
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
				System.out.println("���" + (i + 1) + "λ���и���");
				score[i] = sc.nextDouble(); // 0 < �ɼ� <=10
			}
		}else{
			System.out.println("����δ��ʼ��");
		}
	}
	
	public void calcScore(){
		
		int j;
		double min,max;	 
		min=max=score[0];
		System.out.println("����Score��Ԫ�ذ�����");
		for(j=0;j<score.length;j++){
			System.out.print(score[j]+" ");
		    if(score[j]>max)   // �ж����ֵ
			max=score[j];
			if(score[j]<min)   // �ж���Сֵ
			min=score[j];
		} 
		System.out.println("\n��������ֵ�ǣ�" + max); // ������ֵ
		System.out.println("�������Сֵ�ǣ�" + min); // �����Сֵ
		double sum = 0;
		for (int m = 0;m < score.length ; m++ ){
			sum = sum + score[m];
		}
		System.out.println(sum);
		System.out.println("�������Ѷ�ϵ��:");
		double y = sc.nextDouble();		
		System.out.println("���ĵ÷�Ϊ��" + (sum-max-min)*y*0.6);
	}
	
	public static void main(String[] args){
	    JumpWaterScore jws = new JumpWaterScore();
		jws.inputScore();
		jws.calcScore();
	}
}
