class Accounts{
	public void VAT(){
		System.out.println("20%");
	}
	public void VAT(int salary){
		float tax = salary * 20.0f / 100;
		System.out.println("VAT = " + tax);

	}
	public void VAT(int salary, float t){
		float tax = salary * t / 100;
		System.out.println("VAT = " + tax);
	}
}

class vat{
	public static void main(String xyz[])
	{
		Accounts QA = new Accounts();
		QA.VAT();
		QA.VAT(100);
		QA.VAT(1000,25.7f);
	}
}