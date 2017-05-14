class Results{
	String failedsubjects;
	private float phy,che,math;
	private int failed, invalid;

	public void physics(int p){
		if(p >= 0 && p <= 150){
			if (p < 65){
				failed++;
				failedsubjects = "Physics";
			}else{
				phy = p;
			}
		}else{
			invalid = 1;
		}
	}

	public void chemistry(int c){
		if(c >= 0 && c <= 150){
			if (c < 65){
				failed++;
				failedsubjects += ",Chemistry";
			}else{
				che = c;
			}
		}else{
			invalid++;
		}
	}


	public void math(int m){
		if(m >= 0 && m <= 150){
			if (m < 65){
				failed++;
				failedsubjects += ",Maths";
			}else{
				math = m;
			}
		}else{
			invalid++;
		}

		if(failedsubjects == null){
			failedsubjects = "None failed";
			System.out.println(failedsubjects);
		}else{
			System.out.println(failedsubjects);
		}
			float d = phy + che + math;
			float e = (phy / 150) * 100;
			float f = (che / 150) * 100;
			float g = (math / 150) * 100;
			float h = (d / 450) * 100;
			System.out.println("Physics Percentage " + e + "\nChemistry Percentage " + f + "\nMath Percentage " + g + "\nTotal Percentage " + h + "\nTotal Marks " + d);

		}
}
class course2{
	public static void main(String x[]){
		Results y = new Results();
		y.physics(150);
		y.chemistry(150);
		y.math(150);

	}
}