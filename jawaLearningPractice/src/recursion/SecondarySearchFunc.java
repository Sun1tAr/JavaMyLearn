package recursion;

public class SecondarySearchFunc  {

	public static double secondarySearchMathFunc(double left, double right, double e, double y, FuncInterface func) {
		e = Math.abs(e);
		double x0 = (left + right)/2;
		double y0 = func.func(x0);
		double e0 = Math.abs(func.func(right) - func.func(left))/2;
		//System.out.println("Log = " + e0);
		if (e0 <= e) return x0;
		else {
			if (func.func(left) < func.func(right)) {
				
				if (y > y0) left = x0;
				else right = x0;
				
				return secondarySearchMathFunc(left, right, e, y, func);
				
			} else if (func.func(left) > func.func(right)) {
				
				if (y < y0) left = x0;
				else right = x0;
				
				return secondarySearchMathFunc(left, right, e, y, func);
				
			} else return x0;
		}
	}

	
	
}
