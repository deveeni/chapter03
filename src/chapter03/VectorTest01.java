package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		
		//Collection Framework 이전( JDK v.1.2이전 )
		Vector<String> vector = new Vector<String>();
		vector.addElement( "둘리" );
		vector.addElement( "마이콜" );
		vector.addElement( "도우넛" );
		vector.addElement( "길동" );
		
		//순회1
		vector.removeElement("마이콜");
		
		int size = vector.size();
		for(int i = 0; i < size; i++){
			String s = vector.elementAt( i );
			System.out.println( s );
		}
		
		//순회2
				Enumeration<String> e = vector.elements();
					while( e.hasMoreElements() ){
					String s = e.nextElement();
					System.out.println( s );
					}
	
	//순회3
			for( String s : vector ){
				System.out.println( "순회3: " + s );
			}

}
	}
