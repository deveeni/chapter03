package chapter03;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		
		//Collection Framework ����( JDK v.1.2���� )
		Vector<String> vector = new Vector<String>();
		vector.addElement( "�Ѹ�" );
		vector.addElement( "������" );
		vector.addElement( "�����" );
		vector.addElement( "�浿" );
		
		//��ȸ1
		vector.removeElement("������");
		
		int size = vector.size();
		for(int i = 0; i < size; i++){
			String s = vector.elementAt( i );
			System.out.println( s );
		}
		
		//��ȸ2
				Enumeration<String> e = vector.elements();
					while( e.hasMoreElements() ){
					String s = e.nextElement();
					System.out.println( s );
					}
	
	//��ȸ3
			for( String s : vector ){
				System.out.println( "��ȸ3: " + s );
			}

}
	}
