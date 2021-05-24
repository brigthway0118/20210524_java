package java10_abstract;
//포켓몬 클래스
abstract class Pokemon{
	void gameName() {
		System.out.println("포켓몬게임");
	}
	abstract void attack();
	abstract void sound();
}


//피카츄 클래스
class Pikachu extends Pokemon{
	void attack() {
		System.out.println("전기공격");
	}
	void sound() {
		System.out.println("피카피카");
	}
}

//꼬부기
class Squirtle extends Pokemon{
	void attack() {
		System.out.println("물대포");
	}
	void sound() {
		System.out.println("꼬북꼬북");
	}
}
//행동클래스
class GamePlay{
	void attackPlay(Pokemon p) {
		p.gameName();
		p.attack();
	}
	void soundPlay(Pokemon p) {
		p.sound();
	}
}

public class J20210504_02_Pokemon {

	public static void main(String[] args) {
		GamePlay gp = new GamePlay();
		gp.attackPlay(new Pikachu());
		gp.attackPlay(new Squirtle());
		
		gp.soundPlay(new Pikachu());
		gp.soundPlay(new Squirtle());

	}

}
