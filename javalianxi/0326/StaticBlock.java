import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.*;

class StaticBlock{
	static int i = 100;
	int j = 10;

	static{   //¾²Ì¬´úÂë¿é
		System.out.println("StaticBlock1");
	}
	static{   //¾²Ì¬´úÂë¿é
		System.out.println("StaticBlock2");
		//a();   error
	}
	public void a(){
		System.out.println("a()");
	}
}
class StaticBlockDemo{
	public static void main(String[] args){
		StaticBlock s = new StaticBlock();
		double r = Math.random();
		double n = Math.pow(4,3);
		double f = Math.floor(23.9);
		long l = Math.round(34.5);
		System.out.println(r);
		System.out.println(n);
		System.out.println(f);
	    
	}
	
}