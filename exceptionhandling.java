class MyExpt extends Exception{}

class MyMath{
	public float Division(int A, int B) throws MyExpt{

		float C = 0;
		if(B > A){
			MyExpt E = new MyExpt();
			throw E;
		}
		C = (float) A/B;
	return C;
	}
}

class exceptionhandling{
	public static void main(String X[])
	{
		MyMath M = new MyMath();
		try{
			System.out.println(M.Division(4,2));
		}
		catch(MyExpt Y){
			System.out.println("Error");
		}
		catch(Exception Z){
			System.out.println("Error");
		}
	}
}