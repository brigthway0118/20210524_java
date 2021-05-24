package java11_interface_guest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GuestDAOImp implements GuestDAO{

	@Override
	public int insert(GuestDTO gdto) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql ="insert into guest(seq, name, email, passwd, content)\r\n" + 
				"values(guest_seq.nextval, ?, ?, ?, ?)";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "update guest\r\n" + 
				"set\r\n" + 
				"name=?,\r\n" + 
				"email=?,\r\n" + 
				"passwd=?,\r\n" + 
				"content=?\r\n" + 
				"where seq = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gdto.getName());
			pstmt.setString(2, gdto.getEmail());
			pstmt.setString(3, gdto.getPasswd());
			pstmt.setString(4, gdto.getContent());
			pstmt.setInt(5, gdto.getSeq());
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "delete guest\r\n" + 
				"where seq=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int pk) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GuestDTO dto = null;
		String sql = "select * from guest\r\n" + 
				"where seq=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pk);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int seq = rs.getInt("seq");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String passwd = rs.getString("passwd");
				String content = rs.getString("content");
				String regdate = rs.getString("regdate");
				
				dto = new GuestDTO(seq, name, email, passwd, content, regdate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public List<GuestDTO> selectList() {
		List<GuestDTO> list = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GuestDTO dto = null;
		String sql = "select * from guest order by seq";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//List<Map> vs List<> : 조인으로 인해서 생성자(DTO)와 컬럼의 수가 맞지 않을경우 Map이 좋다. 
				int seq = rs.getInt("seq");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String passwd = rs.getString("passwd");
				String content = rs.getString("content");
				String regdate = rs.getString("regdate");
				dto = new GuestDTO(seq, name, email, passwd, content, regdate);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


}
