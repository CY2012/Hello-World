class Car{

	int count;
	String color;
	int weight;
	int speed;



	public Car(int count,String color,int weight,int speed){
		this.count = count;
		this.color = color;
		this.weight = weight;
		this.speed = speed; 
	}
	public void speedUp(){
		System.out.println("��������Ϊ��" + count + "��,��ɫΪ��" + color +
			",����Ϊ:" + weight + "kg�ĳ���ǰ�ٶ�Ϊ��" + speed +"\t");
		speed++;
		System.out.println("��������Ϊ��" + count + "��,��ɫΪ��" + color +
			",����Ϊ:" + weight + "kg�ĳ�����֮���ٶ�Ϊ��" + speed +"\t");	
	}

	public void speedDown(){
		speed--;
		System.out.println("��������Ϊ��" + count + "��,��ɫΪ��" + color +
			",����Ϊ:" + weight + "kg�ĳ���ǰ�ٶ�Ϊ��" + speed + "\t");

		System.out.println();
		if (speed == 0){
			System.out.println("��������Ϊ��" + count + "��,��ɫΪ��" + color +
			",����Ϊ:" + weight + "kg�ĳ�ͣ����" + "\t");	
		}else{
			System.out.println("��������Ϊ��" + count + "��,��ɫΪ��" + color +
			",����Ϊ:" + weight + "kg�ĳ�����֮���ٶ�Ϊ��" + speed +"\t");
		}
		
	}
	
	public static void main(String[] args){
	    Car c = new Car(4,"��ɫ",1000,5);
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
	}
}