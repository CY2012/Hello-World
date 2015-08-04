import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.*;

class MyLayoutDemo extends JFrame{

	
	public MyLayoutDemo(){
	
		setSize(500,600);
		setLocation(400,200);
		add(new JButton("North"),BorderLayout.NORTH);
		add(new JButton("South"),BorderLayout.SOUTH);
		add(new JButton("East"),BorderLayout.EAST);
		add(new JButton("West"),BorderLayout.WEST);
		add(new JButton("Center"),BorderLayout.CENTER);
    
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
	    new MyLayoutDemo();
	}
}
