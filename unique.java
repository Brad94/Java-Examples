class calculate1{
	public void uniquecalculate(int a, int b, int c){

	int comparisona = a;
	int comparisonb = b;
	int comparisonc = c;

	if(a == b){
		comparisona = 0;
		System.out.println("A1 " + comparisona);
	}
	if(a == c){
		comparisona = 0;
		System.out.println("A2 " + comparisona);
	}
	if(b == a){
		comparisonb = 0;
		System.out.println("B1 " + comparisonb);
	}
	if(b == c){
		comparisonb = 0;
		System.out.println("B2 " + comparisonb);
	}
	if(c == a){
		comparisonc = 0;
		System.out.println("C1 " + comparisonc);
	}
	if(c == b){
		comparisonc = 0;
		System.out.println("C2 " + comparisonc);
	}

	int sum = comparisona + comparisonb + comparisonc;

	System.out.println(sum);

	}

}

public class unique {
	public static void main(String args[]){

		calculate1 x = new calculate1();
		x.uniquecalculate(1,1,2);
	}
}

