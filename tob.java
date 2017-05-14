class Results{
	private int x,y;

	public void physics(int a){
		if(a < 151){
			x = a;
		}else{
			System.out.println("Invalid Physics Marks");
		}
	}
	public void chemistry(int a){
		if(a < 151){
			y = a;
		}else{
			System.out.println("Invalid Chemistry Marks");
		}
	}
	public void showResults(){
		int c;
		c = x+y;
		System.out.println("Total Marks" + c);
		if(c == 300){
			System.out.println("Percentage 100%");
		}else{
			System.out.println("Percentage not 100%");
		}
	}
}

class tob{
	public static void main(String x[]){
		Results y = new Results();
		y.physics(150);
		y.chemistry(155);
		y.showResults();

	}
}