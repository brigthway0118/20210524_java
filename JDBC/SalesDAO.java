package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SalesDAO {
	List<Map<String, Object>> dayItemSalesTotal(String saledate){
		List<Map<String, Object>> list  = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement pstmt;
		//Scanner sc = new Scanner(System.in);
		//System.out.print("원하는 날짜 입력(yyyy-mm-dd) : ");
		//String input;
		//input = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		Connection conn = DBConn.getConn();
		/*
		String sql = "select i.*, nvl(s.amount,0) amount, nvl(i.bigo,' ') bigo\r\n" + 
				"from item i\r\n" + 
				"left join (\r\n" + 
				"    select itemcode,sum(amount) amount\r\n" + 
				"    from sales\r\n" + 
				"    where saledate = '"+input+"'\r\n" + 
				"    group by itemcode) s\r\n" + 
				"on (i.itemcode = s.itemcode)\r\n" + 
				"order by i.itemcode";
		*/
		sb.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(S.AMOUNT,0) AMOUNT, NVL(I.BIGO,' ') BIGO, I.REGDATE ");
		sb.append("FROM ITEM I LEFT JOIN ");
		sb.append("            (SELECT ITEMCODE, SUM(AMOUNT) AMOUNT "); 
		sb.append("               FROM SALES ");
		sb.append("				WHERE SALEDATE = ? "); 
		sb.append("            	GROUP BY ITEMCODE) S ");
		sb.append("ON I.ITEMCODE = S.ITEMCODE ");
		sb.append("ORDER BY I.ITEMCODE ");
		try {
			//pstmt = conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, saledate);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map= new HashMap<>();
				//거쳐넣기
//				String itemcode = rs.getString("itemcode");
//				String itemname = rs.getString("itemname");
//				int price = rs.getInt("price");
//				String bigo = rs.getString("bigo");
//				String regdate = rs.getString("regdate");
//				int amount = rs.getInt("amount");
//				map.put("itemcode", itemcode);
//				map.put("itemname", itemname);
//				map.put("price", price);
//				map.put("bigo", bigo);
//				map.put("regdate", regdate);
//				map.put("amount", amount);
//				
				//바로넣기
				map.put("itemcode", rs.getString("itemcode"));
				map.put("itemname", rs.getString("itemname"));
				map.put("price", rs.getInt("price"));
				map.put("amount", rs.getInt("amount"));
				map.put("bigo", rs.getString("bigo"));
				map.put("regdate", rs.getString("regdate"));
				
				list.add(map);
				//System.out.println(itemcode+ itemname+ price+ bigo+ regdate+ amount);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	//view를 가져와서 데이터 조회하기
	List<Map<String, Object>> showView(String saledate) {
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		List<Map<String, Object>> list = new ArrayList<>();
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		sb.append("select * from item_sales_view where saledate=?");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, saledate);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", rs.getString("saledate"));
				map.put("seq", rs.getInt("seq"));
				map.put("itemcode", rs.getString("itemcode"));
				map.put("qty", rs.getInt("qty"));
				map.put("amount", rs.getInt("amount"));
				map.put("regdate", rs.getString("regdate"));
				map.put("itemname", rs.getString("itemname"));
				map.put("qtyAVG", rs.getString("qtyavg"));
				
				list.add(map);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
