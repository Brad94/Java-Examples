class exceptionhandler{
	public static void main(String x[])
	{
		int A,B,C;
		A = 4;
		B = 2;

		try{
			C = A/B;
			System.out.println("Result " + C);

		}
		catch(ArithmeticException z){
			System.out.println("Please do not divide by zero");
		}

	}
}