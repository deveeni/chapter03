package chapter03;


import java.util.Enumeration;
import java.util.Iterator;

import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		// Collection ���� ���� 
		
		Vector<String> vector = new Vector<String>();
		vector.add( "�Ѹ�" );
		vector.add( "������" );
		vector.add( "��浿" );
		vector.add( 2, "�����" );
		vector.remove( 1 );
		
		int count = vector.size();
		
		//��ȸ1
		for(int i = 0; i < count; i++){
			String s = vector.get( i );
			System.out.println( s );
		}
		
		//��ȸ 2 list�������̽��� ������/
		Iterator<String> it = vector.iterator();
		while( it.hasNext() ){
			String s = it.next();
			System.out.println( s );
		}
		

	}

}
