class StaticVarDemo{

	static String name;

	public static void main(String[] args){
	    StaticVarDemo.name = "abc"; //��̬��������ʹ������ֱ�ӵ���
		System.out.println("StaticVarDemo.name = " + StaticVarDemo.name);


	}
}
class NoStaticVarDemo{
	String name;

	public static void main(String[] args){
	    NoStaticVarDemo nsv = new NoStaticVarDemo();
		nsv.name = "def";	//�Ǿ�̬����(ʵ������)������ֱ�ӵ��ã���Ҫ������Ķ��󣬽���ʵ������
		StaticVarDemo.name = "haha";	//��̬����֮��ĵ��ã�ֱ�Ӽӷ��������ɡ�
		System.out.println("StaticVarDemo.name = " + StaticVarDemo.name);
		System.out.println("nsv.name = " + nsv.name);
	}
}