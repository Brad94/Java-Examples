class Results{

	public void marks(int a){
		int b,c,d,w,x,y,z;

		w = a / 1000;
		x = a / 100;
		y = a / 10;
		z = a / 1;

		b = x % 10;
		c = y % 10;
		d = z % 10;

		System.out.println(w + b + c + d);
	}
}

class mod3{
	public static void main(String x[]){
		Results y = new Results();
		y.marks(9911);

	}
}