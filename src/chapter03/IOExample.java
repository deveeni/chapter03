package chapter03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		
		byte[] src = {0, 1, 2, 3, 4, 5}; 
		
		ByteArrayInputStream bais = new ByteArrayInputStream( src ); //관만 만들어져 있음 >>(src) 관을 꽂았다.
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); //당분간은 메모리할당 안해줘도 됨
		
		int data = -1;
		while( ( data = bais.read()) != -1 ){
			baos.write( data );
			//System.out.println( data );
		}
		
		byte[] dest = baos.toByteArray();//바이트를 내놔라
		System.out.println( Arrays.toString( src )); //배열을 스트링포맷으로 바꿔줌
		
	}

}
