package icehs.science.chapter07;

public class Computer {
	String name;
	String osVer;
	int  production;
	int  sales;
	Computer(String name, String osVer, int production, int sales) {
		this.name = name;
		this.osVer = osVer;
		this.production = production;
		this.sales = sales;
	}
	Computer(String name, String osVer, int production){
		this.name = name;
		this.osVer = osVer;
		this.production = production;
	}
	void printComputerInfo() {
		System.out.println("=="+name+"("+osVer+")"+"==");
		System.out.println("생산 : "+production+"/"+"판매 : "+sales);
	}
}