import java.io.*;

class ReaderDemo{

	public static void main(String[] args) throws IOException {
	    InputStream is = new FileInputStream("data.txt");
		InputStreamReader isr = new InputStreamReader(is);	//�ֽ�������
		BufferedReader br = new BufferedReader(isr);		//װ�γɴ������ַ���

		String data = null;
		int lineNumber = 0;
		while((data = br.readLine())!= null){
			lineNumber++;
			System.out.println(data);
		}
		System.out.println("����" + lineNumber + "��");
		br.close();

		//0110 0001 ->'a'
		//0011 0001 ->'1'
		//ascii ->1�ֽ� 0 ~ 255
		//gbk -> 2�ֽ� = 1�ַ���0000 0000 0000 0000 0~65535

		char c = 49;
		System.out.println(c);
	}
}