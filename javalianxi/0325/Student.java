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
		s1.sName = "������";
		s1.sSex = "��";
		s1.sAge = 23;
		s1.sJava = 78;
		System.out.println("ѧ�ţ�" + s1.sNo + "\t\t������" + s1.sName + "\t�Ա�" + s1.sSex + "\t���䣺" + s1.sAge + "\tjava������" + s1.sJava);

		s2.sNo = "2";
		s2.sName = "����";
		s2.sSex = "��";
		s2.sAge = 18;
		s2.sJava = 65;
		System.out.println("ѧ�ţ�" + s2.sNo + "\t\t������" + s2.sName + "\t�Ա�" + s2.sSex + "\t���䣺" + s2.sAge + "\tjava������" + s2.sJava);

		s3.sNo = "3";
		s3.sName = "����";
		s3.sSex = "��";
		s3.sAge = 23;
		s3.sJava = 68;
		System.out.println("ѧ�ţ�" + s3.sNo + "\t\t������" + s3.sName + "\t�Ա�" + s3.sSex + "\t���䣺" + s3.sAge + "\tjava������" + s3.sJava);

		s4.sNo = "4";
		s4.sName = "������";
		s4.sSex = "Ů";
		s4.sAge = 22;
		s4.sJava = 75;
		System.out.println("ѧ�ţ�" + s4.sNo + "\t\t������" + s4.sName + "\t�Ա�" + s4.sSex + "\t���䣺" + s4.sAge + "\tjava������" + s4.sJava);

		s5.sNo = "5";
		s5.sName = "��ǿ";
		s5.sSex = "��";
		s5.sAge = 24;
		s5.sJava = 66;
		System.out.println("ѧ�ţ�" +s5. sNo + "\t\t������" + s5.sName + "\t�Ա�" + s5.sSex + "\t���䣺" + s5.sAge + "\tjava������" + s5.sJava + "\n");
		
		double average = (s1.sJava + s2.sJava + s3.sJava + s4.sJava + s5.sJava)/5;
		System.out.println("����˵�ƽ���ɼ�Ϊ" + average + "\n");
		
		
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
		System.out.println("������ߵ�ѧ����\nѧ�ţ�" +max. sNo + "\t\t������" + max.sName + "\t�Ա�" + max.sSex + "\t���䣺" + max.sAge + "\tjava������" + max.sJava + "\n");
		
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
		System.out.println("������͵�ѧ��\nѧ�ţ�" +min. sNo + "\t\t������" + min.sName + "\t�Ա�" + min.sSex + "\t���䣺" + min.sAge + "\tjava������" + min.sJava);
		
	}
}