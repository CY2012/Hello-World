import java.io.*;


class InputDemo{

	public static void main(String[] args)throws IOException{
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("D:\\photp\\˵��.txt");
		PrintWriter pw = new PrintWriter(os,true);
		
		String content = null;
		System.out.println("�������ļ������ݲ�����end������");
		while((content = br.readLine())!= null){
			if("end".equals(content)){
				break;
			}
			pw.println(content);
		}
		br.close();
		pw.close();
	}
}
