class Results{

	public void marks(double a, double b){
		float c,d,w,x,y,z;

	double change = b - a;

	System.out.println(change);

	if(change == 0.05){
		System.out.println("Tender 1 x 5p");
	}else 
	if(change == 0.10){
		System.out.println("Tender 1 x 10p");
	}else 
	if(change == 0.20){
		System.out.println("Tender 1 x 20p");
	}else 
	if(change == 0.30){
		System.out.println("Tender 1 x 20p and 1 x 10p");
	}else 
	if(change == 0.40){
		System.out.println("Tender 2 x 20p");
	}else 
	if(change == 0.50){
		System.out.println("Tender 1 x 50p");
	}else 
	if(change == 0.60){
		System.out.println("Tender 1 x 50p and 1 x 10p");
	}else 
	if(change == 0.70){
		System.out.println("Tender 1 x 50p and 1 x 20p");
	}else 
	if(change == 0.80){
		System.out.println("Tender 1 x 50p and 1 x 20p and 1 x 10p");
	}else 
	if(change == 0.90){
		System.out.println("Tender 1 x 50p and 2 x 20p");
	}else 
	if(change == 1.0){
		System.out.println("Tender 1 x £1");
	}else 
	if(change == 2.0){
		System.out.println("Tender 1 x £2");
	}else 
	if(change == 3.0){
		System.out.println("Tender 1 x £1 and 1 x £2");
	}else 
	if(change == 4.0){
		System.out.println("Tender 2 x £2");
	}else 
	if(change == 5.0){
		System.out.println("Tender 1 x £5 note");
	}else 
	if(change == 6.0){
		System.out.println("Tender 1 x £5 note and 1 x £1");
	}else 
	if(change == 7.0){
		System.out.println("Tender 1 x £5 note and 2 x £1");
	}else 
	if(change == 8.0){
		System.out.println("Tender 1 x £5 note and 1 x £2 and 1 x £1");
	}else 
	if(change == 9.0){
		System.out.println("Tender 1 x £5 note and 2 x £2");
	}else 
	if(change == 10.0){
		System.out.println("Tender 1 x £10 note");
	}else 
	if(change == 11.0){
		System.out.println("Tender 1 x £10 note and 1 x £1");
	}else 
	if(change == 12.0){
		System.out.println("Tender 1 x £10 note and 1 x £2");
	}else 
	if(change == 13.0){
		System.out.println("Tender 1 x £10 note and 2 x £2 and 1 x £1");
	}else 
	if(change == 14.0){
		System.out.println("Tender 1 x £10 note and 2 x £2");
	}else 
	if(change == 15.0){
		System.out.println("Tender 1 x £10 note and 1 x £5 note");
	}else 
	if(change == 20.0){
		System.out.println("Tender 1 x £20 note");
	}else 
	if(change == 30.0){
		System.out.println("Tender 2 x £20 note and 1 x £10 note");
	}else 
	if(change == 40.0){
		System.out.println("Tender 2 x £20 note");
	}else 
	if(change == 50.0){
		System.out.println("Tender 2 x £20 note and 1 x £10 note");
	}else{
		System.out.println("Work it out");
	}
	}
}

class change{
	public static void main(String x[]){
		Results y = new Results();
		y.marks(49.50,50); //price + tender

	}
}