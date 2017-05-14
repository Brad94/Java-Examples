class foroddeven{
	public void oddeven(int start, int end){
		String evenadd = "1";
		String oddadd = "";
		for(int i=start; i<end; i++){
			if(i % 2 == 0){
				for(int k=start; k < i; k++){
					System.out.print(k);
					}
				System.out.println(i);

			}else if(i%2 !=0){
				for(int q = i; q > start; q--)
				{
					System.out.print(q);
				}
			System.out.println(start);
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