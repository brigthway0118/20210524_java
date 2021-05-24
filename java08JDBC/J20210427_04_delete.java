package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_04_delete {

	public static void main(String[] args) {
		//DML : Delete 데이터 삭제
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		
		String itemcode = "8801";
		String sql = "delete from item\r\n" + 
				"where ITEMCODE=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"건 삭제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
