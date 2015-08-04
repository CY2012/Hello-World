class ArrayOfScore{

	public static void main(String[] args){

	    if (args.length > 0){
			int max = Integer.parseInt(args[0]);
			for (int i = 1; i < args.length ;i++ ){
				if (max < Integer.parseInt(args[i])){
					max = Integer.parseInt(args[i]);
				}
			}
			System.out.println("最大值为" + max);
	    }
	}
}