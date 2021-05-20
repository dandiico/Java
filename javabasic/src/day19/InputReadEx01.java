package day19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReadEx01 {

	public static void main(String[] args) {
		// InputStreamReader : 바이트 스트림을 문자 스트림으로 바꿔주는 보조 클래스
		// 텍수투 파일을 읽기 위한 바이트 파일 입력 스트림
		
		FileInputStream fin = null; // 파일 특화 바이트스트림
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("d:\\dandico\\fos.txt");
			in = new InputStreamReader(fin); //MS949로도 가능하지만 깨짐
			System.out.println("encodin: " + in.getEncoding());
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fin != null) try {
				fin.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			if(in != null) try {
				fin.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}
		
		
	}

}
