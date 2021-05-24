package java09_inheritance;
//부모클래스
//final class Bird : final클래스는 상속 불가.
class Bird{
	private String name;

	void born() {
		System.out.println("알을 낳는다");
	}
	//final void fly() : final 메소드는 오버라이딩 불가
	void fly() {
		System.out.println("날 수 있다.");
	}
}

//참새
class Sparrow extends Bird{


	private String name = "참새";
	
	
}

//타조
class Ostrich extends Bird{
	private String name = "타조";
	//오버라이딩 : 부모클래스의 메소드를 다시 정의
	@Override
	void fly() {
		System.out.println(name+" 날 수 없다.");
	}
}
public class J20210503_03_Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sparrow s1 = new Sparrow();
		s1.born();
		s1.fly();
		System.out.println("====================================");
		Ostrich o1 = new Ostrich();
		o1.born();
		o1.fly();
		
	}

}
