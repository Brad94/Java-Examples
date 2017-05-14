class Bank{

	static int Dollar;
	public void SetDollar(int A){
		Dollar = A;
	}

	public void Amount(int amo){
		System.out.println(amo * Dollar);
	}
}

class banking{
	public static void main(String x[])
	{
		Bank HSBC = new Bank();
		Bank Natwest = new Bank();

		HSBC.SetDollar(75);
		HSBC.Amount(2);

		Natwest.Amount(4);
	}
}