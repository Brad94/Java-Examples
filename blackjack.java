class calculate{
	public void blackjackcalculate(int a, int b){

		if(a > 21 || b > 21){
			System.out.println("0");
		}
		else if(a > 0 && b > 0 && a <= 21 && b <= 21 ){
			int subtracta = 21 - a;
			int subtractb = 21 - b;

			if(a > b){
				System.out.println(a);
			}else if(b > a){
				System.out.println(b);
			}

		}
	}
}

public class blackjack {
	public static void main(String args[]){

		calculate x = new calculate();
		x.blackjackcalculate(18,16);

	}
}

