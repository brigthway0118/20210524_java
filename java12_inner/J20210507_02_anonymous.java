package java12_inner;

class Dog{
	void walking() {
		System.out.println("걷는다");
	}
}

//class HurtDog extends Dog{
//	@Override
//	void walking() {
//		System.out.println("걷지 못한다");
//	}
//}
public class J20210507_02_anonymous {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HurtDog hd = new HurtDog();
//		hd.walking();
		
		//익명클래스 : 부모 클래스로 재정의해서 생성
		//1회성으로 사용하려고 할 때.
		Dog hdog = new Dog() {
			@Override
			void walking() {
				System.out.println("걷지 못한다");
			}
			//부모 클래스에 eating이 없기 때문에 실행불가. Override만 실행이 가능하다.
//			void eating() {
//				System.out.println("먹는다");
//			}
		};
		hdog.walking();
	}

}
