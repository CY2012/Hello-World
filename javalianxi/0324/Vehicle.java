import java.util.Scanner;

class Vehicle{


	int speed;
	int v;
	public void move(){
		System.out.println("�ƶ�");
	}
	public void setSpeed(int s){
		speed = s;
	}
	public void speedUp(){
		System.out.print("��ǰ�ٶ�Ϊ��" + speed + "\t");
		speed++;
		System.out.println("���ٺ���ٶ�Ϊ��" + speed);		
	}
	public void speedDown(){
		System.out.print("��ǰ�ٶ�Ϊ��" + speed + "\t");
		speed--;
		System.out.println("���ٺ���ٶ�Ϊ��" + speed);
	}		


	public void init(int s,int vv){
		speed = s;
		v = vv;
		System.out.println("�ٶȣ�" + speed + "�����" + v);
	}
public static void main(String[] args){
    Vehicle v1 = new Vehicle();
	Scanner sc = new Scanner(System.in);
	System.out.println("�������ٶȣ�");
	int a = sc.nextInt();
	System.out.println("�����������");
	int b = sc.nextInt();
	v1.init(a,b);
	v1.speedUp();
	v1.speedUp();
	v1.speedUp();
	v1.speedUp();
	v1.speedUp();
	v1.speedUp();
	v1.speedDown();
	//Vehicle v2 = new Vehicle();
	}
}