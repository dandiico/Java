package day19;

import java.io.File;

public class IOEx02 {

	public static void main(String[] args) {

		File f1 = new File("D:\\yje\\java_sample");
		if(!f1.exists()) { // 현재 같은 경로의 같은 이름의 것이 존재하지 않으면
			f1.mkdir(); // 폴더 생성해라
		}
		
		f1.renameTo(new File("d:\\yje\\javaSample"));
	}

}
