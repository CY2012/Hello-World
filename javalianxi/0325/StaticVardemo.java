class StaticVarDemo{

	static String name;

	public static void main(String[] args){
	    StaticVarDemo.name = "abc"; //静态变量可以使用类名直接调用
		System.out.println("StaticVarDemo.name = " + StaticVarDemo.name);


	}
}
class NoStaticVarDemo{
	String name;

	public static void main(String[] args){
	    NoStaticVarDemo nsv = new NoStaticVarDemo();
		nsv.name = "def";	//非静态变量(实例变量)不可以直接调用，需要创建类的对象，将其实例化。
		StaticVarDemo.name = "haha";	//静态方法之间的调用，直接加方法名即可。
		System.out.println("StaticVarDemo.name = " + StaticVarDemo.name);
		System.out.println("nsv.name = " + nsv.name);
	}
}