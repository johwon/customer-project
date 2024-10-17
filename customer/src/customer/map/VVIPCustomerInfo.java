package customer.map;

import java.util.Objects;

public class VVIPCustomerInfo extends CustomerInfo {
	private int point;

	public VVIPCustomerInfo(String name, int num, int point) {
		super(name, num);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return super.toString()+", 포인트=" + point;
	}
	
}
