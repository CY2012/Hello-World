public class Zuoye5{
	public static void main(String[] args){
	    char i,j,k;
		//i��a�Ķ��֣�j��b�Ķ��֣�k��c�Ķ���
		for (i = 'x';i <= 'z';i++ ){
			for (j = 'x';j <= 'z' ;j++ ){
				if (i != j){
					for (k = 'x';k <= 'z' ;k++ )
						if (i != k && j != k)
							if (i != 'x' && k != 'x' && k != 'z')
																	
					System.out.println("a VS " + i + "\nb Vs " + j +"\nc VS " + k);
				}
			}
		}
	}
}