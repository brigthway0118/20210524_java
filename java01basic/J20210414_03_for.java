package java01basic;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 반목문(for)
//		for(int i=0 ; i<10; i++) {
//			System.out.println(i);
//		}

		// 1~10합 구하기
//		int sum = 0;
//		for(int i=0 ; i<=10; i++) {
//			sum += i;
//			System.out.println(sum);
//		}

		// 업다운 게임
		// 5번안에 숫자 맞추기
		// 1안
//		int co = (int)(Math.random()*100+1);
//		int an = 0;
//		for(int l=5;l>0;l--) {
//			System.out.print(l+")예상하는 숫자 입력 : ");
//			//an = sc.nextInt(); // 입력버퍼에 있는 인트값을 an에 반환하고 버퍼값이 없어진다.
//			if(!sc.hasNextInt()) {
//				sc.nextLine(); // 버퍼 비우기
//				l++;
//				continue;
//			}
//			an = sc.nextInt();
//			if(co>an) 
//				System.out.println("UP");
//			else if(an>co)
//				System.out.println("DOWN");
//			else if(an==co) {
//				System.out.println("Congratulation!!");
//				System.out.println("You win");
//				break;
//			}	
//			if(l==1) {
//				System.out.println("Cheer up...");
//				System.out.println("You lose");
//			}
//			
//		}

		// 2안
//		int co = (int)(Math.random()*100+1);
//		int an = 0;
//		int life = 7;
//		while(life>0) {
//			System.out.print(life+")예상하는 숫자 입력 : ");
//			if(!sc.hasNextInt()) {
//				sc.nextLine(); // 버퍼 비우기
//				continue;
//			}
//			an = sc.nextInt();
//			if(co>an) {
//				System.out.println("UP");
//				life--;
//			}
//			else if(an>co){
//				System.out.println("Down");
//				life--;
//			}
//			else if(an==co) {
//				System.out.println("Congratulation!!");
//				System.out.println("You win");
//				break;
//			}	
//			if(life==0) {
//				System.out.println("Cheer up...");
//				System.out.println("You lose");
//			}
//		}

		// 소금배달
//		int n = 1;
//		while (n != 0) {
//			System.out.print("소금 입력 : ");
//			n = sc.nextInt();
//			int poc3 = 0, poc5 = 0;
//			int div = 0;
//			if (n == 1 || n == 2) {
//				System.out.println("X");
//				continue;
//			}
//			
//			// 3,5의 최소공배수(15) 처리
//			if (n % 3 == 0 && n % 5 == 0) {
//				poc3 = Math.floorDiv(n, 3);
//				poc5 = Math.floorDiv(n, 5);
//				if (poc3 > poc5) {
//					poc3 = 0;
//				}
//			//8, 13...처리
//			} else if (n % 5 == 3) {
//				poc5 = Math.floorDiv(n, 5);
//				div = n - poc5 * 5;
//				if (div % 3 == 0) {
//					poc3 = Math.floorDiv(div, 3);
//				}
//			}
//			//5의 배수 처리
//			else if (n % 5 == 0) {
//				poc5 = Math.floorDiv(n, 5);
//			}
//			//16 21 26...처리
//			else if (n % 10 == 6 || n % 10 == 1) {
//				poc3 = 2;
//				div = n - poc3 * 3;
//				poc5 = Math.floorDiv(div, 5);
//			}
//			//7 17 22 27...처리
//			else if(n % 10 == 7 || n%10 == 2) {
//				poc3 = 4;
//				div = n - poc3 * 3;
//				poc5 = Math.floorDiv(div, 5);
//				if(poc5<0) {
//					System.out.println("X");
//					continue;
//				}
//			}
//			//3의 배수 처리
//			else if (n % 3 == 0) {
//				poc3 = Math.floorDiv(n, 3);
//			}
//			//19 29...처리
//			else if(n % 10 == 9) {
//				poc3 = 3;
//				div = n - poc3 * 3;
//				poc5 = Math.floorDiv(div, 5);
//			}
//			else {
//				System.out.println("X");
//				continue;
//			}
//
//			// ================================//
//			if (n != 0) {
//				System.out.println("3kg : " + poc3 + " 주머니");
//				System.out.println("5kg : " + poc5 + " 주머니");
//			}
//		}
//		System.out.println("종료");
		// 소금배달2
//		while (true) {
//			System.out.print("소금kg 입력 : ");
//			int i3 = 0, i5 = 0;
//			int s = sc.nextInt();
//
//			while (s > 0) {
//				if (s % 5 == 0) {
//					s -= 5;
//					i5++;
//				} else if (s % 3 == 0) {
//					s -= 3;
//					i3++;
//				} else {
//					s -= 5;
//					i5++;
//				}
//			}
//			if(s<0) {
//				System.out.println("-1");
//				continue;
//			}
//			System.out.println("3kg 주머니 " + i3);
//			System.out.println("5kg 주머니 " + i5);
//
//		}
		
//		int nKg, count5, count3, rest; // 소금kg , 5kg봉지 수, 3kg봉지 수, 나머지 계산 
//		System.out.print("배달해야할 설탕의 무게는? ");
//		nKg = sc.nextInt();
//		count5 = nKg / 5; // 만약 1kg라면 0.
//		while(true) {
//			rest = nKg - (5 * count5);
//			if(rest % 3 == 0) {
//				count3 = rest / 3;
//				System.out.printf("%d개(5kg) + %d개(3kg)",count5, count3);
//				break;
//			}
//			else {
//				if(count5 == 0) {
//					System.out.printf("%d\n",-1);
//					break;
//				}
//				count5 -= 1; //5kg 봉지수를 1 줄인다.
//			}
//		}

		// 소수구하기
//		int a = 1;
//		while (a != 0) {
//			boolean t = true;
//			System.out.print("숫자 입력 : ");
//			a = sc.nextInt();
//			if (a == 1)
//				System.out.println("소수X");
//			else {
//				for (int i = 2; i < a; i++) {
//					if (a % i == 0) {
//						t = false;
//						break;
//					}
//
//				}
//				if (t)
//					System.out.println("소수");
//				else
//					System.out.println("소수X");
//			}
//		}

		//// n까지의 소수구하기
//		int a1 = 9;
//		for (int j = 2; j <= a1; j++) {
//			boolean b = true; // 소수여부
//			for (int i = 2; i < j; i++) {
//				if (j % i == 0) {
//					// System.out.println(j + " " + "소수가 아닙니다.");
//					b = false;
//					break;
//				}
//
//			}
//			if (b) {
//				System.out.print(j + " ");
//			}
//		}

		
		
	}
}
