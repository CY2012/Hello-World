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
		System.out.println("��֮��hour�ǣ�" + this.hour);
	
	}
	public void addMinute(int minute){
		this.minute = this.minute + minute;
		System.out.println("��֮��minute�ǣ�" + this.minute);
	
	}
	public void addSecond(int second){
		this.second = this.second + second;
		System.out.println("��֮��second�ǣ�" + this.second);
	
	}
	public void subHour(int hour){
		this.hour = this.hour - hour;
		System.out.println("��֮��hour�ǣ�" + this.hour);
		
	
	}
	public void subMinute(int minute){
		this.minute = this.minute - minute;
		System.out.println("��֮��minute�ǣ�" + this.minute);
	
	}
	public void subSecond(int second){
		this.second = this.second - second;
		System.out.println("��֮��second�ǣ�" + this.second);
	
	}
	
	public  void display(){
		System.out.println(hour + "ʱ" +  minute + "��" +  second + "��");

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