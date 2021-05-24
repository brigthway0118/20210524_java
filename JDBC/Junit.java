package JDBC;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Junit {
	
	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list;
		String saledate = "20210429";
		//System.out.println(saledate.substring(0, 4)+"-"+
		//		saledate.substring(4, 6)+"-"+saledate.substring(6, 8));
		saledate = saledate.substring(0, 4)+"-"+
				saledate.substring(4, 6)+"-"+
				saledate.substring(6, 8);
		list = sdao.dayItemSalesTotal(saledate);
		for(Map<String, Object> m : list) {
			System.out.print(m.get("itemcode")+" ");
			System.out.print(m.get("itemname")+" ");
			System.out.print(m.get("price")+" ");
			System.out.print(m.get("amount")+" ");
			System.out.print(m.get("regdate")+" ");
			System.out.print(m.get("bigo"));
			System.out.println("");
		}
	}
	
	@Test
	void test3() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list;
		list = sdao.showView("2021-04-29");
		for(Map<String, Object> m : list) {
			System.out.println(m);
		}
	}

}
