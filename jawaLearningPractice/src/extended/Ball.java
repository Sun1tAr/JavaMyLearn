package extended;

public class Ball extends SolidOfRevolution {

	public Ball(double radius) {
		super(radius);
	}

	@Override
	public double getVolume() {
		return (Math.PI * Math.pow(radius, 3) * 4 / 3);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Автоматически созданная заглушка метода
		return 0;
	}

	

}
