import java.io.File;
import java.io.IOException;

public class FileDemo{

	public static void main(String[] args)throws IOException{
		
		File file = new File("D:\\photp");
		boolean flag = file.isDirectory();
		if (true){
			System.out.println("�ļ��д����ɹ�");
			file.mkdir();
		}else{
			System.out.println("����һ���ļ���");
		}
		file = new File("D:\\photp\\����");
		if (true){
			System.out.println("�ļ��д����ɹ�");
			file.mkdir();
		}else{
			System.out.println("����һ���ļ���");
		}
		file = new File("D:\\photp\\����");
		if (true){
			System.out.println("�ļ��д����ɹ�");
			file.mkdir();
		}else{
			System.out.println("����һ���ļ���");
		}
		file = new File("D:\\photp\\����");
		if (true){
			System.out.println("�ļ��д����ɹ�");
			file.mkdir();
		}else{
			System.out.println("����һ���ļ���");
		}
		file = new File("D:\\photp\\˵��.txt");
		boolean b = file.isFile();
		if (true){
			System.out.println("�ļ������ɹ�");
			file.createNewFile();
		}else{
			System.out.println("����һ���ļ�");
		}
	}
}