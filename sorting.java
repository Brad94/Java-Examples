import java.util.Arrays;

class Sorter{
	public float Sorting(int intValuesArr[]){
		int tmp = 0;
		int val1, val2, val3, val4, val5, val6, val7, val8, val9, val10;
		val1 = val2 = val3 = val4 = val5 = val6 = val7 = val8 = val9 = val10 = 0;
		int intSortedArr[] = {val1, val2, val3, val4, val5, val6, val7, val8, val9, val10};
		 for (int i = 0; i < intValuesArr.length; i++) {
			for (int j = i + 1; j < intValuesArr.length; j++) {
				if (intValuesArr[i] > intValuesArr[j]) {
					int incre = 0;
					incre++;
					tmp = intValuesArr[i];
					tmp = intSortedArr[incre];
					intValuesArr[j] = intValuesArr[i];
					intValuesArr[j] = tmp;
					}


			}
		}
		System.out.println(tmp);
		System.out.println(intSortedArr);
		return tmp;
	}
}

class sorting{
	public static void main(String X[])
	{
		int val1, val2, val3, val4, val5, val6, val7, val8, val9, val10;

		val1 = Integer.parseInt(X[0]);
		val2 = Integer.parseInt(X[1]);
		val3 = Integer.parseInt(X[2]);
		val4 = Integer.parseInt(X[3]);
		val5 = Integer.parseInt(X[4]);
		val6 = Integer.parseInt(X[5]);
		val7 = Integer.parseInt(X[6]);
		val8 = Integer.parseInt(X[7]);
		val9 = Integer.parseInt(X[8]);
		val10 = Integer.parseInt(X[9]);

		int intValuesArr[] = {val1, val2, val3, val4, val5, val6, val7, val8, val9, val10};

		if (X.length > 10 || X.length < 10){
			System.out.println("Please send only ten values");
		}else{
			Sorter M = new Sorter();
			try{
				System.out.println(M.Sorting(intValuesArr));
			}
			catch(NumberFormatException h){
					System.out.println("Please send only numeric values");
			}
			catch(Exception Z){
				System.out.println("Error");
			}
		}
	}
}