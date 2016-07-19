package chapter03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest {

	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader( "./src/chapter03/BufferedReaderTest.java" ); //chapter - src -BufferedReaderTest.java
			LineNumberReader lnr = new LineNumberReader( fr );
			
			String s = null;
			int index = 0;
			
			while( ( s = lnr.readLine()) != null ){
				String line = String.format("%3d : %s", lnr.getLineNumber(), s); //앞에 칸 띄기 3d -- s 구문이 먼저 실행되기 전에 
				System.out.println( line );
			}
			
			lnr.close(); //string 두개 열려있지만 아무거나 닫아주면된다.
			
			} catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}


	}

}
