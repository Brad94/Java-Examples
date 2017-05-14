import java.util.ArrayList;
import java.util.Scanner;

	class Vehicle{
			String colour = "";
			String fuelType = "";
	}

	class Car extends Vehicle{

		public String car(String a, String b, int c){

			String colour = a;
			String fuelType = b;
			int NumOfDoors = c;

			String car = "Type: Car " + "Colour: " + colour + " Fuel Type: " + fuelType + " Number of Doors: " + NumOfDoors;
			return car;
		}

	}

	class Motorcycle extends Vehicle{

		public String motorcycle(String a, String b, boolean c){

			String colour = a;
			String fuelType = b;
			boolean stablisers = c;

			String motorcycle = "Type: Motorcycle " + "Colour: " + colour + " Fuel Type: " + fuelType + " Stablisers: " + stablisers;

			return motorcycle;
		}

	}


public class Garage {
	public static void main(String args[]){
		int initialPrice = 1000;
		int carPrice = 1000;
		int bikePrice = 1000;

		Car x = new Car();
		Motorcycle y = new Motorcycle();
	    ArrayList<String> al = new ArrayList<String>();
	    al.add(x.car("White", "Petrol", 4));
	    al.add(y.motorcycle("White", "Petrol", false));

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Do you want to add a new vehicle?");
		int yesno1 = scanner1.nextInt();
		if(yesno1 == 1){
		    al.add(x.car("White", "Petrol", 4));
			System.out.println("New car added");
		}else{
			System.out.println("Nothing added");
		}

		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Do you want to remove a vehicle?");
		int yesno2 = scanner2.nextInt();
		if(yesno2 == 1){
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("What is the index?");
			int indexnumber = scanner3.nextInt();

			al.remove(indexnumber);

			System.out.println(indexnumber + " removed");
		}else{
			System.out.println("Nothing removed");
		}
	    System.out.println(al);

	   int arrsize = al.size();
	   for(int i = 0; i < arrsize; i++){
		    if(al.get(i).contains("Car") == true){
		    	int newprice  = initialPrice * 2;
		    	carPrice = newprice;
		    }
		    if(al.get(i).contains("Motorcycle") == true){
		    	int newprice  = initialPrice * 4;
		    	bikePrice = newprice;
		    }
	   }

	   System.out.println("Car price " + carPrice + " Bike price " + bikePrice);
	}

	public void emptyGarage(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to empty the garage?");
		int yesno = scanner.nextInt();
		if(yesno == 1){
			al.clear();
			System.out.println("Emptied");
		}else{
			System.out.println("Not emptied");
		}
	}
}

