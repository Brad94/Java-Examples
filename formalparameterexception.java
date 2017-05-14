class formalparameterexception{
	public static void main(String X[])
	{
		int A,B,C,D;
		A = B = C = D = 0;
		A = Integer.parseInt(X[0]);
		B = Integer.parseInt(X[1]);

		if (X.length > 2){
			System.out.println("Please send only two values");
		}else if(A <= 0 || B <= 0){
			System.out.println("Please send only positive values");
		}else{
			try{
				C = A/B;
				System.out.println("Result " + C);
			}
			catch(NumberFormatException h){
				System.out.println("Please send only numeric values");
			}
			catch(ArithmeticException j){
				System.out.println("Please do not divide by zero");
			}
			catch(ArrayIndexOutOfBoundsException  k){
				System.out.println("Please provide two numbers");
			}
		}

	}
}