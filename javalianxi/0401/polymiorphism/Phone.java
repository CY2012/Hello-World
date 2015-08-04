package polymiorphism;

public class Phone{
	private String brand;//品牌
	private String type;//型号
	private Battery battery;//电池

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
			System.out.println("没电池。。。");
			return;
		}
		getBattery().power();
		System.out.println("品牌：" + brand + "，型号：" + type + "通话中。。。" );
	}
	public void sendMessage(String msg){
		if (battery != null){
			System.out.println("没电池。。。");
			return;
		}
		battery.power();
		System.out.println("品牌：" + brand + "，型号：" + type + "发短信。。。" + msg);
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
			System.out.println("没电池。。。");
			return;
		}
		getBattery().power();
		System.out.println("apple品牌：" + getBrand() + "，型号：" + getType() + "通话中。。。");
	}

	@Override
	public void sendMessage(String msg){
		if (getBattery() != null){
			System.out.println("没电池。。。");
			return;
		}
		getBattery().power();
		System.out.println("apple品牌：" + getBrand() + "，型号：" + getType() + "发短信。。。" + msg);
	}

}
class Samsung extends Phone{
	public Samsung(){}


	@Override
	public void call(){
	if (!(getBattery()!= null)){
			System.out.println("没电池。。。");
			return;
		}
		getBattery().power();
		System.out.println("Samsung品牌：" + getBrand() + "，型号：" + getType() + "通话中。。。");
	}
	@Override
	public void sendMessage(String msg){
		if (!(getBattery()!= null)){
			System.out.println("没电池。。。");
			return;
		}
		getBattery().power();
		System.out.println("Samsung品牌：" + getBrand() + "，型号：" + getType() + "发短信。。。" + msg);
	}
}
