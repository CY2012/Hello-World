class ArrayFinder{
	

	public void arrayDemo(){
		int[] array = new int[20];
		int j = 1;
		for (int i = 0;i < array.length  ; i++ ){			
			array[i] = j++;			
		}
		for (int tmp : array){
			System.out.print(tmp + " ");
		}
	}
	public static void main(String[] args){
		
		ArrayFinder af = new ArrayFinder();
		af.arrayDemo();
	}
}