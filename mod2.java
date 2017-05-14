class Results{

	public void marks(int a){
		int x,y,z;
		x = a / 100;
		y = a % 10;
		z = a % 10;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(x + y + z);
	}
}

class mod2{
	public static void main(String x[]){
		Results y = new Results();
		y.marks(733);

	}
}