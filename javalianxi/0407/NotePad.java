import com.wyhello.util.FrameToolkit;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.KeyStroke;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.swing.JOptionPane.*;
import java.awt.event.KeyAdapter;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FileDialog;




/**
* �޵ĵ�һ��Ӧ�ó���
*/
class NotePad extends JFrame{

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	private JTextArea content = null;
	private JScrollPane contentJSP = null;
	private boolean isChange = false;  //�����Ƿ��޸ĵ�״̬
	private JPopupMenu rightMouseMenu = null;


	/**
	* ��ʼ�����
	*
	*/
	/*
	public class RightMouse extends JFrame{
		public JPopupMenu popupMenu;
		public void RightMouse(){
			JMenuItem mAll, mCopy, mCut, mPaste, mDel;
				popupMenu = new JPopupMenu();
					mAll = new JMenuItem("ȫѡ(A)");
						popupMenu.add(mAll);
					mCopy = new JMenuItem("����(C)");
						popupMenu.add(mCopy);
					mCut = new JMenuItem("����(T)");
						popupMenu.add(mCut);
					mPaste = new JMenuItem("ճ��(P)");
						popupMenu.add(mPaste);
					mDel = new JMenuItem("ɾ��(D)");
						popupMenu.add(mDel);
		addMouseListener(new MouseAdapter(){ //���ڵ�����¼�����
			public void mousePressed(MouseEvent event) { //������
				triggerEvent(event);							//����triggerEvent���������¼�
			}
			public void mouseReleased(MouseEvent event){ //�ͷ����		
				triggerEvent(event);
			}
			private void triggerEvent(MouseEvent event){ //�����¼�
				if (event.isPopupTrigger()) 
					popupMenu.show(event.getComponent(),event.getX(),event.getY()); //��ʾ�˵�
					}
				});					
		}
	}
	*/

	public void initComponent(){

		rightMouseMenu = new JPopupMenu();
		rightMouseMenu.add("����(U)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("����(T)");
		rightMouseMenu.add("����(C)");
		rightMouseMenu.add("ճ��(P)");
		rightMouseMenu.add("ɾ��(D)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("ȫѡ(A)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("�����ҵ��Ķ�˳��(R)");
		rightMouseMenu.add("��ʾUnicode�����ַ�(S)");
		rightMouseMenu.add("��ʾUnicode�����ַ�(I)");
		rightMouseMenu.addSeparator();
		rightMouseMenu.add("��IME(O)");
		rightMouseMenu.add("������ѡ(R)");
		
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				if (isChange){
					int command = showConfirmDialog(NotePad.this,
						"�����Ѹ��ģ���Ҫ����ô��","���±�",YES_NO_CANCEL_OPTION,QUESTION_MESSAGE);
					if (command == YES_OPTION){
						//��������
					}else if(command == NO_OPTION){
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
		setTitle("���±�");
		ImageIcon ii = new ImageIcon("baoshijie.png");
		setIconImage(ii.getImage());  //Image image
		
		
		content = new JTextArea();

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
		add(contentJSP);
		drawMenu();
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setVisible(true);

	}


	public void drawMenu(){
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(new Color(200,230,240));
		JMenu fileMenu = new JMenu("�ļ�(F)");
		fileMenu.setMnemonic((int)'F');
		JMenuItem newMenuItem = new JMenuItem("�½�(N)");
		JMenuItem openMenuItem = new JMenuItem("��(O)");
		JMenuItem saveMenuItem = new JMenuItem("����(S)");
		JMenuItem saveAsMenuItem = new JMenuItem("����Ϊ(A)");
		JMenuItem pageSettingMenuItem = new JMenuItem("ҳ������(U)");
		JMenuItem printMenuItem = new JMenuItem("��ӡ(P)");
		JMenuItem exitMenuItem = new JMenuItem("�˳�(X)");
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(saveAsMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(pageSettingMenuItem);
		fileMenu.add(printMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		//�����ļ��˵���ݼ�
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		printMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		//ע���ļ��˵�������
		NotePadMenuListener listener = new NotePadMenuListener();
		newMenuItem.addActionListener(listener);	//ע���½�������
		openMenuItem.addActionListener(listener);	//ע��򿪼�����
		saveMenuItem.addActionListener(listener);	//ע�ᱣ�������
		printMenuItem.addActionListener(listener);	//ע���ӡ������
		
		
		//�༭�˵�
		JMenu editMenu = new JMenu("�༭(E)");
		editMenu.setMnemonic((int)'E');
		JMenuItem undoMenuItem = new JMenuItem("����(U)");
		JMenuItem cutMenuItem = new JMenuItem("����(T)");
		JMenuItem copyMenuItem = new JMenuItem("����(C)");
		JMenuItem pasteMenuItem = new JMenuItem("ճ��(P)");
		JMenuItem clearMenuItem = new JMenuItem("ɾ��(L)");
		JMenuItem findMenuItem = new JMenuItem("����(F)...");
		JMenuItem findNextMenuItem = new JMenuItem("������һ��(N)");
		JMenuItem replaceMenuItem = new JMenuItem("�滻(R)...");
		JMenuItem gotoMenuItem = new JMenuItem("ת��(G)...");
		JMenuItem selectAllMenuItem = new JMenuItem("ȫѡ(A)");
		JMenuItem timeMenuItem = new JMenuItem("ʱ��/����(D)");
		editMenu.add(undoMenuItem);
		editMenu.addSeparator();
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);
		editMenu.add(clearMenuItem);
		editMenu.addSeparator();
		editMenu.add(findMenuItem);
		editMenu.add(findNextMenuItem);
		editMenu.add(replaceMenuItem);
		editMenu.add(gotoMenuItem);
		editMenu.addSeparator();
		editMenu.add(selectAllMenuItem);
		editMenu.add(timeMenuItem);
		//���Ӳ˵���ݼ�
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		clearMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		findMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		findNextMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
		replaceMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		gotoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		timeMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
		//ע���ļ��˵�������
		undoMenuItem.addActionListener(listener);		//ע�᳷��������
		cutMenuItem.addActionListener(listener);		//ע����м�����
		copyMenuItem.addActionListener(listener);		//ע�Ḵ�Ƽ�����
		pasteMenuItem.addActionListener(listener);		//ע��ճ��������
		clearMenuItem.addActionListener(listener);		//ע��ɾ��������
		findMenuItem.addActionListener(listener);		//ע����Ҽ�����
		findNextMenuItem.addActionListener(listener);	//ע�������һ��������
		replaceMenuItem.addActionListener(listener);	//ע���滻������
		gotoMenuItem.addActionListener(listener);		//ע��ת��������
		selectAllMenuItem.addActionListener(listener);	//ע��ȫѡ������
		timeMenuItem.addActionListener(listener);		//ע��ʱ�������
		
		
		//��ʽ�˵�
		JMenu fmtMenu = new JMenu("��ʽ(O)");
		fmtMenu.setMnemonic((int)'O');
		JMenuItem enterMenuItem = new JMenuItem("�Զ�����(W)");
		JMenuItem fontMenuItem = new JMenuItem("����(F)...");
		fmtMenu.add(enterMenuItem);
		fmtMenu.add(fontMenuItem);

		JMenu viewMenu = new JMenu("�鿴(V)");
		viewMenu.setMnemonic((int)'V');
		JMenuItem stateMenuItem = new JMenuItem("״̬��(S)");
		viewMenu.add(stateMenuItem);

		JMenu helpMenu = new JMenu("����(H)");
		helpMenu.setMnemonic((int)'H');
		JMenuItem lookMenuItem = new JMenuItem("�鿴����(H)");
		JMenuItem aboutMenuItem = new JMenuItem("���ڼ��±�(A)");
		helpMenu.add(lookMenuItem);
		helpMenu.add(aboutMenuItem);

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
	class NotePadMenuListener implements ActionListener{

		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			if (source instanceof JMenuItem){
				JMenuItem item = (JMenuItem)source;
				String menuName = item.getText();
					switch (menuName){
						case "�½�(N)":
							break;
						case "��(O)":
							break;
						case "����(S)":
							break;
						case "��ӡ(P)":
							break;
						case "����(U)":
							break;
						case "����(T)":
							break;
						case "����(C)":
							break;
						case "ɾ��(L)":
							break;
						case "������һ��(N)":
							break;
						case "ʱ��/����(D)":
							break;
						case "ճ��(V)":
							break;
						case "����(F)":
							break;
						case "�滻(R)":
							break;
						case "ת��(G)":
							break;
						case "ȫѡ(A)":
							break;
						default:
							break;
					}
				System.out.println(menuName);
	
			}
		}			
	}
}