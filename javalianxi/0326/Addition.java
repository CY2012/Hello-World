package com.changyu;
class Addition{
	int x;
	int y;

	public Addition(int x,int y){
		this.x = x;
		this.y = y;
	
	}
	public int add(int x,int y){
		//System.out.println("x + y" = (x + y));
		return x + y;
	
	}
	public double add(double x,double y){
		//System.out.println("x + y" = (x + y));
		return x + y;
	
	}
	public String add(String x,String y){
		//System.out.println("x + y" = (x + y));
		return x + y;
	
	}

}
class AdditionDemo{
	public static void main(String[] args){
	    Addition at = new Addition(1,2);
		int a = at.add(25,75);
		System.out.println(a);

		double b = at.add(9.8,10.2);
		System.out.println(b);

		String c = at.add("abc","def");
		System.out.println(c);
	}
}