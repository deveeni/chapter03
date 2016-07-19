package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {


	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null; // try catch 문에서 사용할수 있게 하려고 빼냄
	
		try {
			fis = new FileInputStream("sample.jpg");
			fos = new FileOutputStream("sample2.jpg");

			int data = -1;
			while ((data = fis.read()) != -1) { // ioexception
				fos.write(data);
			}

			// fis.close();
			// fos.close(); //자원정리 위치가 여기면 안된다.
		} catch (FileNotFoundException e) {// 나한테 파일이름이 없을 수도 있으니까. try catch를
											// 해줘라
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다:" + e);
			return; // 그냥 끝내버림 그런데 자원정리 해야지 그래서 finally안에 넣어준다.

		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 자원정리
			try {
				if (fis != null) { // fis,fos를 밖으로 뺴서 null인경우 또 에러나기때문에 if문 써줌
					fis.close();// close자체도 ioexception이 일어난다.
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
