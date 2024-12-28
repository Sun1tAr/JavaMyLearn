package javaLearning;


public class Vector {
	
	@SuppressWarnings("unused")
	private double[] vector;
	private double x, y, z;
	
	public Vector(double[] vector) {
		this.vector = vector; 
		x = vector[0];
		y = vector[1];
		z = vector[2];
	}
	
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	/*public double getVectorX() {
		return x;
	}
	
	public double getVectorY() {
		return y;
	}
	
	public double getVectorZ() {
		return z;
	}
	
	public void setVectorX()*/
	
	public double length() {
		
		return Math.sqrt(x * x + y * y + z * z);
	}
	
	public double scalarMultiply(Vector vector) {
		return 	x * vector.x + y * vector.y + z * vector.z;
		
	}
	
	public Vector vectorMultiply(Vector vector) {
		return new Vector (
							y * vector.z - z * vector.y, 
							z * vector.x - x * vector.z,
							x * vector.y - y * vector.x );
	}
	
	public double cos(Vector vector) {
		
		return scalarMultiply(vector) / (length() * vector.length());
	}
	
	public Vector sum(Vector vector) {
		return new Vector(x + vector.x, y + vector.y, z + vector.z);
		
	}
	
	public Vector dif(Vector vector) {
		return new Vector(x - vector.x, y - vector.y, z + vector.z);
	}
	
	@Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
	
	public static void main(String[] args) {
		
		Vector vectorA = new Vector(6 , 7 , 12);
		Vector vectorB = new Vector (-4 , -1 , 0);
		System.out.println(vectorA.length());
		System.out.println(vectorA.scalarMultiply(vectorB));
		System.out.println(vectorA.vectorMultiply(vectorB));
		System.out.println(vectorA.cos(vectorB));
		System.out.println(vectorA.sum(vectorB));
		System.out.println(vectorA.dif(vectorB));

	}

}
