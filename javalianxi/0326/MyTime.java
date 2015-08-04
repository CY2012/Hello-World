class MyTime{
	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;		
	}
	public void addHour(int hour){
		this.hour = this.hour + hour;
		System.out.println("加之后hour是：" + this.hour);
	
	}
	public void addMinute(int minute){
		this.minute = this.minute + minute;
		System.out.println("加之后minute是：" + this.minute);
	
	}
	public void addSecond(int second){
		this.second = this.second + second;
		System.out.println("加之后second是：" + this.second);
	
	}
	public void subHour(int hour){
		this.hour = this.hour - hour;
		System.out.println("减之后hour是：" + this.hour);
		
	
	}
	public void subMinute(int minute){
		this.minute = this.minute - minute;
		System.out.println("减之后minute是：" + this.minute);
	
	}
	public void subSecond(int second){
		this.second = this.second - second;
		System.out.println("减之后second是：" + this.second);
	
	}
	
	public  void display(){
		System.out.println(hour + "时" +  minute + "分" +  second + "秒");

	}
}
class MyTimeDemo{
	public static void main(String[] args){
	    MyTime mt = new MyTime(8,45,30);
		mt.display();
		mt.addHour(1);
		mt.addMinute(12);
		mt.addSecond(17);

		mt.subHour(3);
		mt.subMinute(30);
		mt.subSecond(23);
		

	}

}