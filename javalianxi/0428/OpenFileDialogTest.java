import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FileDialog;

class OpenFileDialogTest{
	public static void main(String[] args){
	    
	
		final JFrame f = new JFrame();	
		f.setBounds(200,200,200,200);
		f.setVisible(true);
		JButton b = new JButton("test");
		f.add(b);
		b.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				FileDialog fd = new FileDialog(f,"��",FileDialog.LOAD);
				
				fd.setDirectory("d:\\javalianxi");
				fd.setVisible(true);

				System.out.println(fd.getDirectory());
				System.out.println(fd.getFile());
			}
		});
	}
}
				