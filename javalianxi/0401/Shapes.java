abstract class Shapes{

	abstract void drawing();


}
class Rectangles extends Shapes{
	public void drawing(){
		System.out.println("����");
	}

}
class Trangle extends Shapes{
	public void drawing(){
		System.out.println("������");
	}
}
class Circle extends Shapes{
	public void drawing(){
		System.out.println("Բ��");
	}

}
class Ellipse extends Shapes{
	public void drawing(){
		System.out.println("��Բ��");
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