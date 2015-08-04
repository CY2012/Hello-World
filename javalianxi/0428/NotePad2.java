import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;//加滚动条
import javax.swing.JTextArea;
 
 /** 作一下记事本，包括菜单：
 文件：新建/打开/保存/另存/退出
 编辑：撤销/剪切/复制/粘贴/删除/查找/替换/全选
 帮助：关于记事本（关闭窗口不退JVM用dispose方法)
 */
public class NotePad2 implements ActionListener{
    JFrame jf = new JFrame("记事本");
    JTextArea jta = new JTextArea(10,20);//记事本,显示纯文本的多行区域
     
    public NotePad2(){
    String[] menuLabel ={"文件", "编辑","帮助"};
    String[][] miLabel ={{"新建", "" ,  "打开",  "保存",  "另存","" , "退出"},
        {"撤销",  "剪切",  "复制",  "粘贴", " 删除", "","查找",  "替换", "" ,"全选"}, 
        {" 关于记事本"} 
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
        jf.setJMenuBar(jmb);//JFrame加菜单栏时用setJmenuBar(),不用add
        jf.add(new JScrollPane(jta));//加滚动条
        jf.setLocation(300,300);//设计出现的位置 
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        String comm = e.getActionCommand();
        if("新建".equals(comm)){
            jta.setText("");
        }else if("打开".equals(comm)){
            //FileDialog 类显示一个对话框窗口，用户可以从中选择文件
            //由于它是一个模式对话框，当应用程序调用其 show 方法来显示对话框时，
            //它将阻塞其余应用程序，直到用户选择一个文件
            FileDialog fd = new FileDialog(jf,"请选择要打开的文件",FileDialog.LOAD);
            fd.setVisible(true);
            //fd.show();
             
        }else if("保存".equals(comm)){
             FileDialog fd = new FileDialog(jf,"请选择要打开的文件",FileDialog.SAVE);          
			 fd.setVisible(true);
             
        }else if("另存".equals(comm)){
             
             
        }else if("退出".equals(comm)){
             
             
        }else if("撤销".equals(comm)){
             
        }else if("剪切".equals(comm)){
             
        }else if("复制".equals(comm)){
             
        }else if("粘贴".equals(comm)){
             
        }else if("删除".equals(comm)){
             
        }else if("查找".equals(comm)){
             
        }else if("替换".equals(comm)){
             
        }else if("全选".equals(comm)){
             
        }else{//关于记事本
             
        }
    }
    public static void main(String[] args) {
        new NotePad2();
    }
 
 
}