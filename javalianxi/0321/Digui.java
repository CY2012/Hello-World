public class Digui{
	public static int circleFactorial(int n){				//利用循环的方式求阶乘
		int sum = 1;
		if (n < 0){											//判断参数n是否为负数
			throw new IllegalArgumentException("必须为正整数");
															// 抛出不合理参数异常
		}
		for (int i = 1;i <=  n ; i++ ){						//执行n次循环操作
			sum *= i;										//每循环一次进行乘法运算
		}
		return sum;											//返回阶乘的值
	  }
	  public static int recursiveFactorial(int n){			//利用递归算法求阶乘
		  int sum = 1;
		  if(n<0)
			  throw new IllegalArgumentException("必须为正整数");
															// 抛出不合理参数异常
		  if(n == 1){
			  return 1;										//如果n=1则跳出循环
		  }else{
			  sum = n * recursiveFactorial(n-1);			//运用递归计算
			  return sum;
		  }
	   }
	   public static void main(String[] args){
		   int n = 5;
		   System.out.println("利用循环的方式求" + n + "的阶乘" +
					"\n其结果为："							//调用circleFactorial
					+ circleFactorial(n) + "\n");
					System.out.println("利用递归算法求" + n + "的阶乘" +
							"\n其结果为："					//调用recursiveFactorial
							+ recursiveFactorial(n));
		}
	}