class StringProcessor{

	public static void main(String[] args){
		StringProcessor sp = new StringProcessor();
		String str = sp.genRandomNumString((int)(Math.random() * 20));

		System.out.println(str);
		System.out.println("תΪСд" + str.toLowerCase());
		System.out.println("תΪ��д" + str.toUpperCase());
		System.out.println("�ַ����ĳ���: " + str.length());
		/*
		for (int i = 65; i < 65 + 26 ; i++ ){
			System.out.println(i + " ");
		}
		System.out.println();
		for (int i = 65; i < 65 + 26 ; i++ ){
			System.out.println((char)i);
		}
		System.out.println();
		for (int i = 97; i < 97 + 26 ; i++ ){
			System.out.println(i + " ");
		}
		System.out.println();
		for (int i = 97; i < 97 + 26 ; i++ ){
			System.out.println((char)i);
		}
		*/
}	
	public String genRandomNumString(int len){
		//��������깤һ��len���ַ����ַ���
		String str = "";		
		boolean isRepeat = false;
		for (int i = 0; i < len; ){
			int rand = (int)(Math.random() * 58 ) + 57;	
			System.out.println("i = " + i + ", rand = " + rand);
			switch(rand) {
				case 91 : 
				case 92 : 
				case 93 :  
				case 94 : 
				case 95 :  
				case 96 :
				isRepeat = true;
			}
			if(isRepeat){
				isRepeat = false;
				continue;
			}
			else{
				i++;
			}
			str += (char)rand;
		}
		return str;
							
	}
}