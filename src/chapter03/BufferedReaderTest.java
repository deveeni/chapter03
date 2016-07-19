package chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		try{
		FileReader fr = new FileReader( "./src/chapter03/BufferedReaderTest.java" ); //chapter - src -BufferedReaderTest.java
		BufferedReader br = new BufferedReader( fr );
		
		String s = null;
		int index = 0;
		
		while( ( s = br.readLine()) != null ){
			String line = String.format("%3d : %s", ++index, s); //앞에 칸 띄기 3d -- s 구문이 먼저 실행되기 전에 
			System.out.println( line );
		}
		br.close(); //string 두개 열려있지만 아무거나 닫아주면된다.
		
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
		
	}

}
