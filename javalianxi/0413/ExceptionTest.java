class ExceptionTest{

    public static void main(String[] args){
        ExceptionTest et = new ExceptionTest();
		System.out.println(et.toString());
		et = null;
		//System.out.println(et.toString());
		try{
			//System.exit(0);
			et.a();
			System.out.println("����");
		}catch (MyException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			System.out.println("��ָ���쳣");
		}finally{
			System.out.println("ִ��");
		}
    }
	public void a() throws MyException{
		//throw new MyException(); // �׳��쳣����
	}
}
class MyException extends Exception{
}