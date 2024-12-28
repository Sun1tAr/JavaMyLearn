package jawaLearningPractice;

public class Main {

	public static void main(String[] args) {
	
		GenerateFunction newFunc = new GenerateFunction() {

			@Override
			public String functionToString() {
				// TODO Автоматически созданная заглушка метода
				return this.toString();
			}

			@Override
			public double getFunctionMeaning(double x) {
				// TODO Автоматически созданная заглушка метода
				return x * x * x;
			}

			@Override
			public double getFunctionMeaning(double x, double y) {
				// TODO Автоматически созданная заглушка метода
				return x * x + y * y;
			}
			
		};
		
		InterfaceTesting.printFunction(newFunc);
		

	}

}
