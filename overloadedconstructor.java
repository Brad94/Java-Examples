class QA{
	public QA(){
		System.out.println("Hey");
	}

	public QA(int a, int b){
		System.out.println(a + b);
	}

}

class overloadedconstructor{
	public static void main(String xyz[])
	{
		QA x = new QA(1,2);

	}
}