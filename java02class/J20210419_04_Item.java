package java02class;

//상품클래스(Item)
//필드
//itemcode(코드), itemname(이름), price(단가)

//메소드
//1)판매금액 계산 : 매개변수(판매수량), 리턴값(판매금액)

class Item{
	//private 접근제한자 : 클래스 내부에서만 접근가능
	private String itemCode;
	private String itemName;
	private int price;
	
	int sellPrice(int qty) {return price * qty;}
	
	//private의 경우 메소드를 이용해서 초기화
	//세터(setter)
	//this는 객체 자신한테 있는 필드에 접근
	void setItemcode(String itemcode) {	this.itemCode = itemcode;	}
	void setItemName(String itemName) {	this.itemName = itemName;	}
	void setPrice(int price) {	this.price = price;	}
	
	//private의 경우 메소드를 이용해서 접근
	//게터(getter)
	String getItemcode() {return itemCode;}
	String getitemName() {return itemName;}
	int getPrice() {return price;}

	
}

public class J20210419_04_Item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Item item = new Item();
//		item.itemCode = "8801";
//		item.itemName = "사이다";
//		System.out.println(item.itemName + " 판매금액:"+item.sellPrice(5));
//		Item item2 = new Item();
//		item2.itemCode = "8802";
//		item2.itemName = "콜라";
//		System.out.println(item2.itemName + " 판매금액:"+item2.sellPrice(10));

		Item item = new Item();
		item.setItemcode("8801");
		item.setItemName("사이다");
		item.setPrice(1000);
		System.out.println(item.getitemName() +
				"("+item.getItemcode()+
				","+item.getPrice()+
				")의 판매금액 : "+item.sellPrice(5));
		
		//System.out.printf("%,d\n",50000000);  50,000,000
		
		Item item2 = new Item();
		item2.setItemcode("8802");
		item2.setItemName("콜라");
		item2.setPrice(1100);
		System.out.println(item2.getitemName() +
				"("+item2.getItemcode()+
				","+item2.getPrice()+
				")의 판매금액 : "+item2.sellPrice(5));
	}

}
