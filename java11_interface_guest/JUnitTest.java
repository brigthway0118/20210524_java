package java11_interface_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void testInsert() {
		GuestDAO gdao = new GuestDAOImp();
		GuestDTO gdto = new GuestDTO("홍길동3", "hong3@mail.net","3333","가입인사3");
		int cnt = gdao.insert(gdto);
		System.out.println(cnt + "건 추가");
	}

	@Test
	void testUpdate() {
		//수정테스트
		GuestDAO gdao = new GuestDAOImp();
		GuestDTO gdto = new GuestDTO(4, "홍길동4","hong4@mail.net","1234","가입인사4");
		int cnt = gdao.update(gdto);
		System.out.println(cnt + "건 수정");
	}

	@Test
	void testDelete() {
		//삭제테스트
		GuestDAO gdao = new GuestDAOImp();
		int cnt = gdao.delete(1);
		System.out.println(cnt + "건 삭제");
	}

	@Test
	void testSelectOne() {
		//한건조회
		GuestDAO gdao = new GuestDAOImp();
		GuestDTO gdto = gdao.selectOne(3);
		System.out.println(gdto);
	}

	@Test
	void testSelectList() {
		//전체조회
		GuestDAO gdao = new GuestDAOImp();
		List<GuestDTO> glist = gdao.selectList();
		System.out.println(glist);
	}

}
