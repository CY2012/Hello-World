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
		return "姓名：" + getName() + "正在学习中。。。";
	}

}
