package com;
public class Test{
	public static void main(String[] args){

	    Person p = new Person("����",22);
		System.out.println(p.getInfo());

		Student s = new Student("����","�廪",22);
		System.out.println(s.getInfo());
		System.out.println(s.study());
	}
}