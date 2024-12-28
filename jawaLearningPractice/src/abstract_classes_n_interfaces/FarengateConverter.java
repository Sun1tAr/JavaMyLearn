package abstract_classes_n_interfaces;

public class FarengateConverter implements Converter {

	@Override
	public double getConvertedValue(double baseValue) {
		
		return baseValue * 1.8 + 32;
	}

}
