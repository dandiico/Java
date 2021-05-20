package day18;

import java.util.Enumeration;
import java.util.Properties;

public class PropEx01 {

	public static void main(String[] args) {
		
		
		Properties p = new Properties();
		// k, v 저장
		p.setProperty("id", "global");
		p.setProperty("url", "nullmaster");
		p.setProperty("sid", "orcl");
		p.setProperty("port", "1521");
		
		// v 꺼내기
		String value = p.getProperty("id");
		System.out.println(value);
		System.out.println("===========");
		// 전체 꺼내기
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + "=" + p.getProperty(key));
			
		}
	}

}
