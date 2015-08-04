
class FirstStreamDemo{

	public static void main(String[] args){
	    
		InputStream is = null;
		try{
			is = new FileInputStream("d:\\data.txt")//
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		//²Ù×ÝÁ÷int
		int data = 0;
		try{
			while((data = is.read()) != -1){
				System.out.print((char)data + "");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if (is != null){
					is.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}