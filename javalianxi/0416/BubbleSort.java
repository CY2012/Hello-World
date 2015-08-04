class BubbleSort{

	//ð������
	public static void bubble(int[] array){
		/*
		for (int j = 0; j < array.length ;j++ ){
			for (int i = 0; i < array.length - 1 - j ;i++ ){
				if (array[i] > array[i + 1]){
					int t = array[i];
					array[i] = array[i + 1];
					array[i + 1] = t; 
				}
			}
		}*/

		for (int j = 0; j < array.length ;j++ ){
			for (int i = array.length - 1; i > j ;i-- ){
				if (array[i] < array[i - 1]){
					int t = array[i];
					array[i] = array[i - 1];
					array[i - 1] = t; 
				}
			}
			//System.out.print("��" + j + "������");
			//ArraySorter.printArray(array);
		}

	}

	public static void choiceSort(int[] array){
		for (int j = 0; j < array.length ;j++ ){
		
			int min = j;
			for (int i = j + 1; i < array.length;i++){
				if (array[min] > array[i] ){
					min = i;
				}
			}
			if (min != j){
				int t = array[j];
				array[j] = array[min];
				array[min] = t;
			}
		}
	}

	public static void main(String[] args){
		int[] m = ArraySorter.productArray(10,100);
		ArraySorter.printArray(m);
		
		System.out.println("����ð�������");
		bubble(m);
		//System.out.println("����ѡ�������");
		//choiceSort(m);
		ArraySorter.printArray(m);

	}

}