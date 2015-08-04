class Student{
	String sNo;
	String sName;
	String sSex;
	int sAge;
	double sJava;

	public String getNo(){
		return sNo;
	}

	public String sName(){
		return sName;
	}

	public String sSex(){
		return sSex;
	}

	public int sAge(){
		return sAge;
	}

	public double sJava(){
		return sJava;
	}
}
class Test{
	public static void main(String[] args){
	    Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		s1.sNo = "1";
		s1.sName = "徐明辉";
		s1.sSex = "男";
		s1.sAge = 23;
		s1.sJava = 78;
		System.out.println("学号：" + s1.sNo + "\t\t姓名：" + s1.sName + "\t性别：" + s1.sSex + "\t年龄：" + s1.sAge + "\tjava分数：" + s1.sJava);

		s2.sNo = "2";
		s2.sName = "钟鑫";
		s2.sSex = "男";
		s2.sAge = 18;
		s2.sJava = 65;
		System.out.println("学号：" + s2.sNo + "\t\t姓名：" + s2.sName + "\t性别：" + s2.sSex + "\t年龄：" + s2.sAge + "\tjava分数：" + s2.sJava);

		s3.sNo = "3";
		s3.sName = "常宇";
		s3.sSex = "男";
		s3.sAge = 23;
		s3.sJava = 68;
		System.out.println("学号：" + s3.sNo + "\t\t姓名：" + s3.sName + "\t性别：" + s3.sSex + "\t年龄：" + s3.sAge + "\tjava分数：" + s3.sJava);

		s4.sNo = "4";
		s4.sName = "杨婷婷";
		s4.sSex = "女";
		s4.sAge = 22;
		s4.sJava = 75;
		System.out.println("学号：" + s4.sNo + "\t\t姓名：" + s4.sName + "\t性别：" + s4.sSex + "\t年龄：" + s4.sAge + "\tjava分数：" + s4.sJava);

		s5.sNo = "5";
		s5.sName = "崔强";
		s5.sSex = "男";
		s5.sAge = 24;
		s5.sJava = 66;
		System.out.println("学号：" +s5. sNo + "\t\t姓名：" + s5.sName + "\t性别：" + s5.sSex + "\t年龄：" + s5.sAge + "\tjava分数：" + s5.sJava + "\n");
		
		double average = (s1.sJava + s2.sJava + s3.sJava + s4.sJava + s5.sJava)/5;
		System.out.println("五个人的平均成绩为" + average + "\n");
		
		
		Student max = s1;
		if (s1.sJava < s2.sJava){
			max = s2;
		}
		if (max.sJava < s3.sJava){
			max = s3;
		}
		if (max.sJava < s4.sJava){
			max = s4;
		}
		if (max.sJava < s5.sJava){
			max = s5;
		}
		System.out.println("分数最高的学生：\n学号：" +max. sNo + "\t\t姓名：" + max.sName + "\t性别：" + max.sSex + "\t年龄：" + max.sAge + "\tjava分数：" + max.sJava + "\n");
		
		Student min = s1;
		if (s1.sJava > s2.sJava){
			min = s2;
		}
		if (min.sJava > s3.sJava){
			min = s3;
		}
		if (min.sJava > s4.sJava){
			min = s4;
		}
		if (min.sJava > s5.sJava){
			min = s5;
		}
		System.out.println("分数最低的学生\n学号：" +min. sNo + "\t\t姓名：" + min.sName + "\t性别：" + min.sSex + "\t年龄：" + min.sAge + "\tjava分数：" + min.sJava);
		
	}
}