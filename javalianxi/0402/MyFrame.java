
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
		
		Button b = new Button("�ҵĵ�һ����ť");
		
		Font f = new Font("SansSerif",3,30);
		b.setFont(f);
		b.addActionListener(new MyFirstListener());//3.ע�������
		add(b);
		b.setSize(d);
		pack();
	}
	public static void main(String[] args){
	    new MyFrame();
	}
}
//1.�����������
class MyFirstListener implements ActionListener{

	public void actionPerformed(ActionEvent e){
		System.out.println("�˳�");
		System.exit(0);
	}
}