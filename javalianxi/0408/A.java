class A{
	class B{
		public void y(){
			System.out.println("this = " + this);
			System.out.println("A.this = " + A.this);
			System.out.println("y()");
		}
		class C{
			public void z(){
				System.out.println("z()");
			}
		}
	}
	public void x(){
		System.out.println("x()");
	}
}

class Tester{
	public void b(){
		A a = new A();
		System.out.println("a = " + a); //a.toString()
		a.x();
		A.B b = a.new B();
		System.out.println("b = " + b);
		b.y();
		A.B.C c = b.new C();
		c.z();
	}
	public static void main(String[] args){
	    Tester t = new Tester();
		t.b();
	}
}
