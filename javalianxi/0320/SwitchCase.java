public class SwitchCase{
	public static void main(String[] args){
	    int year = 2012;
		int month = 2;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			switch (month){
				case 2 :
					System.out.println(year + "年" + month + "月有29天");
					break;
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 :
					System.out.println(month + "月有31天");
					break;
				case 4 :
				case 6 :
				case 9 :
				case 11 :
					System.out.println(month + "月有30天");
					break;
				default :
					System.out.println("你输入的月份有误");
			
			}
		}else{
			switch (month){
				case 2 :
					System.out.println(year + "年" + month + "月有28天");
					break;
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 :
					System.out.println(month + "月有31天");
					break;
				case 4 :
				case 6 :
				case 9 :
				case 11 :
					System.out.println(month + "月有30天");
					break;
				default :
					System.out.println("你输入的月份有误");
			
			}
		}
	}
}