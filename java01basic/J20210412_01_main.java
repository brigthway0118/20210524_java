package java01basic;

//파일이름과 public class의 이림은 같아야 한다!!
public class J20210412_01_main {	//클래스의 이름
	
	//메인 메소드 : 진입점 메소드
	public static void main(String[] args) {
		
		System.out.print("헬로우 자바"); // 개행X
		//자동완성 = 컨트롤 + 스페이스바
		//자동정렬 = 컨트롤 + 쉬프트 + F
		//자동Import = 컨트롤 + 쉬프트 + o
		System.out.println("나의 나이는 "+13+"입니다"); // 개행O
		
		//10 + 20 = 30
		
		System.out.println(10+"+"+20+"="+(10+20));
		
		System.out.printf("%d + %d = %d\n",10,20,10+20);//포맷문자열사용
	}
}
