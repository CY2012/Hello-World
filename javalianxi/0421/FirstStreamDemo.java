import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.InputStream;
import java.io.FileInputStream;

import java.io.OutputStream;
import java.io.FileOutputStream;

  
class FirstStreamDemo{

	public static void main(String[] args){
	    		    
		InputStream is = null;
		OutputStream os = null;
		try{
			is = new FileInputStream("d:\\data.txt");//输入
			os = new FileOutputStream("c:\\data.txt");//输出
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}

		
		//操纵流int
		int data = 0;
		try{
			while((data = is.read()) != -1){
				System.out.print((char)data + "");				
				os.write(data);//d盘读一个就往c盘写一个
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