//ˮ�ɻ���
public class Shuixianhuashu{
	public static void main(String[] args){
		
	    for( int i = 100;i < 1000; i++ ){
			int m = i / 100;
			int n = (i - m * 100) / 10 ;
			int k = i - m * 100 - 10 * n ;
			
			if (i == m * m * m + n * n * n + k * k * k){
				System.out.println("ˮ�ɻ�����" + i);
			}
			
	    }
	}
}