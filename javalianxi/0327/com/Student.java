package com;
public class Student extends Person{
	private String school;
	
	public Student(){}

	public Student(String name,String school,int age){
	
		setName(name);
		setAge(age);
		this.school = school;
	}
	public String study(){
		return "������" + getName() + "����ѧϰ�С�����";
	}

}
