import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
class Student
{
	String name ;
	int age;

	public Student(String name , int age ){
		this.name = name;
		this.age = age;
	}
}

class ListDemo1 
{
	public static void main(String[] args){
		int sum = 0;
		List list = new ArrayList();
		list.add(new Student("cq",90));
		list.add(new Student("cy",86));
		list.add(new Student("ytt",89));
		
		for (int i = 0 ; i < lst.size() ; i++ )
		{

			Object o =list.get(i);
			if(o instanceof student){
				Student s = (Student)o;
				sum += s.age;
			}
			
		}

		System.out.println(sum * 1.0 / list.size());
	}
		
/*		Iterator iter = list.iterator();

		while(iter.hasNext()){
			Object o = iter.next();
			Student s = (Student)o;
			sum += s.age;
		}
		sum = sum / 3;
		System.out.println(sum);
*/
	}
}	