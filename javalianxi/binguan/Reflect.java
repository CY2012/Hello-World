package binguan;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//����
class Reflect{

	public static void main (String []args) throws ParseException, Exception{
		Custom c=new Custom();
		Class clazz=c.getClass();
		Field[] fields=clazz.getDeclaredFields();// ���� Field �����һ�����飬��Щ����ӳ�� Class ��������ʾ�����ӿ��������������ֶΡ�

		System.out.println(fields.length);
		Scanner sc=new Scanner(System.in);
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");

		for(int i=0;i< fields.length;i++){
			System.out.println("������"+fields[i].getName()+"ֵ��");
			String s=sc.next();
			//ÿһ����ĸ���д
			String  methodName= "set"+fields[i].getName().substring(0,1).toUpperCase()+ 
			fields[i].getName().substring(1);
			Object returnObj=null;
			System.out.println(fields[i].getType());


			if(fields[i].getType()== Date.class){
				returnObj=invokeMethod(c,methodName,fields[i].getType(),new Object[] {df.parse(s)});
			}else if(fields[i].getType()==int.class){
				returnObj=invokeMethod(c,methodName,fields[i].getType(),new Object[] {Integer.parseInt(s)});
			}else {
				returnObj=invokeMethod(c,methodName,fields[i].getType(),new Object[] {s});
			} 
		}
		System.out.println(c);
	} 
        

  

	public static Object invokeMethod(Object owner,String methodName,Class paramType,Object[] args) throws Exception{
		Class clazz=owner.getClass();
		Method method = clazz.getMethod(methodName, paramType);
	    
		return method.invoke(owner,args);

	}
  
}