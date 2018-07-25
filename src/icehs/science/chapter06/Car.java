package icehs.science.chapter06;

public class Car {
	String name = "ICE 카";
	int oilAmount;
	double distance;
	
	void driveCar(String start, String end, double driveDistance)
	{
		
		distance += driveDistance;
		oilAmount -= (driveDistance/20);
		System.out.println(start +"에서"+ end +"까지" +driveDistance + "km주행하였습니다." );
	}
	
	void addoil(int oil)
	{
		oilAmount += oil;
		System.out.println("휘발류" +oil+ "L 주유됩니다.");
	}
	
	void calculateDrivingDistance()
	{
		System.out.println("주행 가능한 거리는 약"+ ((double)oilAmount *20)+"km입니다.");
	}
	
	void printCarInfo()
	{
		System.out.println("["+ name +"~] 남은 기름의 양" + oilAmount +"L, 총 주행거리 : " + distance + "km");
		
	}

}
