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

final class maths2 extends maths{
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

class finalclass{
	public static void main(String xyz[])
	{
		maths2 Ref = new maths2();
		Ref.Addition(15,15);
		Ref.Subtraction(20,10);
		Ref.Multiplication(5,2);
		Ref.Division(10,2);
	}
}