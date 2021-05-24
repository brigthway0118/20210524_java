package java11_interface;
//클래스는 다중상속 불가
//인터페이스: 구현부가 없다, 다중상속가능, 객체생성불가

interface Attack{
	String name = "포켓몬 공격";// public static final 이 앞쪽에 생략되어있다.
	void attack(); // public abstract 생략가능
	
	default void gameTime() { //default : 인터페이스에서 일반메소드처럼 기능하게한다.
		System.out.println("24시간 공격 가능");
	}
}

interface Sound{
	String name = "포켓몬 소리";
	abstract void sound();
}

//피카츄
class Pikachu implements Attack, Sound{
	@Override
	public void attack() {
		System.out.println("전기공격");
	}
	@Override
	public void sound() {
		System.out.println("피카피카");
	}
}

//꼬부기

class Squirtle implements Attack, Sound{
	@Override
	public void attack() {
		System.out.println("물 공격");
	}
	public void sound() {
		System.out.println("꼬북꼬북");
	}
}

//게임
class GamePlay{
	void attack(Attack attack) {
		attack.attack();
	}
	void sound(Sound sound) {
		sound.sound();
	}
}

public class J20210504_01_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Attack.name);
		Pikachu pika = new Pikachu();
		Attack attack = new Pikachu();
		Sound sound = new Pikachu();
		GamePlay gp = new GamePlay();
		
		pika.attack();
		attack.attack();
		sound.sound();
		gp.attack(pika);
	}

}
