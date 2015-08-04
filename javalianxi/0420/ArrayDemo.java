import static com.wyhello.util.ArrayUtils.*;
import com.wyhello.util.ArrayUtilsException;

class ArrayDemo{

	public static void main(String[] args){
		//
		int[] iArrays = null;
		
		try{
			iArrays = productArray(15,20,true);
			//iArrays = productArray(20,25,false);
		}catch(ArrayUtilsException e){
			System.out.println(e.getMessage());
		}
		int[] iArrays1 = copyArray(iArrays);
		
		//System.out.println(iArrays);
		//System.out.println(iArrays1);
		printArray(iArrays);
		//printArray(iArrays1);
		try{
			choiceSort(iArrays);
		}catch(ArrayUtilsException e){
			System.out.println(e.getMessage());
		}
		System.out.println("—°‘Ò≈≈–Ú°£°£°£°£");
		printArray(iArrays);
		System.out.println("√∞≈›≈≈–Ú°£°£°£°£");
		try{
			bubbleSort(iArrays1);
		}catch (ArrayUtilsException e){
			System.out.println(e.getMessage());
		}
		printArray(iArrays1);

	}
}