class Person{
	private int i;
	
	public Person(){}

	public Person(int i){
		this.i = i;
	}
	public static void main(String[] args){
	    
		String s = new Person(100).toString();
		System.out.println(s);
		String str = "abc";
		System.out.println(str);
		Person p = new Person(10000);
		System.out.println(p.toString());
		
		Person p1 = new Person(100);
		Person p2 = new Person(100);
		boolean b = p1.equals(p2);
		System.out.println(b);
		p1 = null;
		System.gc();//启动垃圾收集器
	}
	
	/*
	@Override
	public String toString(){
		return super.toString() + "###i = " +  i;
	}
	*/
	
	@Override
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if (obj instanceof Person){
			Person o = (Person)obj;
			if (o.i == this.i){ //this.i为p1。。o.i为p2。
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		return super.toString() + "#=" + i ;
	} 
	
	@Override
	public void finalize()
			throws Throwable{
		System.out.println("清理");
	}
}