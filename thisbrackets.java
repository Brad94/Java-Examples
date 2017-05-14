class QA{

	public QA(){
		this(7);
		System.out.println("Me fourth");

	}
	public QA(int a){
		this(7,8);
		System.out.println("Me third");
	}
	public QA(int a, int b){
		this("hi");
		System.out.println("Me second");
	}
	public QA(String a){
		System.out.println("Me first");
	}
}

class thisbrackets{
	public static void main(String xyz[])
	{
		QA x = new QA();

	}
}