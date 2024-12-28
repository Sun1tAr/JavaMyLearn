package extended;

import java.util.ArrayList;

public class Box extends Shape {

	private ArrayList<Shape> shapes = new ArrayList<>();
	private double available;
	
	public Box(double available) {
		
		this.available = available;
		
	}
	
	public boolean add (Shape shape) {
		
		if (available >= shape.getVolume()) {
			shapes.add(shape);
			available -= shape.getVolume();
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public double getVolume() {
		return available;
	}

}
