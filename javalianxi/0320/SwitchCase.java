public class SwitchCase{
	public static void main(String[] args){
	    int year = 2012;
		int month = 2;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			switch (month){
				case 2 :
					System.out.println(year + "��" + month + "����29��");
					break;
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 :
					System.out.println(month + "����31��");
					break;
				case 4 :
				case 6 :
				case 9 :
				case 11 :
					System.out.println(month + "����30��");
					break;
				default :
					System.out.println("��������·�����");
			
			}
		}else{
			switch (month){
				case 2 :
					System.out.println(year + "��" + month + "����28��");
					break;
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 :
					System.out.println(month + "����31��");
					break;
				case 4 :
				case 6 :
				case 9 :
				case 11 :
					System.out.println(month + "����30��");
					break;
				default :
					System.out.println("��������·�����");
			
			}
		}
	}
}