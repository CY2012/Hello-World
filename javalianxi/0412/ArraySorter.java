class ArraySorter{

	public static void main(String[] args){
		/*
		ArraySorter as = new ArraySorter();
		int[] m = as.productArray(10,50);
		as.printArray(m);
		*/
		//冒泡排序
		/*
		for (int j = 0; j < length; j++ ){
			for (int i = 0; i < 6 - j - 1 ;i++ ){
				if (m[i] > m[i + 1]){
					int tmp = m[i];
					m[i] = m[i + 1];
					m[i + 1] = tmp;
				}
			}
		}
		*/

		//选择排序
		/*
		System.out.println("选择排序之后最小的数");
		for (int j = 0; j < m.length ;j++ ){
			int minIndex = j;	//将当前下标定义为最小值
			for (int i = j + 1; i < m.length ;i++ ){
				if(m[minIndex] > m[i]){
					minIndex = i;
				}
			}
			//交换
			if (minIndex != j){
				int tmp = m[j];
				m[j] = m[minIndex];
				m[minIndex] = tmp;
			}

		}

		as.printArray(m);
		*/
	}

	/**
	* 生成随机数数组，长度为arrayLen，范围在arrayScope内
	*
	*/
	public static int[] productArray(int arrayLen, int arrayScope){
		int[] i = new int[arrayLen];
		for (int j = 0; j < arrayLen ;j++ ){
			i[j] = (int)(Math.random() * arrayScope);
		}
		return i;
	}
	
	public static void printArray(int i[]){
		int index = 0;
		for (int j : i){
			System.out.print(j + "  ");
		}
		System.out.println();
	}

}