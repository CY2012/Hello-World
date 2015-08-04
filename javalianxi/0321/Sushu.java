//将1~200之间的所有素数一一打印出来，并将素数的总数求出，具体代码如下：
public class Sushu{
	private static boolean[] primeNumber(int num){ //求质数
		if(num<=0){								   //检查指定的范围
		System.out.println("范围必须大于0");
		return null;
	}
	 boolean[]primes=new boolean[num+1];//声明布尔类型数组，长度为范围1
	 primes[1]=false;					//将特殊数字1抛出，因为1不是质数
	 Arrays.fill(primes, 2,num+1，true);//将布尔数组元素的值都赋为true
	 int n=(int)Math.sqrt(num);			//Math.sqrt()方法用于求开方
	 for(int i=1;i<n;i++){
		if(primes[i]){					//如果是质数，那么i的倍数不是质数
			for(int j=2*i;j<=num;j+=i ){
				primes[j]=false;

			}
		}
	}
	return primes;
}
public static void showPrimeNumber(int num){	//显示质数
	boolean [] primes=primeNumber(num);	//调用方法赋值给布尔类型的数组
	int n=0;
	if(primes!=null){
		for(int i=1;i<primes.length;i++){ // 循环数组操作数组的元素
			if(primes[i]){				  //如果数组元素值为true，则下标值为质数
				System.out.print(i+" ");  //输出质数
				if(++n%10==0)			  //以每行10个质数输出
					System.out.println();
			}
		}
		System.out.println();
	}
	System.out.println("一共有"+n+"个");
}
public static void main(String[] args){
    int sum = 100;							//声明求质数的范围
	System.out.println("范围下"+num+"内的质数有:");
	showPrimeznumber(num);					//调用方法显示质数
	}
}