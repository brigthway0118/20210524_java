package java08JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_05_selectOne {

	public static void main(String[] args) {
		//한 건만 조회
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ItemDTO idto = null;
		String itemcode = "8801";
		String sql = "select * from item where itemcode=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, itemcode);
			rs = pstmt.executeQuery();
			if(rs.next()) {//데이터가 있다면
				String itemname = rs.getString("itemname");
				int price = rs.getInt("price");
				String bigo = rs.getString("bigo");
				Date regdate = rs.getDate("regdate");
				idto = new ItemDTO(itemcode, itemname, price, bigo, regdate);
				System.out.println(idto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
