public class ChouJiang{
	public static void main(String[] args){
		// Math.random()为0到1不包括1的随机数，为double型 需强转为int。
	   int n1 = (int) (Math.random() * 2);
	   int n2 = (int) (Math.random() * 2); 
	   int n3 = (int) (Math.random() * 2); 
	   int n4 = (int) (Math.random() * 2);

	   String result = "";

	   if ((n1 == 1) && (n2 == 1) && (n3 == 1) && (n4 == 1) )
	   {   System.out.println("★★★★恭喜您中了一等奖");
	   }
	   else if (n1 == 1 && n2 == 1 && n3 == 1 && n4 == 0 )
	   {System.out.println("★★★☆恭喜您中了二等奖");
	   }
	   else if (n1 == 1 && n2 == 1 && n3 == 0 && n4 == 0 )
	   {   System.out.println("★★☆☆恭喜您中了三等奖");
	   }else{
		   result = ((n1 == 1) ? "★" :"☆") + ((n2 == 1) ? "★" :"☆") + 
			   ((n3 == 1) ? "★" :"☆") + ((n4 == 1) ? "★" :"☆");
	   
	   System.out.println(result + ",很遗憾,没有中奖");
	   }
	   
	 }
	
}