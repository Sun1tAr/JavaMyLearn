package extended;

public class Main {

	public static void main(String[] args) {
		Box box1 = new Box(5000);
		
		Ball ball = new Ball(4);
		Cylinder cyl = new Cylinder(6, 3);
		Pyramid pyr = new Pyramid(80, 50);
		
		System.out.println(box1.add(ball) + " Потому что объем фигуры: " + ball.getVolume() + " а доступно: " + box1.getVolume());
		System.out.println(box1.add(cyl) + " Потому что объем фигуры: " + cyl.getVolume() + " а доступно: " + box1.getVolume());
		System.out.println(box1.add(pyr) + " Потому что объем фигуры: " + pyr.getVolume() + " а доступно: " + box1.getVolume());
		
		

	}

}
