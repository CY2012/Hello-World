class ArrayDemo1{
	
	public static void main(String[] args){
	    

		int[] ix = {1,2,3,4,5,6};
		for (int i = 0;i < ix.length ; i++ ){
			System.out.println("ix[" + i +  "] = " + ix[i]);
		}
		//��ǿ��forѭ��
		for(int temp : ix){
			System.out.println(temp);
		}
	}
}