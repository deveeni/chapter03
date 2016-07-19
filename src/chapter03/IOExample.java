package chapter03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		
		byte[] src = {0, 1, 2, 3, 4, 5}; 
		
		ByteArrayInputStream bais = new ByteArrayInputStream( src ); //���� ������� ���� >>(src) ���� �ȾҴ�.
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); //��а��� �޸��Ҵ� �����൵ ��
		
		int data = -1;
		while( ( data = bais.read()) != -1 ){
			baos.write( data );
			//System.out.println( data );
		}
		
		byte[] dest = baos.toByteArray();//����Ʈ�� ������
		System.out.println( Arrays.toString( src )); //�迭�� ��Ʈ���������� �ٲ���
		
	}

}
