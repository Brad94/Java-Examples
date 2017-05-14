class maths{

	public void Addition(int a, int b){
		int c;
		c = a + b;
		System.out.println(c);
	}
	public void Subtraction(int a, int b){
		int c;
		c = a - b;
		System.out.println(c);
	}
}

class maths2 extends maths{
	public void Multiplication(int a, int b){
		int c;
		c = a * b;
		System.out.println(c);
	}
	public void Division(int a, int b){
		int c;
		c = a / b;
		System.out.println(c);
	}
}

class maths3 extends maths2{
		public void Addition(int a, int b){
		int c;
		c = a + b;
		System.out.println("Result = " + c);
	}
		public void Modulus(int a, int b){
		int c;
		c = a % b;
		System.out.println(c);
	}
}

class mathsoveriding{
	public static void main(String xyz[])
	{
		maths3 Ref = new maths3();
		Ref.Addition(15,15);
		Ref.Subtraction(20,10);
		Ref.Multiplication(5,2);
		Ref.Division(10,2);
		Ref.Modulus(10,2);
		}
}