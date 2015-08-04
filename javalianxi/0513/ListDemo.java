import java.util.Iterator;
import java.util.List;

class ListDemo{
	public static void main(String[] args){
		
		List<E> lst = new ArrayList();
		System.out.println("集合中有" + lst.size());
		for (int i = 1; i < 11; i++) {
			lst.add(i);
		}
		System.out.println("集合中有" + lst.size());
		//迭代器遍历集合中的元素
		Iterator<E> iter = lst.iterator();
		
		//迭代
		while(iter.hasNext()){
			Object o = iter.next();
			System.out.println(o);
			System.out.println(o.getClass().getName() + ":" + o);
					
		}
	}
}