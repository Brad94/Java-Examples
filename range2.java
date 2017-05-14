class foroddeven{
	public void oddeven(int start, int end){
		String evenadd = "1";
		for(int j=start; j<end; j++){
			evenadd += j + 1;
			if(j % 2 != 0){
					System.out.println(j);
					System.out.println(evenadd);
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