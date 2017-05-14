import java.util.Scanner;

public class recursion {
	public static void main(String args[]){

	int one = 1;
	Scanner sc = new Scanner(System.in);
	int er = sc.nextInt();


    int[] myArray;
    myArray = new int[10];

    for (int i = 0; i < myArray.length; i++) {
       myArray[i] = one;
       one++;
    }
    for (int j = 0; j < myArray.length; j++) {
        int times = myArray[j] * 10;
        myArray[j] = times;
     }
    System.out.println(myArray[9]);
	}
}
