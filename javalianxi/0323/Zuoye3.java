public class Zuoye3{
	public static void main(String[] args){
	    int s = 0;
		int s1;
		for (int i = 1;i <= 20 ;i++ ){
			s1 = 1;
			for (int j = 1;j <= i;j++ ){
				s1 = s1 * j;
			}
			s = s + s1;
		}
		System.out.println("1!+2!+...+20!=" + s);

	}
}