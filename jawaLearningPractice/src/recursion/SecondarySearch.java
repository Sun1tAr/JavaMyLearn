package recursion;

public class SecondarySearch {

	public static double func(double x) {
		return (Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) + - 345.3 * x - 23);
	}
	
	public static double secondarySearchMath(double a, double b, double e, double y) {
		e = Math.abs(e);
		double x0 = (a + b)/2;
		double y0 = func(x0);
		double e0 = Math.abs(func(b) - func(a))/2;
		//System.out.println("Log = " + e0);
		if (e0 <= e) return x0;
		else {
			if (func(a) < func(b)) {
				
				if (y > y0) a = x0;
				else b = x0;
				
				return secondarySearchMath(a, b, e, y);
				
			} else if (func(a) > func(b)) {
				
				if (y < y0) a = x0;
				else b = x0;
				
				return secondarySearchMath(a, b, e, y);
				
			} else return x0;
		}
	}
}
