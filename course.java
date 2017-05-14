class Results{
	private float x,y,z;
	private String failedsubjects;

	public void marks(float a, float b, float c){
		if(a >= 0 && a <= 150 && b >= 0 && b <= 150 && c >= 0 && c <= 150 ){
			x = a;
			y = b;
			z = c;
			passfail(x,y,z);
		}else{
			System.out.println("Invalid Value Entered");
		}
	}
	public void passfail(float x, float y, float z){
		if(x < 65){
			System.out.println("Failed Physics");
		}else if(y < 65){
			System.out.println("Failed Chemistry");
		}else if(z < 65){
			System.out.println("Failed Maths");
		}else if(x >= 65 && y >= 65 && z >= 65){
			float d = x + y + z;
			float e = (x / 150) * 100;
			float f = (y / 150) * 100;
			float g = (z / 150) * 100;
			float h = (d / 450) * 100;
			System.out.println("Physics Percentage " + e + "\nChemistry Percentage " + f + "\nMath Percentage " + g + "\nTotal Percentage " + h + "\nTotal Marks " + d);
		}else if(x < 65 && y >= 65 && z >= 65 || x >= 65 && y < 65 && z >= 65 || x >= 65 && y >= 65 && z < 65){

			System.out.println("Retake the exam");

		}else if(x >= 65 && y < 65 && z < 65 || x < 65 && y >= 65 && z < 65 || x < 65 && y < 65 && z >= 65){

			System.out.println("Retake the course");

		}else if(x < 65 && y < 65 && z < 65){

			System.out.println("Go Home");

		}
	}
}

class course{
	public static void main(String x[]){
		Results y = new Results();
		y.marks(10,150,150);

	}
}