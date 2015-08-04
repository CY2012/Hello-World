public class OptDemo2{
	public static void main(String[] args){
		/*
		boolean b = true;
		System.out.println(!!b);
		*/
	    int a = 1,b = 1;
		double d = 1.0;
		boolean r1 = a > b;
		boolean r2 = a < b;
		boolean r3 = a >= b;
		boolean r4 = a <= b;

		int i = 2,j = 2;
		boolean rel = (i == j) & (i > 1);

		int output = 10;
		boolean b1 = false;

		if ((b1 == true) && (output += 10) == 20)
		{
			System.out.println("Õæ" + output);
		}
		else{
		   System.out.println("¼Ù" + output);
		}

		if ((b1 == true) & (output += 10) == 20)
		{
			System.out.println("Õæ" + output);
		}
		else{
		   System.out.println("¼Ù" + output);
		}

		if ((b1 == false) || (output += 10) == 20)
		{
			System.out.println("Õæ" + output);
		}
		else{
		   System.out.println("¼Ù" + output);
		}

	}
}