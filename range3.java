class foroddeven{
	public void oddeven(int start, int end){
		String evenadd = "1";
		String oddadd = "";

		for(int i=start; i<=end; i++){
			int i = 3;
			i++;
			for(int k=i; k>=start; k--){
					oddadd += k - 1;
					if(k % 2 == 0){
						System.out.println(oddadd + "odd");
					}
			}
		}
	}
}

class range2{
	public static void main(String xyz[])
	{
		foroddeven x = new foroddeven();
		x.oddeven(1,11);
	}
}