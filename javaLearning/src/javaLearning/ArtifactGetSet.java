package javaLearning;

public class ArtifactGetSet {
	
	private int museumNumber;
	private String culture;
	private int centuryCreate;
	private String name;
	
	public int getMuseumNumber() {     // мы получаем, то есть узнаем номер музейного экспоната
		return museumNumber;
	}
	
	public void setMuseumNumber(int museumNumber) { // мы записываем номер музейного экспоната в базу, то есть присваиваем
		if (museumNumber > 0) this.museumNumber = museumNumber;
		else System.out.println("Ошибка - измените номер");
		
	}
	
	public String getCulture() {
		return culture;
	}
	
	public void setCulture(String culture) {
		if (culture != "") this.culture = culture;
		else this.culture = "Неизвестно";
		
	}
	
	public int getCenturyCreate() {
		return centuryCreate;
	}
	
	public void setCenturyCreate(int centuryCreate) {
		if (centuryCreate <= 21) this.centuryCreate = centuryCreate;
		else System.out.println("Ошибка - век создания некорректен");
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		if (name != "") this.name = name;
		else System.out.println("Ошибка - введите наименование артефакта");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArtifactGetSet swords = new ArtifactGetSet();
		swords.setMuseumNumber(5);
		swords.setCulture("");
		swords.setCenturyCreate(21);
		swords.setName("Меч");
		System.out.print("Номер музейного экспоната: " + swords.getMuseumNumber() + "\n" + 
		"Наименование музейного экспоната: " + swords.getName() + "\n" + 
		"Принадлежность культуре: " + swords.getCulture() + "\n" + 
		"Век создания: " + swords.getCenturyCreate());
		

	}
	

}
