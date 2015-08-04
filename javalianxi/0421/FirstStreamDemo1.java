import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

class FirstStreamDemo1{
	
	public static void main(String[] args){
		
		OutputStream os = null;
		try{
			os = new FileOutputStream("c:\\data.txt");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

		//int data = 0;
		try{
			while((data = os.write()) != -1){
				System.out.print((char)data + "hello");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if (os != null){
					os.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}