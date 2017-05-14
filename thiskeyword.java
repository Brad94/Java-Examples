class QA{
	int a,b,c;
	public void QA(){
		int a,c;
		this.a = 15;
		c = 15;
	}
	public void QA1(){
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);


	}
}

class thiskeyword{
	public static void main(String xyz[])
	{
		QA x = new QA();
		x.QA();
		x.QA1();

	}
}