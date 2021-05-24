package java11_interface_guest;

import java.util.List;

public interface GuestDAO {
	//추가
	int insert(GuestDTO gdto);
	//수정
	int update(GuestDTO gdto);
	//삭제
	int delete(int seq);
	//한 건조회
	GuestDTO selectOne(int pk);
	//전체조회
	List<GuestDTO> selectList();
}
