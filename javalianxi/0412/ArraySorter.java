class ArraySorter{

	public static void main(String[] args){
		/*
		ArraySorter as = new ArraySorter();
		int[] m = as.productArray(10,50);
		as.printArray(m);
		*/
		//ð������
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

		//ѡ������
		/*
		System.out.println("ѡ������֮����С����");
		for (int j = 0; j < m.length ;j++ ){
			int minIndex = j;	//����ǰ�±궨��Ϊ��Сֵ
			for (int i = j + 1; i < m.length ;i++ ){
				if(m[minIndex] > m[i]){
					minIndex = i;
				}
			}
			//����
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
	* ������������飬����ΪarrayLen����Χ��arrayScope��
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