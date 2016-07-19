package chapter03;


import java.util.Enumeration;
import java.util.Iterator;

import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		// Collection 생성 이후 
		
		Vector<String> vector = new Vector<String>();
		vector.add( "둘리" );
		vector.add( "마이콜" );
		vector.add( "고길동" );
		vector.add( 2, "도우넛" );
		vector.remove( 1 );
		
		int count = vector.size();
		
		//순회1
		for(int i = 0; i < count; i++){
			String s = vector.get( i );
			System.out.println( s );
		}
		
		//순회 2 list인터페이스를 구현한/
		Iterator<String> it = vector.iterator();
		while( it.hasNext() ){
			String s = it.next();
			System.out.println( s );
		}
		

	}

}
