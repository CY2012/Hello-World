class ArraySorter1{

	public static void main(String[] args){
		ArraySorter as = new ArraySorter();
		int[] m = as.productArray(10,50);
		as.printArray(m);
		//冒泡排序
		for (int i = 0;i < m.length ;i++ ){
			for (int j = 0;j < m.length - i - 1;j++ ){
				if (m[j] > m [j + 1]){
					int tmp = m[j + 1];
					m[j + 1] = m[j];
					m[j] = tmp;
				}
			}			
		}		
		System.out.println("。。。。。。。。排序后。。。。。。。。");
		as.printArray(m);
		
		/*
		//选择排序
		System.out.println("选择排序之后最小的数");
		for (int j = 0;j < m.length ; j++){
			int minIndex = j;//将当前下标定义为最小值
			for (int i = j + 1;i < m.length ;i++ ){
				if(m[minIndex] > m[i]){
					minIndex = i;
				}
			}
			//交换
			if(minIndex != j){
				int tmp = m[j];
				m[j] = m[minIndex];
				m[minIndex] = tmp;
			}
		}
		as.printArray(m);
		*/
	}
	
	public int[] productArray(int arrayLen,int arrayScope){
		int[] i = new int[arrayLen];
		for (int j = 0;j < arrayLen ;j++ ){
			i[j] = (int)(Math.random() * arrayScope);
		}
		return i;
	}
	public void printArray(int i[]){
		int index = 0;
		for (int j : i ){
			System.out.println("i[" + (index++) + "] = " + j);
		}
	}
}
