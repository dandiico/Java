package day19;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputEx01 {

	public static void main(String[] args) {
		FileInputStream fin = null;
		byte[] b = new byte[6]; // 읽어와서 저장할 빈배열
		try {
			// 파일 입력스트림 생성
			fin = new FileInputStream("d:\\dandico\\test.out");
			// 파일 읽어오기
			int i = 0; // 배열 inx 번호로 사용할 변수
			int c; // 읽은 파일을 임시 저장할 변수
			while((c = fin.read()) != -1) { // 파일의 끝 (EOF은 -1리턴)까지 반복해서 읽기
				b[i] = (byte)c;
				i++;
			}
			// 화면에 출력
			for(int a = 0; a < b.length; a++) {
				System.out.print(b[a] + " ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fin != null) try {fin.close();}catch(IOException e) {e.printStackTrace();}
			
		}
		
	}

}
