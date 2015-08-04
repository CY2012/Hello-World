package polymiorphism;

public class Phone{
	private String brand;//Ʒ��
	private String type;//�ͺ�
	private Battery battery;//���

	public  Phone(){}
	
	public Phone(String brand,String type,Battery battery){
		this.brand = brand;
		this.type = type;
		this.battery = battery;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	public void setBattery(Battery battery){
		this.battery = battery;
	}
	public Battery getBattery(){
		return battery;
	}
	public void call(){
		if (getBattery() != null){
			System.out.println("û��ء�����");
			return;
		}
		getBattery().power();
		System.out.println("Ʒ�ƣ�" + brand + "���ͺţ�" + type + "ͨ���С�����" );
	}
	public void sendMessage(String msg){
		if (battery != null){
			System.out.println("û��ء�����");
			return;
		}
		battery.power();
		System.out.println("Ʒ�ƣ�" + brand + "���ͺţ�" + type + "�����š�����" + msg);
	}

}
class Apple extends Phone{
	public Apple(){}

	public Apple(String brand,String type,Battery battery){
		super(brand,type,battery);
	}
	@Override
	public void call(){
	if (getBattery() != null){
			System.out.println("û��ء�����");
			return;
		}
		getBattery().power();
		System.out.println("appleƷ�ƣ�" + getBrand() + "���ͺţ�" + getType() + "ͨ���С�����");
	}

	@Override
	public void sendMessage(String msg){
		if (getBattery() != null){
			System.out.println("û��ء�����");
			return;
		}
		getBattery().power();
		System.out.println("appleƷ�ƣ�" + getBrand() + "���ͺţ�" + getType() + "�����š�����" + msg);
	}

}
class Samsung extends Phone{
	public Samsung(){}


	@Override
	public void call(){
	if (!(getBattery()!= null)){
			System.out.println("û��ء�����");
			return;
		}
		getBattery().power();
		System.out.println("SamsungƷ�ƣ�" + getBrand() + "���ͺţ�" + getType() + "ͨ���С�����");
	}
	@Override
	public void sendMessage(String msg){
		if (!(getBattery()!= null)){
			System.out.println("û��ء�����");
			return;
		}
		getBattery().power();
		System.out.println("SamsungƷ�ƣ�" + getBrand() + "���ͺţ�" + getType() + "�����š�����" + msg);
	}
}
