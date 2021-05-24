package java12_inner;

//인터페이스 객체생성 안됨
interface School{
	void namePrint();
}

public class J20210507_03_interface_anonymous {

	public static void main(String[] args) {
		
		//익명클래스 생성
		//School인터페이스를 상속받은 객체 생성
		School high = new School() {
			@Override
			public void namePrint() {
				System.out.println("국제고등학교");
				
			}
		};
		high.namePrint();
	}

}
