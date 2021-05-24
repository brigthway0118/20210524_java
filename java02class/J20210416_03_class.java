package java02class;

//클래스
//객체를 만들어내기 위한 틀.
class Dog{
	//속성:필드
	//필드는 자동초기화
	String type="강아지";
	String name="볼보이";
	int legs = 4;
	int cnt; // 걸음수

	//기능:메소드
	void walking() {
		cnt++;
		System.out.println(name+" 걷는다");
	}
	void eating() { // eating(int a)일경우 int a도 매개변수=지역변수
		String food="사료"; //함수 안에서 만들어졌으므로 지역변수.
		System.out.println(food+" 먹는다");
	}
}



//java 하나의 파일에 public클래스는 하나여야한다!
public class J20210416_03_class {
	public static void main(String[] args) {
		Dog d1 = new Dog(); // Dog클래스 d1객체 생성
		System.out.println(d1.type);
		System.out.println(d1.legs);
		d1.walking();
		System.out.println(d1.cnt);//1
		d1.eating();//
		//cnt가 자동초기화가 이루어진 이유
		//필드는 지역변수와 다르게 자동 초기화가 된다.

	}
}
