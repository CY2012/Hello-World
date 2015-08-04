import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Person{
	private Integer id;
	private String name;


	public Person(){
	
	}
	public Person(Integer id){
	
	}
	public Person(String name){
	
	}

	public Person(Integer id,String name){
		this.id = id;
		this.name = name;
	}

	public String toString(){
		return "id = " + id + ",name = " + name;
	}
	
}

class PersonDemo{
	public static void main(String[] args){
	    Person p = null;
		try{
			Class clazz = Class.forName("Person");//创建一个person对象
			//Constructor[] co = clazz.getDeclaredConstructors();
			/*
			for(Constructor c : co){
				System.out.println(c.getName());
			}
			*/
			Constructor c = clazz.getDeclaredConstructor(Integer.class,String.class);
			p = (Person)c.newInstance(new Integer(10),"tom");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(NoSuchMethodException e){
			e.printStackTrace();
		}catch(SecurityException e){
			e.printStackTrace();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
		System.out.println(p);
	}
}