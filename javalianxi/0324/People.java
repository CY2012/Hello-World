public class People{

	String name;//��Ա����
	String sex; //��Ա����

	public void sing(){
		System.out.println("����Ϊ" + name + "���Ա�Ϊ" + sex + "�������ڳ���");
	}
	public void eat(){
		System.out.println("����Ϊ" + name + "���Ա�Ϊ" + sex + "�������ڳԷ�");
	}

}
class PeopleDemo{
	public static void main(String[] args){
	    People pp = new People();

		pp.name = "���Ѿ";
		pp .sex = "Ů";

		pp.sing();
		pp.eat();
	}
}