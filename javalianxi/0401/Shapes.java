abstract class Shapes{

	abstract void drawing();


}
class Rectangles extends Shapes{
	public void drawing(){
		System.out.println("矩形");
	}

}
class Trangle extends Shapes{
	public void drawing(){
		System.out.println("三角形");
	}
}
class Circle extends Shapes{
	public void drawing(){
		System.out.println("圆形");
	}

}
class Ellipse extends Shapes{
	public void drawing(){
		System.out.println("椭圆形");
	}

}
class ShapesDemo{

	public static void main(String[] args){
	    Shapes r = new Rectangles();
		Shapes t = new Trangle();
		Shapes c = new Circle();
		Shapes e = new Ellipse();
		r.drawing();
		t.drawing();
		c.drawing();
		e.drawing();
	}
}