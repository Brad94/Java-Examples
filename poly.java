abstract class Drawing{
	abstract public void Draw();
}

class Line extends Drawing{

	public void Draw(){
		System.out.println("I am a line");
	}
}
class Circle extends Drawing{

	public void Draw(){
		System.out.println("I am a circle");
	}
}

class Square extends Drawing{

	public void Draw(){
		System.out.println("I am a square");
	}
}
class poly{

	public static void doDrawing(Drawing x){
		x.Draw();
	}
	public static void main(String x[])
	{
		Line L = new Line();
		doDrawing(L);
		Circle C = new Circle();
		doDrawing(C);
		Square S = new Square();
		doDrawing(S);
   	}
}