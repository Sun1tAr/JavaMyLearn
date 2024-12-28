package javaLearning;

import javaLearning.dataBase.DataBase;

public class Main {

	public static void main(String[] args) {
	
		
		Guns bow = new Guns(762545, "Рисовая вселенная", 9, "Луковка", true);
		bow.material.setMaterial(false, true);
		Guns.printValues(bow);
		
		bow.material.getMaterial();
		
		//--------------------------------------------------
		
		
		
		Guns feather = new Guns(23695, "Рисовая вселенная - 0.5", 6, "Перышко под ребрышко", false) {
			
			@Override
			public void moveObject(String name) {
				super.moveObject(name);
				System.out.println("Даже перышко стреляет раз в год");
			}
			
		};
		feather.moveObject(feather.getName());
		
		
		//--------------------------------------------------
		
		Dishes cup = new Dishes(123546, "Хироманы", -5, "Каменная кружка", false);
		cup.material.setMaterial(true, true);
		Dishes.printValues(cup);
		cup.material.getMaterial();
		
		//--------------------------------------------------
		
		DataBase db = new DataBase();
		
		//--------------------------------------------------
		
		//--------------------------------------------------
		
	}
}
