import java.util.Scanner;


public class ZuoYe1{
	public static void main(String[] args){
	    /*
		
		System.out.println("请输入三个整数:");
		Scanner sc = new Scanner(System.in);
		System.out.println("x = ");
		int x = sc.nextInt();

		System.out.println("y = ");
		int y = sc.nextInt();

		System.out.println("z = ");
		int z = sc.nextInt();

		int temp;
		if (x >  y){
			temp = y;
			y = x;
			x = temp;
		}
		if (x > z){
			System.out.println(z + " " + x + " " + y);
		}
		else {
			if (y < z){
				System.out.println(x + " " + y + " " + z);

			}
			else { 
				System.out.println(x + " " + z + " " + y);
			}
		}
		*/
		int x = 30,y =40, z = 20;
		int max;
		int min;
		if (x > y){
			 max = x;
			 x = y;
			 y = max;
		}
		if (x > z){
			 max = x;
			 x = z;
			 z = max;
			
		}
		if (y > z){
			 min = y;
			 y = z;
			 z = min;

		}
		System.out.println(x + " " + y + " " + z);

	}
}
