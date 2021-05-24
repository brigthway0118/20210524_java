package parsing;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// 파싱
		String target = "https://www.naver.com/";
		// Thread.sleep(10000)
		//파일이름은 네이버시간
		//
		
		HttpURLConnection con 
			= (HttpURLConnection)new URL(target).openConnection();
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		FileWriter fw = null; 
		String temp; 
		int cnt = 0;
		while ((temp = br.readLine())!= null) {
			cnt++;
			//System.out.println(cnt + temp);
			if (temp.contains("class=\"title")) {
				System.out.println(temp);
//	//				String year = temp.substring(0,4);
//	//				System.out.println(year +"년");
//					fw = new FileWriter(temp + ".txt");
			}
//				//이슈 가져오기
//				if (temp.contains("class=\"issue\"")) {
//					//System.out.println(temp);
//					temp = temp.split("quickarticle\">")[1];
//					temp = temp.split("</a>")[0];
//					fw.write(temp +"\n");
//				}
		}
		//fw.close();
		br.close();
		con.disconnect();

	}
}
