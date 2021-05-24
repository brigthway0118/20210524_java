package java09_inheritance;

//부모 클래스
class MyCar{
	static final String name="제네시스 g80";
}
class Tire extends MyCar{
	private String company;
	public Tire(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "타이어 회사 : " + company;
	}
}
class Mirror extends MyCar{
	private String mirror;
	public Mirror(String mirror) {
		this.mirror = mirror;
	}
	@Override
	public String toString() {
		return "백미러 회사 : " + mirror;
	}
}

//수리업체 클래스
class Repair{
	//부품을 바꿔주는 메소드
	//다형성을 이용
	void changePart(MyCar t) {
		//MyCar를 상속받는 클래스는 모두 이용가능하다.
		System.out.println(t + "교체 완료");
	}
//	void changePart(Mirror r) {
//		System.out.println(r + "교체 완료");
//	}
}
public class J20210504_02_Car {

	public static void main(String[] args) {
		System.out.println(MyCar.name);
		Tire t1 = new Tire("금호");
		System.out.println(t1);

		Mirror m1 = new Mirror("미러링");
		System.out.println(m1);
		
		Repair r1 = new Repair();
		r1.changePart(t1);
		r1.changePart(m1);
	}

}
