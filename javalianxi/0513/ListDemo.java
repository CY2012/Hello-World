import java.util.Iterator;
import java.util.List;

class ListDemo{
	public static void main(String[] args){
		
		List<E> lst = new ArrayList();
		System.out.println("��������" + lst.size());
		for (int i = 1; i < 11; i++) {
			lst.add(i);
		}
		System.out.println("��������" + lst.size());
		//���������������е�Ԫ��
		Iterator<E> iter = lst.iterator();
		
		//����
		while(iter.hasNext()){
			Object o = iter.next();
			System.out.println(o);
			System.out.println(o.getClass().getName() + ":" + o);
					
		}
	}
}