import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Patterntest{


	public static void main(String[] args){
	   Pattern p = Pattern.compile("[1-2]");

	   Scanner sc = new Scanner(System.in);
	   while (true){
		   System.out.println("ÇëÊäÈëÊı×Ö");
		   String s = sc.next();
		   Matcher m = p.matcher(s);
		   boolean b = m.matches();
		   if (b){
			   System.out.println(s);
			   break;
		   }
	   }
	}
}