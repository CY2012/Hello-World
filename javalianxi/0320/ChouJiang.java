public class ChouJiang{
	public static void main(String[] args){
		// Math.random()Ϊ0��1������1���������Ϊdouble�� ��ǿתΪint��
	   int n1 = (int) (Math.random() * 2);
	   int n2 = (int) (Math.random() * 2); 
	   int n3 = (int) (Math.random() * 2); 
	   int n4 = (int) (Math.random() * 2);

	   String result = "";

	   if ((n1 == 1) && (n2 == 1) && (n3 == 1) && (n4 == 1) )
	   {   System.out.println("����﹧ϲ������һ�Ƚ�");
	   }
	   else if (n1 == 1 && n2 == 1 && n3 == 1 && n4 == 0 )
	   {System.out.println("����ϲ�����˶��Ƚ�");
	   }
	   else if (n1 == 1 && n2 == 1 && n3 == 0 && n4 == 0 )
	   {   System.out.println("����ϲ���������Ƚ�");
	   }else{
		   result = ((n1 == 1) ? "��" :"��") + ((n2 == 1) ? "��" :"��") + 
			   ((n3 == 1) ? "��" :"��") + ((n4 == 1) ? "��" :"��");
	   
	   System.out.println(result + ",���ź�,û���н�");
	   }
	   
	 }
	
}