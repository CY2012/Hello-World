import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class FileCopy2{
	public static void main(String[] args){
	   InputStream is = null;
	   OutputStream os = null;
	   byte[] buffer = new byte[1024];
		try{
			is = new FileInputStream("d:\\fukua.mp3");
			os = new FileOutputStream("d:\\myfukua.mp3"); 
			int len = 0;
			long startTime = System.currentTimeMillis();
			while((len = is.read(buffer)) != -1){
				os.write(buffer,0,len);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("�����ļ������ĵ�ʱ��Ϊ" + (endTime - startTime) + "ms" );
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