import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;//�ӹ�����
import javax.swing.JTextArea;
 
 /** ��һ�¼��±��������˵���
 �ļ����½�/��/����/���/�˳�
 �༭������/����/����/ճ��/ɾ��/����/�滻/ȫѡ
 ���������ڼ��±����رմ��ڲ���JVM��dispose����)
 */
public class NotePad2 implements ActionListener{
    JFrame jf = new JFrame("���±�");
    JTextArea jta = new JTextArea(10,20);//���±�,��ʾ���ı��Ķ�������
     
    public NotePad2(){
    String[] menuLabel ={"�ļ�", "�༭","����"};
    String[][] miLabel ={{"�½�", "" ,  "��",  "����",  "���","" , "�˳�"},
        {"����",  "����",  "����",  "ճ��", " ɾ��", "","����",  "�滻", "" ,"ȫѡ"}, 
        {" ���ڼ��±�"} 
         };
        JMenuBar jmb = new JMenuBar();
        for(int i=0;i<menuLabel.length;i++){
            JMenu jm = new JMenu(menuLabel[i]);
            jmb.add(jm);
              for(int j=0;j<miLabel[i].length;j++){
                  if("".equals(miLabel[i][j])){
                      jm.addSeparator();
                  }else{
                      JMenuItem jmi = new JMenuItem(miLabel[i][j]);
                      jm.add(jmi);
                      jmi.addActionListener(this);
                  }
			  }
          }
        jf.setJMenuBar(jmb);//JFrame�Ӳ˵���ʱ��setJmenuBar(),����add
        jf.add(new JScrollPane(jta));//�ӹ�����
        jf.setLocation(300,300);//��Ƴ��ֵ�λ�� 
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        String comm = e.getActionCommand();
        if("�½�".equals(comm)){
            jta.setText("");
        }else if("��".equals(comm)){
            //FileDialog ����ʾһ���Ի��򴰿ڣ��û����Դ���ѡ���ļ�
            //��������һ��ģʽ�Ի��򣬵�Ӧ�ó�������� show ��������ʾ�Ի���ʱ��
            //������������Ӧ�ó���ֱ���û�ѡ��һ���ļ�
            FileDialog fd = new FileDialog(jf,"��ѡ��Ҫ�򿪵��ļ�",FileDialog.LOAD);
            fd.setVisible(true);
            //fd.show();
             
        }else if("����".equals(comm)){
             FileDialog fd = new FileDialog(jf,"��ѡ��Ҫ�򿪵��ļ�",FileDialog.SAVE);          
			 fd.setVisible(true);
             
        }else if("���".equals(comm)){
             
             
        }else if("�˳�".equals(comm)){
             
             
        }else if("����".equals(comm)){
             
        }else if("����".equals(comm)){
             
        }else if("����".equals(comm)){
             
        }else if("ճ��".equals(comm)){
             
        }else if("ɾ��".equals(comm)){
             
        }else if("����".equals(comm)){
             
        }else if("�滻".equals(comm)){
             
        }else if("ȫѡ".equals(comm)){
             
        }else{//���ڼ��±�
             
        }
    }
    public static void main(String[] args) {
        new NotePad2();
    }
 
 
}