public class MyButton{

	String shape;
	String color;

	public void rotate(){
		System.out.println(shape + "��״����ɫΪ" + color + "�İ�ť������ת");
	}
	public void playSound(){
		System.out.println(shape + "��״����ɫΪ" + color + "�İ�ť���ڷ���");
	}
}
class ButtonDemo{

	public static void main(String[] args){
	    MyButton mb = new MyButton();

		mb.shape = "����";
		mb.color = "��ɫ";

		mb.rotate();
		mb.playSound();
	}
}