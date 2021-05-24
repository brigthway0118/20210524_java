package java11_interface;

import java.util.Scanner;

interface Call{
	void call();
}

interface Photo{
	void photo();
}

interface Memo{
	void memo();
}

//전화, 사진찍기
class Phone implements Call, Photo{
	@Override
	public void photo() {
		System.out.println("Phone Photo");
	}
	@Override
	public void call() {
		System.out.println("Phone Call");
	}
}

//전화, 사진찍기, 메모
class NewPhone implements Call, Photo, Memo{
	@Override
	public void memo() {
		System.out.println("NewPhone Memo");
	}
	@Override
	public void photo() {
		System.out.println("NewPhone Photo");
	}
	@Override
	public void call() {
		System.out.println("NewPhone Call");
	}
}

//폰 사용
class PhoneUse{
	void call(Call c) {
		c.call();
	}
	void photo(Photo p) {
		p.photo();
	}
	void memo(Memo m) {
		m.memo();
	}
}

public class J20210504_03_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PhoneUse pu = new PhoneUse();
		NewPhone np = null;
		Phone p = null;
		int sel =0;
		
//		pu.Call(p);
//		pu.Photo(p);
//		System.out.println("=================================");
//		pu.Call(np);
//		pu.Photo(np);
//		pu.Memo(np);
		
		System.out.println("=================================");
		while(sel != 1 && sel !=2) {
			System.out.println("1. Phone");
			System.out.println("2. NewPhone");
			System.out.print("기종 선택 : ");
			sel = sc.nextInt();
		}
		
		if(sel == 1) {
			p = new Phone();
		}else {
			np = new NewPhone();
		}
		
		int menu=0;
		
		while (menu != 9) {
			System.out.println("=================================");
			System.out.println("1.전화");
			System.out.println("2.사진");
			System.out.println("3.메모");
			System.out.println("9.종료");
			System.out.println("=================================");
			System.out.print("메뉴 입력 : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				if(sel==1) {
					pu.call(p);
				}else {
					pu.call(np);
				}
				break;
			case 2:
				if(sel==1) {
					pu.photo(p);
				}else {
					pu.photo(np);
				}
				break;
			case 3:
				if(sel==1) {
					System.out.println("메모 기능이 없는 기종입니다");
				}else {
					pu.memo(np);
				}
				break;
			default:
				break;
			}
		}
		System.out.println("Phone 종료");
	}

}
