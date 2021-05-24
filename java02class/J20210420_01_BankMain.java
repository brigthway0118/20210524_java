package java02class;

import java.util.Scanner;

public class J20210420_01_BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 컨트롤 쉬프트 5 자동 임포트
		
		//하나의 계좌 이용
		int menu, value;
		Bank b1 = null;
		while (true) {

			System.out.println("===============================");
			System.out.println("1. 계좌개설");
			System.out.println("2. 계좌정보");
			System.out.println("3. 입    금");
			System.out.println("4. 출    금");
			System.out.println("5. 잔액조회");
			System.out.println("0. 종    료");
			System.out.println("===============================");
			System.out.print("메뉴 입력 : ");
			menu = sc.nextInt();
			sc.nextLine();//버퍼비우기
			switch (menu) {
			case 1:
				System.out.print("은행 입력 : ");
				String name1 = sc.nextLine();
				System.out.print("계좌번호 입력 : ");
				String name2 = sc.nextLine();
				b1 = new Bank(name1, name2);
				break;
			case 3:
				if(b1 == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println("======= 입 금 =======");
				System.out.print("입금액 : ");
				value = sc.nextInt();
				b1.inputBalance(value);
				break;
			case 4:
				if(b1 == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println("======= 출 금 =======");
				System.out.print("출금액 : ");
				value = sc.nextInt();
				b1.outputBalance(value);
				break;
			case 5:
				if(b1 == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println("=======잔액 조회=======");
				System.out.println("잔액 : " + b1.getBalance());
				break;
			case 2:
				if(b1 == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println(b1);
				break;
			case 0:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				break;
			}
		}

//		Bank b1 = new Bank("국제은행", "1234-5678");
//		b1.setBankNo("01234-56789");
//		System.out.println("은행명 : " + b1.getBankName());
//		System.out.println("계좌번호 : " + b1.getBankNo());
//		System.out.println("잔액 : " + b1.getBalance());
//		System.out.println(b1);// ==System.out.println(b1.toString());
//
//		Bank b2 = new Bank("국제은행", "999-999-99", 100000);
//		b2.setBankName("디딤돌저축");
//		System.out.println("은행명 : " + b2.getBankName());
//		System.out.println("계좌번호 : " + b2.getBankNo());
//		System.out.println("잔액 : " + b2.getBalance());
//		b2.inputBalance(10000);
//		System.out.println("잔액 : " + b2.getBalance());
//		b2.outputBalance(30000);
//		System.out.println("잔액 : " + b2.getBalance());

	}

}
