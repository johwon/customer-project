package customer.map;

public class NumSelectException extends Exception{

	private int num;
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public void numSelectException(int i) {
			System.out.println("1000~9999까지의 숫자만 입력 가능합니다.");
	}
}
