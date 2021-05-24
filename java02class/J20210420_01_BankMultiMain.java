package java02class;

import java.util.Scanner;

public class J20210420_01_BankMultiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 컨트롤 쉬프트 5 자동 임포트

		// 다수의 계좌 이용
		int menu, value, index = 0;
		Bank[] banks = new Bank[3];
		while (true) {
			System.out.println("===============================");
			System.out.println("======="+index+"번 고객님======");
			System.out.println("===============================");
			System.out.println("0. 로 그 인");
			System.out.println("1. 계좌개설");
			System.out.println("2. 계좌정보");
			System.out.println("3. 입    금");
			System.out.println("4. 출    금");
			System.out.println("5. 잔액조회");
			System.out.println("9. 종    료");
			System.out.println("===============================");
			System.out.print("메뉴 입력 : ");
			menu = sc.nextInt();
			sc.nextLine();// 버퍼비우기
			switch (menu) {
			case 0:
				System.out.print("고객번호 입력 : ");
				index = sc.nextInt();
				break;
			case 1:
				if (index == 0) {
					System.out.println("고객 번호 먼저 입력해주세요");
					break;
				}
				System.out.print("은행 입력 : ");
				String name1 = sc.nextLine();
				System.out.print("계좌번호 입력 : ");
				String name2 = sc.nextLine();
				banks[index - 1] = new Bank(name1, name2);
				break;
			case 3:
				if (banks[index - 1] == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println("======= 입 금 =======");
				System.out.print("입금액 : ");
				value = sc.nextInt();
				banks[index - 1].inputBalance(value);
				break;
			case 4:
				if (banks[index - 1] == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println("======= 출 금 =======");
				System.out.print("출금액 : ");
				value = sc.nextInt();
				banks[index - 1].outputBalance(value);
				break;
			case 5:
				if (banks[index - 1] == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println("=======잔액 조회=======");
				System.out.println("잔액 : " + banks[index - 1].getBalance());
				break;
			case 2:
				if (banks[index - 1] == null) {
					System.out.println("계좌를 먼저 개설 해주세요.");
					break;
				}
				System.out.println(banks[index - 1]);
				break;
			case 9:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
