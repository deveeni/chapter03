package chapter03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add( "�Ѹ�" );
		list.add( "������" );
		list.add( "��浿" );
		
		list.remove( 1 );
		
		int count = list.size();
		
		for(int i = 0; i < count; i++){
			String s = list.get( i );
			System.out.println( s );
		}
		
		//��ȸ3
				for( String s : list ){
					System.out.println( "��ȸ3: " + s );
				}
	}

}
