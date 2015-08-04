import java.io.File;
import java.io.IOException;

public class FileDemo{

	public static void main(String[] args)throws IOException{
		
		File file = new File("D:\\photp");
		boolean flag = file.isDirectory();
		if (true){
			System.out.println("文件夹创建成功");
			file.mkdir();
		}else{
			System.out.println("不是一个文件夹");
		}
		file = new File("D:\\photp\\生活");
		if (true){
			System.out.println("文件夹创建成功");
			file.mkdir();
		}else{
			System.out.println("不是一个文件夹");
		}
		file = new File("D:\\photp\\娱乐");
		if (true){
			System.out.println("文件夹创建成功");
			file.mkdir();
		}else{
			System.out.println("不是一个文件夹");
		}
		file = new File("D:\\photp\\旅游");
		if (true){
			System.out.println("文件夹创建成功");
			file.mkdir();
		}else{
			System.out.println("不是一个文件夹");
		}
		file = new File("D:\\photp\\说明.txt");
		boolean b = file.isFile();
		if (true){
			System.out.println("文件创建成功");
			file.createNewFile();
		}else{
			System.out.println("不是一个文件");
		}
	}
}