public class ThrowsTest{

	public static void main(String[] args){
	    
		try{
			int result = new ThrowsTest().divide(3,0);
			System.out.println("�����" + result);
		}catch(Exception e){
		
			e.printStackTrace();
			System.out.println("�������д��󣺳�������Ϊ0");
		}
	}

	public int divide(int x,int y)throws Exception{
	
		int result = x/y;
		return result;
	}

}