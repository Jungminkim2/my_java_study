package icehs.science.chapter06;

public class Building {
	String name; //건물명
	String address; //주소
	int totalFloor; //전체 층 수
public void moneElevator()
{
	System.out.println("엘리베이터를 운행합니다."+ totalFloor +"층까지 운영합니다.");
}
public void changeAddress(String newAddress) 
{
	address = newAddress;
}

}
