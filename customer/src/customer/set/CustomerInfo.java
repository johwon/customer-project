package customer.set;

import java.util.Objects;

public class CustomerInfo implements Comparable<CustomerInfo>{
	private String name;
	private int num;
	
	public CustomerInfo(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "고객이름=" + name + ", 고객번호=" + num ;
	}
	@Override
	public int hashCode() {
		return Objects.hashCode(num);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CustomerInfo)) {
			return false;
		}
		CustomerInfo ci = (CustomerInfo)obj;
		if(num==ci.num) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(CustomerInfo o) {
		return num - o.num;
	}
	
}
