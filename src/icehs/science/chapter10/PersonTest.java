package icehs.science.chapter10;

public class PersonTest {

	public static void main(String[] args) {
		Person[] pArr = {new Person(), new Student() ,new Teacher()};
		
		for(int i=0; i < pArr.length ; i++) {
			pArr[i].eat();
			
			if(pArr[i] instanceof Student) {
				((Student)pArr[i]).study();
			}else if(pArr[i] instanceof Teacher) {
				((Teacher)pArr[i]).teach();
			}
			pArr[i].sleep();
		}
	}

}
