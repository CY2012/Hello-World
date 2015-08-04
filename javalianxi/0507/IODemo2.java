import java.util.Random;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class IODemo2{
	public static void main(String[] args){
		OutputStream os = null;

		try{
			os = new FileOutputStream("d:\\mydata.txt");
			Random rand = new Random();
			for(int i = 0 ; i < 10 ; i++){
				
				int num = rand.nextInt(26) + 97;
				os.write(num);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(os != null)
					os.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}