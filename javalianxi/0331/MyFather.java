class MyFather{
	int i = 1;

	public void fight(){
		System.out.println("老子在打架招数");
	}
}
class MySub extends MyFather{
	int i = 2;
	
	public MySub(){
		int i = 10;
		System.out.println("father i = " + super.i);
		System.out.println("sub i = " + this .i);
		System.out.println("局部变量 = " + i);
	}
	@Override
		public void fight(){
			super.fight();
			System.out.println("儿子在打架招数");
	}
	public static void main(String[] args){
	    new MySub().fight();
	}
}