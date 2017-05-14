import java.util.ArrayList;

class calculate3{
	public String uniquepeople(String a, int b, String c){

		String name = "";
		int age = 0;
		String job = "";

		name = a;
		age = b;
		job = c;

		String people = "Name: " + name + " Age: " + age + " Job: " + job;
		return people;
	}
}

public class people {
	public static void main(String args[]){

		calculate3 x = new calculate3();

	    ArrayList<String> al = new ArrayList<String>();
	    al.add(x.uniquepeople("Bob", 20, "Software Engineer"));
	    al.add(x.uniquepeople("Jane", 27, "IT Consultant"));

	   int arrsize = al.size();
	   for(int i = 0; i < arrsize; i++){
		    System.out.println("Contents of al: " + al.get(i));
	   }
	}
}

