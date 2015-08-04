package com;
public class Test{
	public static void main(String[] args){

	    Person p = new Person("张三",22);
		System.out.println(p.getInfo());

		Student s = new Student("李四","清华",22);
		System.out.println(s.getInfo());
		System.out.println(s.study());
	}
}