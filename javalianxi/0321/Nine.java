public class Nine{
	public static void main(String[] args){
	    for (int i = 1, j = 1 ; j <= 9; i++ ){   // ����forѭ������������
			System.out.print(i + "*" + j + "=" + i*j + " ");
			if (i == j){						 // ����if�������������
				i = 0;
				j++;
				System.out.println();			 // ���е�����
			}
	    }
	}
}
// for (int i = 1; i <= 9��i++){
// for (j = i - 1; j <= 9; j++){