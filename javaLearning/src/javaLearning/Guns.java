package javaLearning;

public class Guns extends ArtifactGetSetCons{
	
	boolean engraved;
	public Material material = new Material();

	public Guns(int museumNumber, String culture, int centuryCreate, String name, boolean engraved) {
		
		super(museumNumber, culture, centuryCreate, name);
		this.engraved = engraved;
	}
		
	
	
	public static void main(String[] args) {
		
		
		}
	
	@Override
	public void moveObject(String name) {
		// TODO Auto-generated method stub
		System.out.println("Имя рассмaтриваемого объекта: " + name);
		
	}




	
	
}
