package java12_inner;
interface Item{
	void namePrint(String itemname);
}

class ImpItem implements Item{
	@Override
	public void namePrint(String itemname) {
		System.out.println(itemname);
	}
}

public class J20210507_04_item {
	public static void main(String[] args) {
		ImpItem item = new ImpItem();
		item.namePrint("새우깡");
		
		//item 인터페이스를 상속받는 객체 생성
		//new 인터페이스명(){ }; : 인터페이스를 상속받는 무명클래스 생성
		//new 클래스명(){ }; : 클래스를 상속받는 무명클래스 생성
		Item i = new Item() {
			@Override
			public void namePrint(String itemname) {
				System.out.println(itemname);
				
			}
		};
		
		i.namePrint("감자깡");
		i.namePrint("고구마깡");
	}

}
