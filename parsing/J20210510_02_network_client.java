package parsing;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class Client{
	private String ip = "127.0.0.1";
	private int port = 33333;
	void start() {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		PrintWriter pw = null;
		
		//클라이언트에서 서버에 접속하기 위해서는 서버의 IP, Port가 필요하다.
		try {
			socket = new Socket(ip, port);
			System.out.println("클라이언트 : 서버 접속 성공");
			pw = new PrintWriter(socket.getOutputStream(), true);
			while(true) {
				System.out.print("보낼 메세지 : ");
				String data = sc.nextLine();
				pw.println(data);
				if(data.equals("quit")) {
					System.out.println("클라이언트 종료");
					break;
				}
				
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) pw.close();
				if (socket != null) socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class J20210510_02_network_client {

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
