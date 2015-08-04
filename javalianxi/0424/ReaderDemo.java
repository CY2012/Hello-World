import java.io.*;

class ReaderDemo{

	public static void main(String[] args) throws IOException {
	    InputStream is = new FileInputStream("data.txt");
		InputStreamReader isr = new InputStreamReader(is);	//字节适配器
		BufferedReader br = new BufferedReader(isr);		//装饰成带缓冲字符流

		String data = null;
		int lineNumber = 0;
		while((data = br.readLine())!= null){
			lineNumber++;
			System.out.println(data);
		}
		System.out.println("共有" + lineNumber + "行");
		br.close();

		//0110 0001 ->'a'
		//0011 0001 ->'1'
		//ascii ->1字节 0 ~ 255
		//gbk -> 2字节 = 1字符，0000 0000 0000 0000 0~65535

		char c = 49;
		System.out.println(c);
	}
}