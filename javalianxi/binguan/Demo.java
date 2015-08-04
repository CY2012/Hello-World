
package binguan;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


class Demo{
 

  public static void main (String []args){
	  
	DateFormat df=new SimpleDateFormat("yyyy-MM-dd");

	Date d=null;
	try{
		d=df.parse("2015-05-06");
		System.out.println(df.format(d));
	
	   }catch(ParseException e){
	    System.out.println("您要转换的日期格式不对");
	   }
        System.out.println(d);
     }

}