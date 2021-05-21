package day19;

import java.io.File;
import java.io.IOException;

public class IOEx01 {

	public static void main(String[] args) {
		// C:\Windows\system.ini
		File f = new File("C:\\Windows\\system.ini");
		long size = f.length();
		System.out.println(size);
		// 파일 이름
		String name = f.getName();
		System.out.println(name);
		// 파일 경로
		String path = f.getPath();
		System.out.println(path);
		// 상위 폴더
		String parent = f.getParent();
		System.out.println(parent);
		// 파일타입 판별
		if(f.isFile()) System.out.println(f.getAbsolutePath() + "는 파일입니다.");
		else if(f.isDirectory()) System.out.println(f.getAbsolutePath() + "는 디렉토리다.");
		System.out.println("숨김 속성: " + f.isHidden());
		System.out.println("읽기 속성: " + f.canRead());
		System.out.println("쓰기 속성: " + f.canWrite());
		System.out.println("마지막 수정 날짜: " + new java.util.Date(f.lastModified()));
		
		File f2 = new File("C:\\Windows\\");
		File[] subfile = f2.listFiles();
		for(int i = 0; i<subfile.length; i++) {
			System.out.print(subfile[i].getName());
			System.out.println("\t 파일크기: " + subfile[i].length());
		}
		
		File f3 = new File("d:\\dandico\\kor.txt"); // dandico까지는 있는거고 그 이후는 이제 만들것이다
		try {
			f3.createNewFile(); // 외부에 있는걸 할때는 예외처리 강제로 하는것이 많음, 자바에서 건들일 수 있는 영역이 아니기 때문에
		}catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
		
		
				
		
	}

}
