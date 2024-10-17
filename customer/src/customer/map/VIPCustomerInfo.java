package customer.map;

import java.util.Objects;

public class VIPCustomerInfo extends CustomerInfo {
	private int mileage;

	public VIPCustomerInfo(String name, int num, int mileage) {
		super(name, num);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString()+", 마일리지=" + mileage;
	}

	
}
