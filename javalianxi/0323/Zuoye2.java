public class Zuoye2{
	public static void main(String[] args){
	    int i,j,k;
		
		int t = 0;
		for (i = 1; i <= 4 i++;){
			for (j = 1; j <= 4 ; j++ ){
				for (k = 1; k <= 4 ; k++ ){
					if (i != j && j != k && i != k){
						t += 1;
						System.out.println(i * 100 + j * 10 + k);
					}
				}
			}
		}
		System.out.println("�ܸ���Ϊ" + t);
	}
}