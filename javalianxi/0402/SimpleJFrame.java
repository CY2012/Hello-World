import javax.swing.JFrame;
import java.util.Scanner;

class SimpleJFrame extends JFrame{
	
	public SimpleJFrame(){
	
	}

	public SimpleJFrame(int width,int height,int x,int y){
		/*
		setSize(width,height);
		setLocation(x,y);
		*/
		setBounds(x,y,width,height);
	}

	public SimpleJFrame(int width,int height,int x,int y,String title){
		this(width,height,x,y);
		setTitle(title);

	}
	public static void main(String[] args){
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("�ᰴ˳�����봰��Ŀ�ȣ��߶ȣ�x���꣬y���꣬����");
		int w = sc.nextInt(); 
		int h = sc.nextInt(); 
		int x = sc.nextInt(); 
		int y = sc.nextInt();
		String s = sc.next();
		SimpleJFrame sj = new SimpleJFrame(w,h,x,y,s);
		sj.setVisible(true);
	}	
}
