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
			is = new FileInputStream("d:\\data.txt");//����
			os = new FileOutputStream("c:\\data.txt");//���
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}

		
		//������int
		int data = 0;
		try{
			while((data = is.read()) != -1){
				System.out.print((char)data + "");				
				os.write(data);//d�̶�һ������c��дһ��
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