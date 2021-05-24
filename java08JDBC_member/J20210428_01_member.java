package java08JDBC_member;

import java.util.List;
import java.util.Scanner;

public class J20210428_01_member {

	public static void main(String[] args) {
		//member데이터 추가
		MemberDAO mdao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		boolean logincheck = false; // 로그인여부
		String login_userid = "";
		while(true) {
			System.out.println("==============================");
			System.out.println("------["+login_userid+"]------");
			System.out.println("==============================");
			System.out.println("0.로그인");
			System.out.println("1.회원가입");
			System.out.println("2.회원수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.회원조회");
			System.out.println("5.회원전체조회");
			System.out.println("9.종료");
			System.out.println("==============================");
			System.out.print("번호 입력 : ");
			int no=sc.nextInt();
			sc.nextLine();
			if(no==0) {
				//로그인
				System.out.println("-----로 그 인-----");
				//userid, passwd 입력받기.
				
				//id의 존재여부.
				// 아이디 중복체크
				System.out.print("로그인할 userid 입력 : ");
				String userid = sc.nextLine();
				//String userid = "5";
				MemberDTO mdto = mdao.selectOne(userid);
				if (mdto == null) {
					System.out.println("아이디가 존재하지 않습니다.");
					logincheck = false;
					login_userid = "";
				}else {
					System.out.print(userid+"의 비밀번호 입력 : ");
					String passwd = sc.nextLine();
					if(passwd.equals(mdto.getPasswd())) {
						System.out.println("로그인성공");
						logincheck = true;
						login_userid = userid;
					}else {
						logincheck = false;
						login_userid = "";
						System.out.println("비밀번호 오류");
						
					}
				}
				//pw 일치여부.
				
			}
			else if (no==5) {
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.println("-----전체 회원목록-----");
				List<MemberDTO> mlist = mdao.selectLict();
				for(MemberDTO m : mlist) {
					System.out.println(m);
				}
				
			}else if(no==4) {
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.println("-----회원 단일조회-----");
//				System.out.println("-----전체 회원목록-----");
//				List<MemberDTO> mlist = mdao.selectLict();
//				for(MemberDTO m : mlist) {
//					l++;
//					System.out.println(l+"번 회원 : "+m.getUserid());
//				}
				System.out.print("userid 입력 : ");
				String userid = sc.nextLine();
				MemberDTO mdto = mdao.selectOne(userid);
				System.out.println(mdto);
				//System.out.print("조회할 회원번호 : ");
				//i = sc.nextInt();
				//System.out.println(i+"번 회원 조회 "+mlist.get(i-1));
				
			}else if(no==1) {
				System.out.println("-----회원추가-----");
				String userid;
				while (true) {
					System.out.print("userid 입력 : ");
					userid = sc.nextLine();
					// 아이디 중복체크
					MemberDTO mdto = mdao.selectOne(userid);
					if (mdto != null)
						System.out.println("중복된 아이디");
					else
						break;
				}
				
				System.out.print("passwd 입력 : ");
				String passwd = sc.nextLine();
				System.out.print("birthyear 입력 : ");
				int birthyear = 0; // 태어난 해를 입력하지 않으면 0값.
				String birthyearS = sc.nextLine();
				if(!birthyearS.equals("")) // 입력을 했다면
					birthyear = Integer.parseInt(birthyearS); //문자를 숫자로 변환
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				int cnt = mdao.insert(mdto);
				if(cnt>0) 
					System.out.println("회원가입 완료");
				else 
					System.out.println("회원가입 실패");
				
				
			}else if(no==2) {
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				
				//기존정보 조회 후 수정정보와 같이 전달
				//MemberDTO mdto = mdao.selectOne(userid);
				System.out.println("-----회원수정-----");
				System.out.print("userid 입력 : ");
				String userid = sc.nextLine();
				System.out.print("passwd 입력 : ");
				String passwd = sc.nextLine();
				System.out.print("birthyear 입력 : ");
				int birthyear = sc.nextInt();
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				int cnt = mdao.update(mdto);
				if(cnt>0)
					System.out.println("회원수정 완료");
				else
					System.out.println("회원수정 실패");
				
			}else if(no==3) {
				if(!logincheck) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.println("-----회원탈퇴-----");
				System.out.print("userid 입력 : ");
				String userid = sc.nextLine();
				if(!login_userid.equals(userid)) {//로그인된 유저id와 삭제하려는 id가 다를경우..
					System.out.println("삭제권한이 없습니다.");
					continue;
				}
				int cnt = mdao.delete(userid);
				if(cnt>0)
					System.out.println("회원삭제 성공");
				else
					System.out.println("회원삭제 실패");
		
				
			}else if(no==9) {
				System.out.println("종료");
				System.exit(1);
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
