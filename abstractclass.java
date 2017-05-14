abstract class maths{

	abstract public void Addition(int a, int b);
	abstract public void Subtraction(int a, int b);
	public void Multiplication(int a, int b){
		int c;
		c = a * b;
		System.out.println(c);
	}	
}

class maths2 extends maths{
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
	public void Division(int a, int b){
		int c;
		c = a / b;
		System.out.println(c);
	}
}

class abstractclass{
	public static void main(String xyz[])
	{
		maths2 Ref = new maths2();
		Ref.Addition(15,15);
		Ref.Subtraction(20,10);
		Ref.Multiplication(5,2);
		Ref.Division(10,2);
		}
}