package java10_abstract;

//부모클래스
//추상메소드를 한 개라도 가지고 있으면 추상클래스로 만든다.
//추상클래스는 형체가 없어서 객체를 만들수 없다.
abstract class Education{
	static String name = "교육청";
	
	//구현부가 없는 추상메소드
	//자식이 반드시 구현부를 작성-> 반드시 오버라이딩을 해야한다.
	abstract void schoolName();
}

//초등학교
class Elementary extends Education{
	void schoolName() {
		System.out.println("국제 초등학교");
	}
}

//중학교
class Middel extends Education{
	void schoolName() {
		System.out.println("국제 중학교");
	}
}

//고등학교
class High extends Education{
	void schoolName() {
		System.out.println("국제 고등학교");
	}
}

class EduInfo{
	//출신학교 출력
	void schoolName(Education e) {
//		//다운캐스팅
//		if(e instanceof High) // e가 High에 속해있다면..
//			((High)e).schoolName();
//		else if(e instanceof Middel)
//			((Middel)e).schoolName();
//		else if(e instanceof Elementary)
//			((Elementary)e).schoolName();
		
		//다형성을 이용한 출력
		//실제로 출력은 자식클래스의 메소드를 실행
		e.schoolName();  
	}
}
public class J20210504_01_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EduInfo ei = new EduInfo();
		Education h = new High();
		Education m = new Middel();
		Education e = new Elementary();
		ei.schoolName(h);
		ei.schoolName(m);
		ei.schoolName(e);

	}

}
