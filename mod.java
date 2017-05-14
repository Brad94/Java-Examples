class Results{

	public void marks(int a){
		System.out.println(a / 10);
		System.out.println(a % 10);
	}
}

class mod{
	public static void main(String x[]){
		Results y = new Results();
		y.marks(58);

	}
}