package quantity_measurement;

public class QuantityMeasurements {

	public double getConvertedUnit(double value, Unit unitType) {
		return value * unitType.unitVal;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
