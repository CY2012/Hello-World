class FoundSorter{
	
	public int[] productArray(int arrayLen,int arrayScope){
		int[] r = new int[arrayLen];
		for (int j = 0;j < arrayLen ;j++ ){
			r[j] = (int)(Math.random() * arrayScope);
		}
		return r;		
	}
	public void printArray(int i[]){
		int index = 0;
		for (int j : i ){
			System.out.println("i[" + (index++) + "] = " + j);
		}
	} 
	public static void main(String[] args){
		FoundSorter fs = new FoundSorter();
		int[] m = fs.productArray(10,50);
		fs.printArray(m);
	}
}
// 其余的在0412文件夹中