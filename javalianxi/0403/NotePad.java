
import javax.swing.JFrame;
import com.wyhello.util.FrameToolkit;
import java.awt.Point;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.JOptionPane.*;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FileDialog;

/**
*	我的第一个应用程序：记事本
*/
class NotePad extends JFrame{
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	private JTextArea content = null;
	private JScrollPane contentJSP = null;
	private boolean isChange = false; //正文是否被修改的状态
	private JPopupMenu rightMouseMenu = null;

	/**
	*	初始化组件
	*/
	public void initComponent(){
		
		rightMouseMenu = new JPopupMenu();
		rightMouseMenu.add("撤销(U)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("剪切(T)");
		rightMouseMenu.add("复制(C)");
		rightMouseMenu.add("粘贴(P)");
		rightMouseMenu.add("删除(D)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("全选(A)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("从左到右的阅读顺序(R)");
		rightMouseMenu.add("显示Unicode控制字符(S)");
		rightMouseMenu.add("显示Unicode控制字符(I)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("打开IME(O)");
		rightMouseMenu.add("汉字重选(R)");
		


		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				if (isChange){
					int command = showConfirmDialog(NotePad.this,"内容已更改,需要保存吗?",
						"提示",YES_NO_CANCEL_OPTION,QUESTION_MESSAGE);
					if (command == YES_OPTION){
						//保存内容
					}else if (command == NO_OPTION){
						System.exit(0);
					}
				}else{
					System.exit(0);
				}
			}
		});
		Point p = FrameToolkit.getFrameInScreenCenterPoint(WIDTH,HEIGHT);
		setSize(WIDTH,HEIGHT);
		setLocation(p);
		setTitle("保时捷记事本");
		ImageIcon ii = new ImageIcon("baoshijie.png");
		setIconImage(ii.getImage());	//Image image
		content = new JTextArea();
		//popupMenu();
		
		content.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
					if (e.getButton() == MouseEvent.BUTTON3){
					rightMouseMenu.show(content, e.getX(), e.getY());
					}
				}   
			});
		

		content.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				isChange = true;
			}		
		});
		contentJSP = new JScrollPane(content);
		getContentPane().add(contentJSP);
		drawMenu();		//绘制菜单
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);
	}
	//弹出菜单
	/*
	public void popupMenu(){
		final JPopupMenu rightMouseMenu = new JPopupMenu();
		JMenuItem r = rightMouseMenu.add("打开");
		r.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("hello");
			}
		});
		//添加弹出菜单功能
		content.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
					if (e.getButton() == MouseEvent.BUTTON3){
					rightMouseMenu.show(content, e.getX(), e.getY());
					}
				}   
			});
	}
	*/
	public void drawMenu(){
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(new Color(237,242,242));
		
		
		//文件菜单
		JMenu fileMenu = new JMenu("文件(F)");
		fileMenu.setMnemonic((int)'F');
		JMenuItem newMenuItem = new JMenuItem("新建(N)");
		JMenuItem openMenuItem = new JMenuItem("打开(O)");
		JMenuItem saveMenuItem = new JMenuItem("保存(S)");
		JMenuItem saveAsMenuItem = new JMenuItem("另存为(A)");
		JMenuItem pageSettingMenuItem  = new JMenuItem("页面设置(U)");
		JMenuItem printMenuItem = new JMenuItem("打印(P)");
		JMenuItem exiMenuItemt = new JMenuItem("退出(X)");
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(saveAsMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(pageSettingMenuItem);
		fileMenu.add(printMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exiMenuItemt);
		//添加文件菜单快捷键
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		printMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));
		//注册文件菜单监听器
		NotePadMenuListener listener = new NotePadMenuListener();
		newMenuItem.addActionListener(listener);
		openMenuItem.addActionListener(listener);
		saveMenuItem.addActionListener(listener);
		saveAsMenuItem.addActionListener(listener);
		pageSettingMenuItem.addActionListener(listener);
		printMenuItem.addActionListener(listener);
		exiMenuItemt.addActionListener(listener);
		
		
		//编辑菜单
		JMenu editMenu = new JMenu("编辑(E)");
		editMenu.setMnemonic((int)'E');
		JMenuItem undoMenuItem = new JMenuItem("撤销(U)");
		JMenuItem cutMenuItem = new JMenuItem("剪切(T)");
		JMenuItem copyMenuItem = new JMenuItem("复制(C)");
		JMenuItem pasteMenuItem = new JMenuItem("粘贴(P)");	
		JMenuItem deleteMenuItem = new JMenuItem("删除(L)");
		JMenuItem findMenuItem = new JMenuItem("查找(F)");
		JMenuItem findnextMenuItem = new JMenuItem("查找下一个(N)");
		JMenuItem replaceMenuItem = new JMenuItem("替换(R)");
		JMenuItem gotoMenuItem = new JMenuItem("转到(G)");
		JMenuItem selectAllMenuItem = new JMenuItem("全选(A)");
		JMenuItem timeMenuItem = new JMenuItem("时间/日期(D)");		
		editMenu.add(undoMenuItem);
		editMenu.addSeparator();
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);
		editMenu.add(deleteMenuItem);
		editMenu.addSeparator();
		editMenu.add(findMenuItem);
		editMenu.add(findnextMenuItem);
		editMenu.add(replaceMenuItem);
		editMenu.add(gotoMenuItem);
		editMenu.addSeparator();
		editMenu.add(selectAllMenuItem);
		editMenu.add(timeMenuItem);
		//添加编辑快捷键
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,InputEvent.CTRL_MASK));
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
		deleteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		findMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));
		findnextMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
		replaceMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_MASK));
		gotoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK));
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
		timeMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
		//注册编辑菜单监听器
		undoMenuItem.addActionListener(listener);
		cutMenuItem.addActionListener(listener);
		copyMenuItem.addActionListener(listener);
		pasteMenuItem.addActionListener(listener);
		deleteMenuItem.addActionListener(listener);
		findMenuItem.addActionListener(listener);
		findnextMenuItem.addActionListener(listener);
		replaceMenuItem.addActionListener(listener);
		gotoMenuItem.addActionListener(listener);
		selectAllMenuItem.addActionListener(listener);
		timeMenuItem.addActionListener(listener);


		//注册撤销监听器
		
		/*
		undoMenuItem.addActionListener(new ActionListener(){
			public viod actionPerformed(Action e){
				System.out.println(undoMenuItem.getText());
		}
		});
		*/


		//格式菜单
		JMenu fmtMenu = new JMenu("格式(O)");
		fmtMenu.setMnemonic((int)'O');
		JMenuItem enterMenuItem = new JMenuItem("自动换行(W)");
		JMenuItem fontMenuItem = new JMenuItem("字体(F)");
		fmtMenu.add(enterMenuItem);
		fmtMenu.add(fontMenuItem);
		//注册格式菜单监听器
		enterMenuItem.addActionListener(listener);
		fontMenuItem.addActionListener(listener);
		
		
		//查看菜单
		JMenu viewMenu = new JMenu("查看(V)");
		viewMenu.setMnemonic((int)'V');
		JMenuItem stateMenuItem = new JMenuItem("状态栏(S)");
		viewMenu.add(stateMenuItem);
		//注册查看菜单监听器
		stateMenuItem.addActionListener(listener);
		
		
		//帮助菜单
		JMenu helpMenu = new JMenu("帮助(H)");
		helpMenu.setMnemonic((int)'H');
		JMenuItem lookHelpMenuItem = new JMenuItem("查看帮助(H)");
		JMenuItem aboutMenuItem= new JMenuItem("关于记事本(A)");
		helpMenu.add(lookHelpMenuItem);	
		helpMenu.add(aboutMenuItem);
		//注册帮助菜单监听器
		lookHelpMenuItem.addActionListener(listener);
		aboutMenuItem.addActionListener(listener);



		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(fmtMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
		setJMenuBar(menuBar);
	}

	public NotePad(){
		initComponent();
	}
	public static void main(String[] args){
	    new NotePad();    
	}
}
/**
*
*	菜单监听器类
*/


class NotePadMenuListener implements ActionListener{

	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		if(source instanceof JMenuItem){
			JMenuItem item = (JMenuItem)source;
			String menuName = item.getText();
			switch (menuName){
			case "新建(N)":
				//新建菜单的动作
				break;
			case "打开(O)":
				break;
			case "保存(S)":
				break;
			case "打印(P)":
				break;
			case "撤销(Z)":
				break;
			case "剪切(X)":
				break;
			case "复制(C)":
				break;
			case "粘贴(V)":
				break;
		    case "删除(del)":
			    break;
			case "查找(F)":
				break;
		    case "查找下一个(N)":
		        break;
			case "替换(R)":
				break;
			case "转到(G)":
				break;
			case "全选(A)":
				break;
		    case "时间/日期(D)":
			    break;

			}
			System.out.println(menuName);
		}
	}
}