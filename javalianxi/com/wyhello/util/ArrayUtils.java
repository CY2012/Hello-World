/*
*2015/4/20 文员数组实用工具类
*/
package com.wyhello.util;

import java.util.Random;
/*
*	@author ChangYu
*	@since 1.5
*	@version
*/
public class ArrayUtils{
	/**
	*生成随机数组(有重复)，长度为arrayLen,范围在arrayScope
	*@param arrayLen 生成数组的长度
	*@param arrayScope 数组中数据的范围
	*@return int[]数组
	*/

	public static int[] productArray(int arrayLen,int arrayScope){
		int[] i = new int[arrayLen];
		for (int j = 0;j < arrayLen ;j++ ){
			i[j] = (int)(Math.random() * arrayScope);
		}
		return i;
	}

	/**
	*生成随机数组(有重复)，长度为arrayLen,范围在arrayScope
	*@param arrayLen 生成数组的长度
	*@param arrayScope 数组中数据的范围
	*@param sign true false
	*@return int[]数组
	*/

	public static int[] productArray(int arrayLen,int arrayScope,boolean sign) throws ArrayUtilsException{
		if (arrayLen > arrayScope){
			throw new ArrayUtilsException("您产生的数组长度不能大于数组中数字的范围");
		}
		Random rand = new Random();
		int[] i = null;
		int count = 0;
		if (sign){
			int base[] = new int[arrayScope];
			for (int j = 0; j < base.length;j++ ){
				base[j] = j + 1;
				count++;
			}
			for (int j = 0; j < arrayLen; j++ ){
				count++;
				int rIndex = rand.nextInt(arrayScope - j) + j;
				int tmp = base[j];
				base[j] = base[rIndex];
				base[rIndex] = tmp;
			}
			count += arrayLen;
			i = copyArray(base,arrayLen);
		}else{
			i = new int[arrayLen];
			for (int j = 0; j < arrayLen; ){
				count++;
				int tmp = rand.nextInt(arrayScope) + 1;
				boolean isRepeat = false;
				for (int k = 0;k < j ;k++ ){
					count++;
					if (tmp == i[k]){
					//重复
					
						isRepeat = true;
						break;
					}
				}
				if (isRepeat){
					continue;
				}
				//判断重复就重来
				i[j] = tmp; //把生成的随机数放到数组中j的位置
				j++;		//生成下一个
			}
		}
		System.out.println("去除重复次数：" + count);
		return i;
	}
	/**
	*
	*冒泡排序
	*
	*/
	public static void bubbleSort(int[] array) throws ArrayUtilsException{
		if (array == null){
			throw new ArrayUtilsException("您要排序的数组为空");
		}
		//int count = 0;
		for (int i = 0;i < array.length ;i++ ){
			for (int j = 0;j < array.length - i - 1 ; j++){
				if(array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					//count++;
				}
			}
		}
		//System.out.println("冒泡交换次数：" + count);
	}
	/**
	*选择排序
	*/
	public static void choiceSort(int[] array) throws ArrayUtilsException{
		if (array == null){
			throw new ArrayUtilsException("您要排序的数组为空");
		}
		//int count = 0;//统计次数
		for (int i = 0;i < array.length ;i++){
			int index = i;
			for (int j = i + 1;j < array.length ;j++ ){
				if (array[index] > array[j]){
					index = j;
				}
			}
			if (index != i){
				int tmp = array[i];
				array[i] = array[index];
				array[index] = tmp;
				//count++;
			}
		}
			//System.out.println("选择交换次数" + count);
	}
	public static void printArray(int i[]){
		if (i == null){
			System.out.println("您要打印的数组为null");
			return;
		}
		int index = 0;
		for (int j : i ){
			System.out.print(j + "  ");
		}
		System.out.println();
	}


	/**
	*数组的拷贝
	*/
	public static int[] copyArray(int[] origl){
		if (origl == null){
			return null;
		}
		int [] newArray = new int[origl.length];
		for (int i = 0;i < newArray.length ; i++){
			newArray[i] = origl[i];
		}
		return newArray;
	}
	
	/**
	*数组的拷贝
	*/
	public static int[] copyArray(int[] origl,int len){
		if (origl == null && len < origl.length){
			return null;
		}
		int [] newArray = new int[len];
		for (int i = 0;i < newArray.length ; i++){
			newArray[i] = origl[i];
		}
		return newArray;
	}

	/**
	*线性查找
	*/
	public static int findline(int[] targetArray,int target){
		int index = -1;
		for (int i = 0;i < targetArray.length ;i++ ){
			if (targetArray[i] == target){
				index = i;
				break;
			}
		}
		return index;
	}
	/**
	*折半查找
	*
	*/
	public static int binaryFind(int[] targetArray,int target){
		int left = 0;
		int right = targetArray.length - 1;
		int middle = 0;
		int count = 0;
		while (left <= right){
			count++;
			middle = (left + right) / 2;
			System.out.println(count + "," + left + "," + middle + "," + right);

			if (target > targetArray[middle]){
				//后半区
				left = middle + 1;
			}else if( target < targetArray[middle]){
				right = middle - 1;
			}else{
				System.out.println("共查找：" + count + "次");
				return middle;
			}
			//System.out.println("共查找：" + count + "次");
		}
		return -1;
	}
	/**
	*递归查找
	*
	*/
	public static int binaryFind2(int[] i,int t,int low,int high){
		if (low > high){
			return -1;
		}else{
			int middle = (low + high) / 2;
			if (i[middle] == t){
				return middle;
			}else{
				if (i[middle] > t){
					return binaryFind2(i,t,low,middle - 1);
				}else{
					return binaryFind2(i,t,middle + 1,high);
				}
			}
		}
	}
}