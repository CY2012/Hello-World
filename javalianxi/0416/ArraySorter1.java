class ArraySorter1{

	public static void main(String[] args){
		ArraySorter as = new ArraySorter();
		int[] m = as.productArray(10,50);
		as.printArray(m);
		//ð������
		for (int i = 0;i < m.length ;i++ ){
			for (int j = 0;j < m.length - i - 1;j++ ){
				if (m[j] > m [j + 1]){
					int tmp = m[j + 1];
					m[j + 1] = m[j];
					m[j] = tmp;
				}
			}			
		}		
		System.out.println("��������������������󡣡�������������");
		as.printArray(m);
	}
	/**
	* ������������飬����ΪarrayLen����Χ��arrayScope��
	*
	*/
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