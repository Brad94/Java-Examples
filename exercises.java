class classone{

	public int message(int x, int y, String bool){
		int sum;
		if (x == 0 || y == 0) {
			sum  = x + y;
			System.out.println(sum);

		}
		else if (bool == "True") {
			sum  = x + y;
			System.out.println(sum);
		}else
		{
			sum = x * y;
			System.out.println(sum);
		}

		return sum;
	}
}

class exercise{
	public static void main(String args[]){

	int one = 0;
	int two = 0;
	String bool = "True";

	classone x = new classone();


	for (int i = 1; i <= 10; i++) {
		one = i;
		x.message(one,two,bool);
	}


	}
}