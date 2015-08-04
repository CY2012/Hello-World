package binguan;

import java.util.Date;



public class Custom {
	private String id;
	private String name;
	private String sex;
	private String phone;
	private Date birthday;
	private int age;

	public Custom() {

	}

	public Custom(String id, String name, String sex, String phone,
			Date birthday, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.birthday = birthday;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String toString(){
	
	  return"name="+name+",id="+id+",sex="+sex+",birthday="+ birthday+",age="+ age;
	
	}

}
