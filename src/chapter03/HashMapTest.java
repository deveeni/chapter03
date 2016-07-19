package chapter03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap();
		
		map.put( "둘리",100 ); //auto boxing
		// 위와 같음 map.put( "둘리",new Integer(100) );
		
		map.put( "둘리" , 100 );
		map.put( "마이콜", 50 );
		map.put( "도우넛", 80 );
	
		int score = map.get( "마이콜" ); //auto unboxing
		System.out.println( score );
		
		//전체순회
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while( it.hasNext() ){
			String key = it.next();
			int value = map.get( key );
			
			System.out.println( "key: " + key + ", value:" + value );
		}
		
	}

}
