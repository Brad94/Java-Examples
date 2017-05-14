class foroddeven{
	public void oddeven(int start, int end){
		if(start == end){
			System.out.println(start);
		}else{
			System.out.println("Incrementing");

			for(int i=start; i<end; i++){
				if(i % 2 == 0){
					System.out.println(i + " Even");
				}
				else{
					System.out.println(i + " Odd");
				}
			}
			System.out.println("Decrementing");

			 for(int i=end; i>start; i--){
				if(i % 2 == 0){
					System.out.println(i + " Even");
				}
				else{
					System.out.println(i + " Odd");
				}
			}
		}
	}
}

class range{
	public static void main(String xyz[])
	{
		foroddeven x = new foroddeven();
		x.oddeven(10,21);
	}
}