class Test42{

	int A; //error as is non static
	public static void Message(){
		A = 15;
		System.out.println(A);
	}

	public void Message2(){
		System.out.println("Hi");
	}
}

class teststatic{
	public static void main(String x[])
	{
		Test42 X = new Test42();
		X.Message();
	}
}