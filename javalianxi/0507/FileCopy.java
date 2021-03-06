import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class FileCopy{
	public static void main(String[] args){
	   InputStream is = null;
	   OutputStream os = null;
		try{
			is = new FileInputStream("d:\\fukua.mp3");
			os = new FileOutputStream("d:\\myfukua.mp3"); 
			int data = 0;
			long startTime = System.currentTimeMillis();
			while((data = is.read()) != -1){
				os.write(data);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("拷贝文件共消耗的时间为" + (endTime - startTime) + "ms" );
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(is != null){
					is.close();
				}					
				if(os != null){
					os.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		} 
	}
}