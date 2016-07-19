package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {


	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null; // try catch ������ ����Ҽ� �ְ� �Ϸ��� ����
	
		try {
			fis = new FileInputStream("sample.jpg");
			fos = new FileOutputStream("sample2.jpg");

			int data = -1;
			while ((data = fis.read()) != -1) { // ioexception
				fos.write(data);
			}

			// fis.close();
			// fos.close(); //�ڿ����� ��ġ�� ����� �ȵȴ�.
		} catch (FileNotFoundException e) {// ������ �����̸��� ���� ���� �����ϱ�. try catch��
											// �����
			e.printStackTrace();
			System.out.println("������ ã�� �� �����ϴ�:" + e);
			return; // �׳� �������� �׷��� �ڿ����� �ؾ��� �׷��� finally�ȿ� �־��ش�.

		} catch (IOException e) {
			e.printStackTrace();
		} finally {// �ڿ�����
			try {
				if (fis != null) { // fis,fos�� ������ ���� null�ΰ�� �� �������⶧���� if�� ����
					fis.close();// close��ü�� ioexception�� �Ͼ��.
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
