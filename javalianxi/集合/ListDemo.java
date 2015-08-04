import java.util.ArrayList;

public class ListDemo
{
	public static void main(String[] args){
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> ll = new LinkedList<Integer>();

		long s = System.currentTimeMillis();
		for (int i = 0; i < 1000000 ; i++ )
		{
			l.add(0,i);
		}

		long e = System.currentTimeMillis();
		System.out.println( e - s );
		
		s = System.currentTimeMillis();
		for (int i = 0; i < 1000000 ; i++ )
		{
			ll.add(0,i);
		}

		e = System.currentTimeMillis();
		System.out.println( e - s );
		
		
		
	}
}