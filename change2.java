class Results{

	public void marks(float a, float b){

	float changeround = b - a;
	double change = Math.round(changeround*100.0)/100.0;


	System.out.println("Price " + a + "Tender " + b + "Change " + change);

		if(change >= 50){
			change -= 50;
			System.out.println("Tender £50");
		}

		if(change >= 20){
			change  -= 20;
			System.out.println("Tender £20");
		}
		if(change >= 10){
			change -= 10;
			System.out.println("Tender £10");
		}
		if(change >= 5){
			change -= 5;
			System.out.println("Tender £5");
		}
		if(change >= 2){
			change -= 2;
			System.out.println("Tender £2");
		}
		if(change >= 1){
			change -= 1;
			System.out.println("Tender £1");
		}
		if(change >= 0.50){
			change -= 0.50;
			System.out.println("Tender 50p");
		}
		if(change >= 0.20){
			change -= 0.20;
			System.out.println("Tender 20p");
		}
		if(change >= 0.10){
			change -= 0.10;
			System.out.println("Tender 10p");
		}
		if(change >= 0.05){
			change -= 0.05;
			System.out.println("Tender 5p");
		}
		if(change >= 0.02){
			change -= 0.02;
			System.out.println("Tender 2p");
		}
		if(change >= 0.01){
			change -= 0.01;
			System.out.println("Tender 1p");
		}

	System.out.println(change);

	}
}

class change2{
	public static void main(String x[]){
		Results y = new Results();
		y.marks(25f,50); //price + tender

	}
}
