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
		System.out.println("经过"+count+"次");
		BubbleSort.bubble(iArray);
		ArraySorter.printArray(iArray);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要查找的数：");
		int findNum = sc.nextInt();
		int index = -1;//为什么是-1
		for (int i = 0; i < iArray.length ;i++ ){
			if (findNum == iArray[i]){
				index = i;
				break;
			}
		}
		if (index != -1){
			System.out.println("您要找的数为" + iArray[index] + "在数组的第" +(index + 1) + "个数");
		}else{
			System.out.println("在数组中查无此数" + findNum );
		}
	}
}