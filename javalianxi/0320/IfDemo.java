public class IfDemo{
	public static void main(String[] args){
		int score = (int) (Math.random() * 200) + 1;  //[1,100]
		System.out.println("score " + score);
		if (score<60)
			System.out.println("������");
		else if (score<70)
			System.out.println("����");
		else if (score<80)
		    System.out.println("����");
		else if (score<=100)
		    System.out.println("����");
		else
			System.out.println("������ķ���������Χ");
		
	 }
}