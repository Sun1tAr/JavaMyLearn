package javaLearning;

public class Dishes extends ArtifactGetSetCons{
	
	boolean hohloma;
	public Material material = new Material();

	public Dishes(int museumNumber, String culture, int centuryCreate, String name, boolean hohloma) {
		
		setValues(museumNumber, culture, centuryCreate, name);
		this.hohloma = hohloma;
		
	}
	
	@Override
	public void setValues(int museumNumber, String culture, int centuryCreate, String name) {
		
		super.setValues(museumNumber/1000, culture, centuryCreate, name);
		
	}
	
	public static void main(String[] args) {
	
	
	
	
//	cup.setValues(5565, "Хманы", -15, "Каменн4ая кружка");
//	
//	printValues(cup);
	
	
//	cup.material.setMaterial(false, false);
//	cup.material.getMaterial();
	
	}

	@Override
	public void moveObject(String name) {
		
		System.out.println("Само неподвижно " + name);
		
	}
}

