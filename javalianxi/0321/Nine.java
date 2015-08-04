public class Nine{
	public static void main(String[] args){
	    for (int i = 1, j = 1 ; j <= 9; i++ ){   // 利用for循环来控制行数
			System.out.print(i + "*" + j + "=" + i*j + " ");
			if (i == j){						 // 利用if语句来控制列数
				i = 0;
				j++;
				System.out.println();			 // 换行的作用
			}
	    }
	}
}
// for (int i = 1; i <= 9；i++){
// for (j = i - 1; j <= 9; j++){