class BubbleSorter{


	public static void main(String[] args){
	    int[] m = new int[]{5,4,3,2,1};
		for (int i = 0;i < m.length  ;i++ ){	
			for (int j = 0; j < 4; j++){	
				if (m[j] > m[j+1]){
					int tmp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = tmp;	
				}			
			}			
		}
	}
}