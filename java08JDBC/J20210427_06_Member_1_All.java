package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class J20210427_06_Member_1_All {
	public void getAllMember() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		List<Member> list = new ArrayList<>();
		ResultSet rs = null;
		Member m;
		String sql = "select * from member";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				m = new Member(userid, passwd, birthyear, regdate);
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			for (Member a : list) {
				System.out.println(a);
				//System.out.println(a.getUserid() + " " + a.getPasswd() + " " + a.getBirthyear() + " " + a.getRegdate());
			}
		}
	}
}
