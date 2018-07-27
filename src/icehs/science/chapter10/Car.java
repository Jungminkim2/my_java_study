package icehs.science.chapter10;

public class Car implements Washer {
	private int oilSize;
	
	public void go(int distance) {
		System.out.println(distance +"km이동합니다.");
		System.out.println("연료 : " +oilSize);
		
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	

}
