package java08JDBC_sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java08JDBC.DBConn;

public class SalesDAO {
	//일일 상품 판매 리스트
	List<Map<String, Object>> dailyItemSalesList(){
		//DB커넥션
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Map<String, Object>> list = new ArrayList<>();
		//Map<String, Object>형을 가지는 리스트.
		
		StringBuffer sql = new StringBuffer();
		sql.append("select s.SALEDATE, s.SEQ, s.ITEMCODE, i.ITEMNAME, s.QTY, s.AMOUNT ");
		sql.append("from sales s ");
		sql.append("inner join item i on(s.itemcode = i.itemcode) ");
		sql.append("order by s.saledate");
		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//2가지 방법
				//1. 일일 상품 판매리스트를 받을 dto(클래스)를 하나 만든다.(SalesDTO, ItemDTO같은 것.)
				//2. Map을 이용하는 방법
				//rs.getString은 sql결과값을 가져오는 것.
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				System.out.println("1)"+saledate+" 2)"+ seq +" 3)"+ itemcode +" 4)"+ itemname +" 5)"+ qty +" 6)"+ amount);
				Map<String, Object> map = new HashMap<>();
				//Map<키이름, 키값>. 키 이름은 String이다.
				//따라서 키이름, 값(인트,스트링,데이트 다 가져옴)
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//rs
		return list;
	}
	
	List<Map<String, Object>> dailyItemSumList() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Map<String, Object>> list = new ArrayList<>();
		StringBuffer sql = new StringBuffer();
		sql.append("select s.SALEDATE, s.ITEMCODE, max(i.ITEMNAME) itemname, sum(s.qty) qty, sum(s.amount) amount ");
		sql.append("from sales s ");
		sql.append("inner join item i on(s.itemcode = i.itemcode) ");
		sql.append("group by s.SALEDATE, s.ITEMCODE ");
		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String saledate = rs.getString("saledate");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
