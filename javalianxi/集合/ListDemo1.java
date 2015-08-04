import java.util.List;
import java.util.ArrayList;
class ListDemo1 
{
	public static void main(String[] args){
		List list = new ArrayList();
		for ( int i = 1; i < 11 ; i++ )
		{
			list.add(i);
		}
		Iterator iter = list.iterator;

		while(iter.hasNext()){
			Object o = iter.next();
			System.out.println(o);
		}
	}
}	