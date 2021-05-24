package java02class;

//회원클래스
//필드
//아이디(String), 비밀번호(String), 출생년도(int), 키(double)
class Member{
	private String id;
	private String pw;
	private int birth;
	private double height;
	
	//생성자 : 객체가 생성될 때 실행되는 메소드
	//기본생성자 -> 따로 생성자를 생성하지 않았을때 자바 컴파일러가 자동으로 생성한다. Member(){};
	//생성자가 있다면 컴파일러가 기본생성자를 따로 생성하지않는다.
	Member(){};
	
	
	//반드시 객체가 생성될 때 생성자가 실행이 되어야 한다.
	//클래스의 이름과 같다, 반환형이 없다
	//생성자의 오버로딩. 매개변수가 다르면 다수를 만들 수 있다.
	Member(String id, String pw, int birth, double height){
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.height = height;
	}
	
	
	
	
	//setter
	void setId(String id)	{	this.id = id;	}
	void setPw(String pw)	{	this.pw = pw;	}
	void setBirth(int birth)	{	this.birth = birth;	}
	void setHeight(double height)	{	this.height = height;	}
	
	
	//getter
	String getId()	{	return id;	}
	String getPw()	{
		//비밀번호는 앞 두자리만 반환
		return pw.substring(0,2)+"**";	}
	int getBirth()	{	return birth;	}
	double getHeight()	{	return height;	};
}
public class J20210419_05_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member();
		m1.setId("java");
		m1.setPw("1111");
		m1.setBirth(1990);
		m1.setHeight(167.8);		
		System.out.println("아이디 : " + m1.getId());
		System.out.println("비밀번호 : " + m1.getPw());
		
		//System.out.println("0123456".substring(3));//3456
		//System.out.println("0123456".substring(0,5));//01234
		
		Member m2 = new Member("hong", "2222", 1985, 168.8);
		System.out.println("아이디 : " + m2.getId());
		System.out.println("비밀번호 : " + m2.getPw());
	}

}
