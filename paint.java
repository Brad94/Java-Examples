import java.util.*;

public class paint {
	public static void main(String args[]){
		int toPaint = 0;
		try{
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("What is the meters of the room?");
		toPaint = scanner1.nextInt();
		}catch(InputMismatchException nfe) {
		    System.out.println("Not a valid number");
		}catch(Exception ex) {
			System.out.println("Error");
		}

		int CheapoMeters = 10;
		int AverageMeters = 11;
		int DuluxMeters = 20;

		double CheapoPrice = 19.99;
		double AveragePrice = 17.99;
		double DuluxPrice  = 25.00;

		double CheapoPricePerMeter = CheapoPrice / CheapoMeters;
		double AveragePricePerMeter = AveragePrice / AverageMeters;
		double DuluxPricePerMeter = DuluxPrice / DuluxMeters;

		double CheapoPredictedPrice =  CheapoPricePerMeter * toPaint;
		double AveragePredictedPrice =  AveragePricePerMeter * toPaint;
		double DuluxPredictedPrice =  DuluxPricePerMeter * toPaint;

		if(CheapoPredictedPrice < AveragePredictedPrice && CheapoPredictedPrice < DuluxPredictedPrice){
			System.out.println("Cheapo is the cheapest");
		}else if(AveragePredictedPrice < CheapoPredictedPrice && AveragePredictedPrice < DuluxPredictedPrice){
			System.out.println("Average is the cheapest");
		}else if(DuluxPredictedPrice < AveragePredictedPrice && DuluxPredictedPrice < CheapoPredictedPrice){
			System.out.println("Dulux is the cheapest");
		}

		int CheapoWastage = CheapoMeters - toPaint;
		int AverageWastage = AverageMeters - toPaint;
		int DuluxWastage = DuluxMeters - toPaint;

		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		if(CheapoWastage >= 0){
			 arraylist.add(CheapoWastage);
		}

		if(AverageWastage >= 0){
			arraylist.add(AverageWastage);
		}
		if(DuluxWastage >= 0){
			arraylist.add(DuluxWastage);
		}

		Collections.sort(arraylist);
		if(CheapoWastage == arraylist.get(0)){
			System.out.println("Cheapo wastes the least");
		}else if(AverageWastage == arraylist.get(0)){
			System.out.println("Average wastes the least");
		}else if(DuluxWastage == arraylist.get(0)){
			System.out.println("Dulux wastes the least");
		}
	}
}

