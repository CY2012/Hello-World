import java.util.Scanner;

class AirTicket{
	public static void main(String[] args){
	    int[][] seats = new int[7][4];
		for (int m = 0;m < seats.length ;m++){
			for (int n = 0;n < 4 ;n++ ){
			}
		}
		/*
		seats[0] = new int[]{0,0,0,0};
		seats[1] = new int[]{0,0,0,0};
		seats[2] = new int[]{0,0,0,0};
		seats[3] = new int[]{0,0,0,0};
		seats[4] = new int[]{0,0,0,0};
		seats[5] = new int[]{0,0,0,0};
		seats[6] = new int[]{0,0,0,0};
		*/
		
		int i =0,j=0;
		for (i = 0 ;i < seats.length ;i++ ){			
			for (j = 0;j < seats[i].length ;j++ ){				
				System.out.print(seats[i][j] + "  " );				
			}
			System.out.println();
		}
		
		boolean sign = true;
		while(sign){
			System.out.println("��������Ҫ���ҵ���λ");
			Scanner sc = new Scanner(System.in);
			System.out.println("�������ź�,��ΧΪ1����7");
			i = sc.nextInt();
			System.out.println("�������к�,��ΧΪ1����4");
			j = sc.nextInt();			
		
			if(seats[i-1][j-1] == 0){			
				System.out.println("��ϲ���򵽵�"+i+"��,��"+ j +"�е�Ʊ");
				seats[i-1][j-1] = 1;//��������
				//��ӡ�����º������
				for (i = 0 ;i < seats.length ;i++ ){			
					for (j = 0;j < seats[i].length ;j++ ){				
						System.out.print(seats[i][j] + "  " );				
					}
					System.out.println();
				}
				
				System.out.println("����ɹ����Ƿ�������򣬰�1�������򣬰�0�˳�����ѡ��");				
				int k = sc.nextInt();
				
				if (k == 1){
					continue;
				}else{
					System.exit(0);
				}

			}else{
				System.out.println("�Բ��𣬴���λ�Ѿ���������������ѡ��������λ");
				continue;
			}
		}
	}
}