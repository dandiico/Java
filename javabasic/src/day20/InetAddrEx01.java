package day20;

import java.net.InetAddress;
import java.net.URL;

public class InetAddrEx01 {

	public static void main(String[] args) throws Exception{

		InetAddress[] addr1 = InetAddress.getAllByName("naver.com");
		InetAddress addr2 = InetAddress.getLocalHost(); // 내PC IP
		//System.out.println(addr1.getHostAddress()); // IP 주소만 나옴
		//System.out.println(addr1.getHostName()); // 이름
		System.out.println(addr2.getHostName());
		for(InetAddress a : addr1) {
			System.out.println(a.getHostName());
			System.out.println(a.getHostAddress());
		}
		System.out.println("==============");
		
		String str = "https://post.naver.com/viewer/postView.nhn";
		URL url = new URL(str);
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("포트번호 : " + url.getPort());
		System.out.println("호스트 : " + url.getHost());
	}

}
