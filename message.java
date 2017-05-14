class One{
	public One(){
		System.out.println("Hey");
	}

	public void messager(){
		System.out.println("Hi");
	}
}

class message{
	public static void main(String xyz[])
	{
		One x = new One();
		x.messager();

	}
}