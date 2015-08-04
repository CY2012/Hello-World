
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Font;


class MyFrame extends Frame{

	public MyFrame(){
		setSize(500,500);
		setLocation(300,300);
		setVisible(true);
		Dimension d = new Dimension(150,40);
		
		Button b = new Button("我的第一个按钮");
		
		Font f = new Font("SansSerif",3,30);
		b.setFont(f);
		b.addActionListener(new MyFirstListener());//3.注册监听器
		add(b);
		b.setSize(d);
		pack();
	}
	public static void main(String[] args){
	    new MyFrame();
	}
}
//1.定义监听器类
class MyFirstListener implements ActionListener{

	public void actionPerformed(ActionEvent e){
		System.out.println("退出");
		System.exit(0);
	}
}