package java11_interface_guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J20210506_main {

	public static void main(String[] args) {
		// 1. 방명록 작성
		// 2. 방명록 수정
		// 3. 방명록 삭제
		// 4. 방명록 조회
		// 9. 종료
		int cnt = 0;
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		GuestDAO gdao = new GuestDAOImp();
		GuestDTO gdto = null;

		while (true) {
			System.out.println("===============================");
			System.out.println("1. 방명록 작성");
			System.out.println("2. 방명록 수정");
			System.out.println("3. 방명록 삭제");
			System.out.println("4. 방명록 한 건 조회");
			System.out.println("5. 방명록 전체 조회");
			System.out.println("9. 종료");
			System.out.println("===============================");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				gdto = new GuestDTO("홍길동3", "hong3@mail.net", "3333", "가입인사3");
				cnt = gdao.insert(gdto);
				System.out.println(cnt + "건 추가");
				break;
			case 2:
				gdto = new GuestDTO(4, "홍길동4", "hong4@mail.net", "1234", "가입인사4");
				cnt = gdao.update(gdto);
				System.out.println(cnt + "건 수정");
				break;
			case 3:
				cnt = gdao.delete(8);
				System.out.println(cnt + "건 삭제");
				break;
			case 4:
				gdto = gdao.selectOne(3);
				System.out.println(gdto);
				break;
			case 5:
				List<GuestDTO> list = new ArrayList<>();
				list = gdao.selectList();
				for (GuestDTO a : list) {
					System.out.println(a);
				}
				break;
			case 9:
				DBConn.dbClose();
				System.out.println("종료합니다.");
				System.exit(1);
			}
		}
	}
}
