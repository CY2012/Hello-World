import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

class FirstStream{
	public static void main(String[] args)throws IOException{
	    InputStream is = new ByteArrayInputStream(new byte[]{1,2,3,4,5,6,7,8,9});
		int data = is.read();
		while (data != -1){
			System.out.println(data);
			data = is.read();
		}

		is.close();
	}
}