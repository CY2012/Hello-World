public class SuShu{
	public static void main(String[] args){
	    //int rand = (int)(Math.random() * 100) + 1;
		boolean bb = false;

		for (int i = 101;i <= 200  ;i++ ){
			for (int j = 2;j < i ;j++ ){
				if (i % j == 0){
					bb = true;
					break;
				}
			}
			//如果bb=true，i就不是素数。
			if(bb){
				System.out.println(i + "不是素数" );
				bb = false;
			}else{
				System.out.println(i + "是素数" );
			}
		}
		
	}
}