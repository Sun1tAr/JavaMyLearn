package javaLearning;

public abstract class ArtifactGetSetCons {

	private int museumNumber;
	private String culture;
	private int centuryCreate;
	private String name;
	
	
	public ArtifactGetSetCons() {}
	
	public ArtifactGetSetCons(int museumNumber, String culture, int centuryCreate, String name) {
		
		setValues(museumNumber, culture, centuryCreate, name);
	}
	
	public void setValues(int museumNumber, String culture, int centuryCreate, String name) {
		
		this.museumNumber = museumNumber;
		this.culture = culture;
		this.centuryCreate = centuryCreate;
		this.name = name;
		
	}
	
	public int getMuseumNumber() {     // мы получаем, то есть узнаем номер музейного экспоната
		return museumNumber;
	}
	
	public String getCulture() {
		return culture;
	}
	
	public int getCenturyCreate() {
		return centuryCreate;
	}
	
	public String getName() {
		
		return name;
	}
	
	public static void printValues(ArtifactGetSetCons artifact) {
			
		System.out.println("Номер музейного экспоната: " + artifact.getMuseumNumber() + "\n" + 
							"Наименование музейного экспоната: " + artifact.getName() + "\n" + 
							"Принадлежность культуре: " + artifact.getCulture() + "\n" + 
							"Век создания: " + artifact.getCenturyCreate());
		System.out.println("-------------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public abstract void moveObject(String name);
	
	class Material{
		
		private boolean fragile, strong;
		
		
		public void setMaterial(boolean fragile, boolean strong) {
			this.fragile = fragile;
			this.strong = strong;
			
		}
		public void getMaterial() {
			if (fragile == true && strong == true) System.out.println("Материал перекален или имеет стеклянную струтуру");
			else if (fragile == false && strong == true) System.out.println("Материал закален, предположительно сталь");
			else if (fragile == true && strong == false) System.out.println("Материал имеет стеклянную структуру");
			else if (fragile == false && strong == false) System.out.println("Это аморфная материя");
			System.out.println("-------------------------------------------------------");
		}
	}
}
