import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileCopy{
	public static void main(String[] args){
	    
		InputStream is = null;
		OutputStream os = null;


		try{
			is = new FileInputStream("cat.gif");//会抛出异常
			os = new FileOutputStream("d:\\cat.gif");

			int len = 0;
			long startTime = System.currentTimeMillis();
			byte[] buff = new byte[4096]; //1kb 1024b
			while((len = is.read(buff))!= -1){		//read()会抛异常
				os.write(buff,0,len);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("拷贝共消耗" + (endTime - startTime) + "ms");
		}catch(FileNotFoundException e){
			e.printStackTrace();//文件没找到异常
		}catch(IOException e){
			e.printStackTrace();//读取数据异常
		}finally{
			try{
				if (is != null){
					is.close();
				}
				if (os != null){
					os.close();
				}
			}catch(IOException e){
				e.printStackTrace();//读取数据异常
			}
		}
	}
}