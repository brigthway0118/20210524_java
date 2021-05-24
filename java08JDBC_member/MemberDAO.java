package java08JDBC_member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java08JDBC.DBConn;

//DAO : 데이터베이스 접근하는 메소드들의 모음
//DB Access object
public class MemberDAO {
	//전체조회
	List<MemberDTO> selectLict(){
		List<MemberDTO> mlist = new ArrayList<>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getTimestamp("regdate");//날짜+시간
				//Date regdate = rs.getDate("regdate");//날짜
				//Date regdate = rs.getTime("regdate");//시간
				//System.out.println(rs.getTime("regdate"));
				MemberDTO mdto = new MemberDTO(userid,passwd,birthyear,regdate);
				mlist.add(mdto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mlist;
	}
	
	//한건조회
	MemberDTO selectOne(String userid){
		MemberDTO mdto = null;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member where userid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date date = rs.getDate("regdate");
				mdto = new MemberDTO(userid, passwd, birthyear, date);
				//System.out.println(mdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mdto;
	}
	
	//추가
	int insert(MemberDTO mdto){
		int cnt=0; // 적용건수
		//DB접속
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt=null;
		String sql = "insert into member(userid, passwd, birthyear) values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPasswd());
			pstmt.setInt(3, mdto.getBirthyear());
			cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 추가");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(conn != null)	conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}
	//수정
	int update(MemberDTO mdto) {
		int cnt=0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt=null;
//		String sql="update member\r\n" + 
//				"set passwd = ?, BIRTHYEAR = ?\r\n" + 
//				"where userid=?";
		//String sql은 sql문이 길어질수록 속도가 느려지기 때문에 아래 방식을 이용한다
		StringBuffer sql = new StringBuffer();
		sql.append("update member\r\n ");
		sql.append("set passwd = ?, BIRTHYEAR = ?\r\n ");
		sql.append("where userid=?");
		//System.out.println(sql); //println이 sql객체 안에있는 toString을 실행해준다.
		try {
			pstmt = conn.prepareStatement(sql.toString()); // prepareStatement는 sql.toString을 실행해줘야한다.
			pstmt.setString(1, mdto.getPasswd());
			pstmt.setInt(2, mdto.getBirthyear());
			pstmt.setString(3, mdto.getUserid());
			cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 수정");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(conn != null)	conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
		
	}
	
	//삭제
	int delete(String userid){
		int cnt=0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt=null;
		String sql ="delete from member where userid=?"; 
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 삭제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(conn != null)	conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cnt;
	}
}
