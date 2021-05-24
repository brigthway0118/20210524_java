package java02class;

import java.util.Arrays;

//책 클래스
//필드 : 책코드(String), 책명(String), 단가(int), 할인율(double)
//생성자, 게터,세터, toString
//메소드 : 판매금액계산(매개변수:수량, 반환금:판매금액)
class Book {
	private String bookCode;
	private String bookName;
	private int price;
	private double discount;

	Book() {
	};

	Book(String bookCode, String bookName, int price, double discount) {
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.price = price;
		this.discount = discount;

		// System.out.println(sale_price(10)+"원");
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setdiscount(double discount) {
		this.discount = discount;
	}

	public double getdiscount() {
		return discount;
	}

	int sale_price(int p) {
		return (int) (price * (1 - discount) * p);
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookName=" + bookName + ", price=" + price + ", discount=" + discount
				+ "]";
	}

}

class Manager {
	//판매금액 합계를 저장하는 배열
	//b001:0인덱스, b002:1인덱스, 
	int[] tot = new int[10];
	int[] getTot() {
		return tot;
	}
	
	
	int saleCal(Book book, int qty, int index) {
		//System.out.println(book);
		//System.out.println(qty);
		String bookcode = book.getBookCode();
		int price = book.getPrice();
		double dis = book.getdiscount();
		int totPrice = (int)(price*(1-dis)*qty);
		
		tot[index]+=totPrice; //합계누적

			
		
		
		return totPrice;
	}

}

public class J20210421_01_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] barr = new Book[10];
		barr[0] = new Book();
		
		Book b1 = new Book("a001", "스", 10000, 0.5);
		barr[0].setBookCode("b001");
		barr[0].setBookName("자바프로그래밍");
		barr[0].setPrice(30000);
		barr[0].setdiscount(0.2);
		//System.out.println(b1);
		//System.out.println("판매금액 : " + b1.sale_price(3));
		//System.out.println("판매금액 : " + b1.sale_price(5));

		Manager m = new Manager();
		System.out.println(barr[0].getBookCode() +" "+ barr[0].getBookName()+"판매금액 : "+m.saleCal(barr[0], 1, 0));
		System.out.println(barr[0].getBookCode() +" "+ barr[0].getBookName()+"판매금액 : "+m.saleCal(barr[0], 2, 0));
		
		//Book b2 = new Book("b002","파이썬100제",18000,0.15);
		barr[1] = new Book("b002","파이썬100제",18000,0.15);
		System.out.println(barr[1].getBookCode() +" "+ barr[1].getBookName()+"판매금액 : "+m.saleCal(barr[1], 1, 1));
		

		System.out.println("----------------------------------------------");
		System.out.println(Arrays.toString(m.getTot()));
		
	}

}
