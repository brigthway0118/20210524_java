package java09_inheritance;

//동물
class Animal{

}
class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}
class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}
class AnimalCare {
	//먹이주기
	void eating(Animal a) {
		System.out.println(a+" 먹이주기 완료");
	}
	//목욕시키기
	void washing(Animal a) {
		System.out.println(a+" 목욕시키기 완료");
	}
}

public class J20210504_03_Animal {

	public static void main(String[] args) {
		//객체생성
		AnimalCare c1 = new AnimalCare();
		Rabbit r1 = new Rabbit();
		Lion l1 = new Lion();
		
		//메소드 실행
		c1.eating(r1);
		c1.eating(l1);
		c1.washing(r1);
		c1.washing(l1);
	}

}
