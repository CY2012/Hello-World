package binguan;
import java.util.Scanner;
import java.util.InputMismatchException ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;



class MultiArray{
	private String username="cohen";
	private String password="1234abcd";
	private String datepattern="yyyy-mm-dd";
	private DateFormat df=new SimpleDateFormat(datepattern);


//��ά���鱾�� �������������	
    private Custom[][] rooms=null;

	public MultiArray(){
	   rooms=new Custom[4][5];
	}

	public MultiArray(Custom[][] rooms){
	   this.rooms=rooms;
	
	
	}

    //��ʼ���������Ϣ
    @Deprecated//(�ع� ������������Ѿ���ʱ ������ʹ��)
    public void initRooms(){ 
		//rooms[][]="����";
		//rooms[][]="����";
		  /* for(int i=0;i<rooms.length;i++){
		   for(int j=0;j<rooms[i].length;j++){
			 rooms[i][j]="���� ";
		   //System.out.println("rooms[i][j]");
		 }
	   }*/
	}

    public Custom[][] getRooms(){
         return rooms;
	}

    public void setRooms(Custom[][] rooms){
         this.rooms=rooms;
	}

	public Custom getCustomByIndex(int i,int j){//ͨ��������������
	      Custom c=null;
		  try{
		    c=rooms[i][j];
		  }catch(ArrayIndexOutOfBoundsException ex){
		  }
		  return c;

	}


    public String printRoomInfo(Custom[][] args){
		String info="";
		for(int i=0;i<args.length;i++){
			//�����
			for(int j=0;j<args[i].length;j++){
				info=info+(i+1)+(j>9 ? j : "0"+(j+1));
				info +="\t";
			}

			//info +="\n";
			for(int j=0;j<args[i].length;j++){
				info =info+(args[i][j]!=null ?args[i][j].getName():"����");
				info +="\t";
			}	
			info +="\n";
		}
		return info;
	}

   
	public void mainMenu(){

        System.out.println("~~~~~~��ӭ���ٺ�������~~~~~~");
		System.out.println("======��ѡ������Ҫ�ķ���=====");
		System.out.println("======1.�� ѯ �� �� �� ��=====");
		System.out.println("======2.�� ס �� �� �� ��=====");
		System.out.println("======3.�� �� �� �� �� ��=====");
		System.out.println("======4.�� �� �� �� �� ��=====");
		System.out.println("======5.�� �� �� �� �� ��=====");
		System.out.println("======6.�� �� �� �� �� ��=====");
		System.out.println("======7.ͳ �� �� �� �� ��=====");
		System.out.println("======8.�� ϸ �� ѯ =====");
		System.out.println("======9.�� �� �� �� �� ��=====");
		System.out.println("=======================");
	}

	public int getCommand(int range){
	    Scanner sc =null;
	    int command =0;

		while(true){
			System.out.print("����ѡ��(1~"+range+")");
			try{
				sc =new Scanner(System.in);
				command =sc.nextInt();
				if(command>0 && command <=range){//�����쳣
					break;
				}
	        }catch(InputMismatchException ex){
				System.out.println("���ǲ���ɵ����������,");
			}
		}
        return command;
	}

    //���̿���
    public void mainFlow(){

		//��¼
		while(true){
	 
			//�г��˵�
			mainMenu();
			//��ȡ�û����������
			int cmd =getCommand(9);
			switch(cmd){
			  case 1:
				 select();
				 break;
			  case 2:
				 checkIn();
				 break;
			  case 3:
				 retreatRoom();
				 break;
			  case 4:
				 settleAccounts();
				 break;   
			  case 5:
				 uploadData();
				 break;
			  case 6:
				 backup();
				 break;
			  case 7:
				 statisticalData();
				 break;
			  case 8:
				queryDetail();
				 break;
			  case 9:
				System.out.println("ллʹ��");
				System.exit(0);
			}
		}

	}
//��ϸ��ѯ
	public void queryDetail(){
		 int roomNumber = validateInputRoomNumber();
		 int i = roomNumber / 100-1;
		 int j = roomNumber % 100-1;
		 Custom c  = rooms[i][j];//Ҫ��ѯ�Ŀͻ�����
	
	}
	public int  validateInputRoomNumber(){
			Scanner sc=null;
			int roomNumber=0;
			int i = 0;
			int j = 0;

		while(true){
			sc=new Scanner(System.in);
		try{

			System.out.println("�����뷿���");
			sc=new Scanner(System.in);
			
			 i = roomNumber / 100-1;
			 j = roomNumber % 100-1;
			 System.out.println(i);
			 System.out.println(j);
		if(i>=rooms.length||( j >=rooms[i].length)){
			System.out.println("������ķ�����뷶Χ����");
			continue;
		}

		}catch(InputMismatchException e){
			System.out.println("������ķ�����벻��ȷ");
			 continue;
		}
		 break;
	    }
		return roomNumber;
	}

    //��ѯ����
    public void select(){
		String roomInfo=printRoomInfo(rooms);
		System.out.println(roomInfo);
	}
	
    //��ס����
	//����һ���������ڶ����з�װ�ͻ���Ϣ
	//�Ѷ���������ǵĶ�ά�����У�ָ�������
    public void checkIn(){
		Custom c=new Custom();
		getDataObject(c);
		//���뷿���
		Scanner sc=new Scanner(System.in);
	    System.out.println("�����뷿�����");
		int num=sc.nextInt();
		int i=num / 100-1;
		int j=num % 100-1;
		rooms[i][j]=c;
		System.out.println("��ס�ɹ���������");
	}

	
    //�˷�����
    public void retreatRoom(){
		 int roomNumber =  validateInputRoomNumber();
		 int i = roomNumber / 100-1;
		 int j = roomNumber % 100-1;
		 rooms[i][j]=null;//Ҫ��ѯ�Ŀͻ�����
	    System.out.println("�˷��ɹ���������");
	}
	
    //���˷���
	public void settleAccounts(){
	    System.out.println("���˷���");
	}
	
    //�ϴ�����
	public void uploadData(){
	    System.out.println("�ϴ�����");
	}
    //���ݱ���
	public void backup(){
	    System.out.println("���ݱ���");
	} 
	
    //ͳ��
	public void statisticalData(){
	    System.out.println("ͳ��");
	}


	/*
	*  ��ס�Ƶ��ѯ
	*  ����ָ�������ָ���ķ��������Ѳ������ݵ������ڲ�
	*  @param owner ָ������
	*  @param methodName Ҫ���õķ���
	*  @param args ���÷���ʱ���ݷ�����ʵ��
	*  @return ���������ú�ķ���ֵ
	*/
	public Object productObject(Object owner, String methodName, Class paramType, Object... args){
		Class clazz = owner.getClass();
		Object arg = args[0];
		Method m = null;
		Object retValue = null;

		try{
			m = clazz.getMethod(methodName, paramType);	
			retValue = m.invoke(owner, args);
		}catch(NoSuchMethodException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
	
		return  retValue;
	}


	public Object getDataObject(Object owner){
		 Class clazz =owner.getClass();
		 Field[] fields=clazz.getDeclaredFields();
		 Scanner sc=new Scanner(System.in);

		 for(Field f:fields){
			 String methodName= "set"+f.getName().substring(0,1).toUpperCase()+ 
			 f.getName().substring(1);
			 System.out.print("������"+f.getName()+"��ֵ��");
			 String value=sc.next();//�û�ͨ���������������

			if(f.getType()==Date.class){
				try{
					productObject(owner,methodName,f.getType(),new Object[] {df.parse(value)});
				}catch(ParseException e){
					e.printStackTrace();
				}
			}else if(f.getType() == int.class){
				productObject(owner,methodName,f.getType(),new Object[] {Integer.parseInt(value)});
			}else if(f.getType()==String.class){
				productObject(owner,methodName,f.getType(),new Object[] {value});
			}
		}
		return owner;
	}

	//���
	public static void main(String []args){
		MultiArray ha=new MultiArray(new Custom[6][10]);
		//ha.initRooms();//��ʼ���������Ϣ ����ʼ������null
		//String s=ha.printRoomInfo(ha.getRooms());
		//System.out.println(s);
		//ha.mainMenu();
		ha.mainFlow();
		//int cmd=ha.getCommand(8);
	}
}  