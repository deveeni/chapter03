package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		
		try {
//			FileOutputStream fos = new FileOutputStream( "123.txt" );
			
			BufferedOutputStream bos =
					new BufferedOutputStream( new FileOutputStream("123.txt") );
			
//			for( int i = '1'; i < 9; i++){
			for( int i = 49; i < 57; i++){
				bos.write( i );
			}
			
//			bos.flush(); // ���� ������ ������ ���Ͽ� ���� -- ����.
			bos.close(); // ���� �� �ڵ����� flush�� �Ͼ��.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch ( IOException e ){
			e.printStackTrace();
		}
	}

}
