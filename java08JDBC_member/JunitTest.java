package java08JDBC_member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {
	MemberDAO mdao = new MemberDAO();
	
	@Test
	void testSelectLict() {
		//assertNotNull(mlist);
		List<MemberDTO> mlist = mdao.selectLict();
		for(MemberDTO m : mlist) {
			System.out.println(m);
		}
		assertNotEquals(0, mlist.size()); // 데이터가 없으면 false
		
	}

	@Test
	void testSelectOne() {
		//assertNotNull(mdto);
		String userid="kkk";
		MemberDTO mdto = mdao.selectOne(userid);
		System.out.println(mdto);
		assertNotNull(mdto); //,dto가 null이 아니면 true
	}

	@Test
	void testInsert() {
		String userid = "park";
		String passwd = "1111";
		int birthyear = 2006;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.insert(mdto);
		//assertNotEquals(0,cnt) : cnt가 0이 아니면 true
		//assertNotEquals(0,cnt);
		
		//assertEquals(1,cnt) : cnt가 1이면 true
		assertEquals(1,cnt);
		if(cnt>0) {
			System.out.println("회원가입 완료");
		}else {
			System.out.println("회원가입 실패");
		}
	}

	@Test
	void testUpdate() {
		String userid = "java";
		String passwd = "2222";
		int birthyear = 2010;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.update(mdto);
		assertEquals(1,cnt);
	}

	@Test
	void testDelete() {
		String userid = "park";
		int cnt = mdao.delete(userid);
		assertEquals(1,cnt);
		
	}

}
