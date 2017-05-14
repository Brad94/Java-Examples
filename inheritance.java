class UK{
	int a,b;
	public void Message(){
		System.out.println("Hi");
	}
}

class ABC extends UK{
	
}

class inheritance{
	public static void main(String xyz[])
	{
		ABC Ref = new ABC();
		Ref.a = 15;
		Ref.b = 12;
		Ref.Message();
	}
}