package java08JDBC;

import java.util.Scanner;

public class J20210427_06_Member_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		System.out.println("===================================");
		System.out.println("1. 회원추가");
		System.out.println("2. 회원수정");
		System.out.println("3. 회원삭제");
		System.out.println("4. 회원조회");
		System.out.println("5. 전체회원조회");
		System.out.println("===================================");
		System.out.print("메뉴 번호 입력 : ");
		menu = sc.nextInt(); 
		switch (menu) {
			case 1:
				J20210427_06_Member_3_Insert i = new J20210427_06_Member_3_Insert();
				i.insert();
				break;
			case 2:
				J20210427_06_Member_4_Update u = new J20210427_06_Member_4_Update();
				u.update();
				break;
			case 3:
				J20210427_06_Member_5_Delete d = new J20210427_06_Member_5_Delete();
				d.delete();
				break;
			case 4:
				J20210427_06_Member_2_One one = new J20210427_06_Member_2_One();
				one.getMemberOne();
				break;
			case 5:
				J20210427_06_Member_1_All all = new J20210427_06_Member_1_All();
				all.getAllMember();
				break;
			default:
				break;
		}

	}

}
