class Math{

	public void Add(int a , int b){
		System.out.println(a + b);
	}
	public void Sub(int a , int b){
		System.out.println(a - b);
	}
}

class QA extends Math{

	public void Div(int a , int b){
		System.out.println(a / b);
	}
}


class something{
	public static void main(String xyz[])
	{
		Math R = new QA();
		R.Add(4,2);
	}
}