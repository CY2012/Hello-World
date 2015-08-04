public class ThrowsTest{

	public static void main(String[] args){
	    
		try{
			int result = new ThrowsTest().divide(3,0);
			System.out.println("结果是" + result);
		}catch(Exception e){
		
			e.printStackTrace();
			System.out.println("出现运行错误：除数不能为0");
		}
	}

	public int divide(int x,int y)throws Exception{
	
		int result = x/y;
		return result;
	}

}