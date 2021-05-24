package java05Generics;

//일반멤버클래스
//필드 : 아이디, 패스워드
class Member{
	private String id;
	private String pw;
	
	public Member() {};
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}
	

}
//vip회원
//필드 : 아이디, 비밀번호, 할인률()
class Vip{
	private String id;
	private String pw;
	private double rate;

	public Vip() {};
	public Vip(String id, String pw, double rate) {
		super();
		this.id = id;
		this.pw = pw;
		this.rate = rate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String vipID) {
		this.id = vipID;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String vipPW) {
		this.pw = vipPW;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Vip [vipID=" + id + ", vipPW=" + pw + ", rate=" + rate + "]";
	}

}

//로그인 관리 클래스
class LoginManager<T>{
	void loginMember(T member){
		System.out.println(member);
	}
	void loginVIP(T vip){
		System.out.println(vip);
	}
	
	void login(T member) {
		if(member instanceof Member) {
			System.out.println(((Member) member).getId() + "님 로그인");
		}else if(member instanceof Vip) {
			System.out.println(((Vip) member).getId() + "님 로그인");
		}
	}
}


public class J20210422_02_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("java", "1111");
		//System.out.println(member);
		
		Vip vip = new Vip("hong", "2222", 0.1);
		//System.out.println(vip);
		
		//Generic을 이용한 멤버로그인
		LoginManager<Member> m1 = new LoginManager<>();
		LoginManager<Vip> m2 = new LoginManager<>();
		
		//m1.loginMember(member);
		m1.login(member);
		//m.loginVIP(vip);
		
		//Generic을 이용한 vip로그인
		LoginManager<Vip> v = new LoginManager<>();
		//m2.loginMember(vip);
		m2.login(vip);

	}

}
