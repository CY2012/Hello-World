import java.util.Random;
import java.util.Scanner;

class ArrayFinder{

	public static void main(String[] args){
	    int iArray[] = new int[50];
		Random rand = new Random();
		int count = 0;
		for (int i = 0; i < iArray.length ;  ){
			int randNum = rand.nextInt(100) + 1;
			boolean flag = false;
			count++;
			for (int j = 0; j < iArray.length - 1 ;j++ ){
				count++;
				if (iArray[j] == randNum){
					flag = true;
					break;
				}
			}
			if (!flag){
				iArray[i] = randNum;
				i++;
			}
		}
		System.out.println("����"+count+"��");
		BubbleSort.bubble(iArray);
		ArraySorter.printArray(iArray);
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�����");
		int findNum = sc.nextInt();
		int index = -1;//Ϊʲô��-1
		for (int i = 0; i < iArray.length ;i++ ){
			if (findNum == iArray[i]){
				index = i;
				break;
			}
		}
		if (index != -1){
			System.out.println("��Ҫ�ҵ���Ϊ" + iArray[index] + "������ĵ�" +(index + 1) + "����");
		}else{
			System.out.println("�������в��޴���" + findNum );
		}
	}
}