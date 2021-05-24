package java09_inheritance;

//부모클래스
class Person{
//	private String name;
//	void setName(String name) {
//		this.name = name;
//	}
	protected String name;
	
	void breath() {
		System.out.println(name + "숨쉬기");
	}
	void eat() {
		System.out.println(name + "먹기");
	}
}

//자식클래스
class Students extends Person{
	private String name="학생";
	Students(){
//		super.setName(name);
		super.name = this.name;
	}
	void learn() {
		System.out.println(name+" 배우기");
	}
}
//자식클래스
class Teachers extends Person{
	private String name="선생";
	Teachers(){
//		super.setName(name);
		super.name = this.name;
	}
	void teach() {
		System.out.println(name + " 가르치기");
	}
}

public class J20210503_01_inheritance {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.breath();
		s1.eat();
		s1.learn();
		
		Teachers t1 = new Teachers();
		t1.breath();
		t1.eat();
		t1.teach();
	}

}
