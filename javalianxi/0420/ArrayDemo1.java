import static com.wyhello.util.ArrayUtils.*;
import com.wyhello.util.ArrayUtilsException;

class ArrayDemo1{
	public static void main(String[] args){
	    
		int [] i = null;
		try{
			i = productArray(20,25,true);
		}catch(ArrayUtilsException e){
			e.printStackTrace();
		}
		printArray(i);
		System.out.println("����");
		try{
			choiceSort(i);
		}catch(ArrayUtilsException e){
			e.printStackTrace();
		}
		printArray(i);
		//int index = binaryFind(i,20);
		//System.out.println(index);
		int index = binaryFind2(i,20,0,i.length - 1);
		System.out.println(index);

		//f(5);


		//������
		//int[] i = {2,3,4,5,6,8,9,10,11,12,13,14,16,18,20,21,22,23,24,25};
		//printArray(i);
		//int index = binaryFind(i,20);
		//System.out.println(index);
		
	}
	public static int f(int i){
		System.out.println(i);
		//
		int result = 0;
		if (i <= 1){
			//����
			return result;
		}else{
			result = i * f(i - 1);
			System.out.println(i + "* f(" + (i - 1) + ")");
			return result;
		}
	} 
}