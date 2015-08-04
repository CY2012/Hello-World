import static java.lang.Math.*;

class Circle{
	private double radius;

	public Circle(){
		radius = 0;
	}
	public Circle(double r){
		radius = r;
	
	}
	public double getArea(){
		return PI * pow(radius,2);
	
	}
	public double getPerimeter(){
		return PI * radius * 2;
	
	}
	public void show(){
		System.out.println("半径：" + radius + ",周长：" + 
			getPerimeter() + ",面积：" + getArea());



	
	}

}
class CircleDmeo{
	public static void main(String[] args){
		double r = Math.random();

	    Circle cc= new Circle(30.4);
		cc.show();

	}
}
