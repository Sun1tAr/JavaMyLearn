package javaLearning;

public class Artifact {
	
	private int museumNumber;
	private String culture;
	private int centuryCreate;
	
	public Artifact(int museumNumber) {			//конструктор для первого случая (известен только музейный номер)
		this.museumNumber = museumNumber;
		
	}
	
	public Artifact(int museumNumber, String culture) {			//конструктор для второго случая (известен музейный номер и культура)
		this.museumNumber = museumNumber;
		this.culture = culture;
		
		
	}
	
	public Artifact(int museumNumber, String culture, int centuryCreate) {		//конструктор для третьего случая (известно все)
		this.museumNumber = museumNumber;
		this.culture = culture;
		this.centuryCreate = centuryCreate;
		
	}
	
	public static void main(String[] args) {
		
		Artifact bow = new Artifact (123654);
		
		Artifact book = new Artifact(125456, "HullyGully");
		
		Artifact cowu = new Artifact(524364, "Рэкавены", 12);
		
		System.out.println(book.culture + " " + bow.museumNumber + " " + cowu.centuryCreate);
		
	}
}
