import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

class IODemo{
	
	public static void main(String[] args){
	    InputStream is = null;
		try{
			is = new FileInputStream("d:\\data.txt");
			int data = is.read();

			while(data != -1){
				System.out.print((char)data);
				System.out.print("");
				data = is.read();
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(is != null)
					is.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}