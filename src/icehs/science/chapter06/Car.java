package icehs.science.chapter06;

public class Car {
	public String name = "ICE ī";
	int oilAmount;
	double distance;
	
	void driveCar(String start, String end, double driveDistance)
	{
		
		distance += driveDistance;
		oilAmount -= (driveDistance/20);
		System.out.println(start +"����"+ end +"����" +driveDistance + "km�����Ͽ����ϴ�." );
	}
	
	void addoil(int oil)
	{
		oilAmount += oil;
		System.out.println("�ֹ߷�" +oil+ "L �����˴ϴ�.");
	}
	
	void calculateDrivingDistance()
	{
		System.out.println("���� ������ �Ÿ��� ��"+ ((double)oilAmount *20)+"km�Դϴ�.");
	}
	
	void printCarInfo()
	{
		System.out.println("["+ name +"~] ���� �⸧�� ��" + oilAmount +"L, �� ����Ÿ� : " + distance + "km");
		
	}

}
