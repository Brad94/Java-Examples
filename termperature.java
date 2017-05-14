class calculate2{
	public void uniquetemperature(int a){

		boolean isSummer = false;
		int upperLimit = 0;
		if(isSummer == false){
			upperLimit = 90;
		}else if(isSummer == true){
			upperLimit = 100;
		}
		if(a >= 60 && a <= upperLimit){
			System.out.println("True");
		}else{
			System.out.println("False");
		}

	}
}

public class termperature {
	public static void main(String args[]){

		calculate2 x = new calculate2();
		x.uniquetemperature(100);
	}
}

