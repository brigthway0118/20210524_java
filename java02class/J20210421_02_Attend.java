package java02class;

import java.util.Date;

//수강생 클래스
//필드:코드,이름,수강과목
class Attendee{
	private String code;
	private String name;
	private String sujectName;
	public Attendee(String code, String name, String sujectName) {
		this.code = code;
		this.name = name;
		this.sujectName = sujectName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSujectName() {
		return sujectName;
	}
	public void setSujectName(String sujectName) {
		this.sujectName = sujectName;
	}
	@Override
	public String toString() {
		return "Attendee [code=" + code + ", name=" + name + ", sujectName=" + sujectName + "]";
	}
	
	
	
	
}

//수강 클래스
//메소드 : 입실출력, 퇴실출력
class LectureManager{
	static String collegeName = "국제학원";//static변수 = 클래스필드 = 클래스 생성 시에 생성
	//static 변수는 클래스가 메모리에 로딩될 때 생성된다. 프로그램 종료 시 소멸
	
	
	static final int buildYear = 2001; // 인스턴스변수 = 인스턴스필드 = 객체(인스턴스) 생성 시에 생성
	//int a = 1;
	//static final : 상수. 반드시 선언과 동시에 초기화.
	static final Date day;
	static { // static블럭을 이용한 변수를 초기화
		//장점 스태틱에 데이터 입력가능. ex) DB 혹은 파일에서 데이터 가져올수 있다.
		int a = 21;
		Date now = new Date();
		day=now;
	}
	//static final Date day;
	//static int day;
	void enter(Attendee att) {// 지역변수. 함수 호출 시 생성. 함수 종료 시 소멸
		System.out.println(day+"일 " + att.getSujectName()+"반 "+att.getName()+"님 입실");
	}
	
	void exit(Attendee att) {
		System.out.println(att.getSujectName()+"반 "+att.getName()+"님 퇴실");
	}
	
}
public class J20210421_02_Attend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LectureManager.collegeName); //static 변수의 경우 클래스이름.변수로 사용가능.
		Attendee att1 = new Attendee("A001", "홍길동", "자바");
		System.out.println(att1);
		
		LectureManager ma = new LectureManager();
		System.out.println(ma.collegeName);
		System.out.println(ma.buildYear);
		ma.enter(att1);
		ma.exit(att1);

	}

}
