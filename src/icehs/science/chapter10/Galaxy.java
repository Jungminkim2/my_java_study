package icehs.science.chapter10;

public class Galaxy extends Mobile {
	private String osVersion;

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
		System.out.println(this.getProduction() +": " +this.osVersion);
	}
	
	public void charge(int time) {
		System.out.println(this.getProduction() +": 보조베터리 "+time +"분 충전");
	}

}
