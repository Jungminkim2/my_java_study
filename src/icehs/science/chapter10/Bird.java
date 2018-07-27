package icehs.science.chapter10;

public class Bird extends Animal implements Flyable{
	private String habitat;
	public Bird(String kind, int age, String habitat) {
		super(age, kind);
		this.habitat = habitat;
	}
	public Bird(int age, String kind, String habitat){
		super(age, kind);
		this.habitat = habitat;
	}
	@Override
	public void fly() {
		System.out.println("날아간다");
		
	}
	@Override
	public void spreadwings() {
		System.out.println("날개를 펼친다.");
		
	}
	
}
