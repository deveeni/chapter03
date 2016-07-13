package chapter03;

public class LangClassTest {

	private int y = 0;

	public static void main(String[] args) {

		Point p1 = new Point(10, 20);
		Point p2 = new Point(50, 100);
		Point p3 = p1;
		
		
		System.out.println( p1.getClass().getName());
		System.out.println( p1.hashCode() );
		System.out.println( p1.toString() );
		System.out.println( p1 );

		String s = new String("Hello");
		System.out.println( s.toString() );
		
		// == ��ü�� ��쿡�� ������ ��ü ���θ� Ȯ���� ����. 
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		//equals -> ��ü�� ���� ��(���)
		Point p4 = new Point( 10,20 );
		System.out.println( p1 == p4 );
		System.out.println( p1.equals( p4 )); //����� ���ٰ� �ϰ� ��������.
		
		String s1 = new String( "hello" );
		String s2 = new String( "hello" );
		System.out.println( s1 == s2 );
		System.out.println( s1.equals( s2 ) ); //�ȿ� ������ �����ϱ�
	
		
	
	}

	
	private int x;


	
//	@Override
//	public boolean equals(Object obj) {
//		
//		//�������Ҷ��� ù��°��
//		if( this == obj ){
//			return true;
//		}
//		if(	this.getClass() != obj.getClass()){
//			return false;
//		}
//		
//		Point other = (Point)obj; //x,y�� �̾Ƴ����ϱ� ������
//		if( this.x == other.getX() && this.y == other.getY()){
//			return true;
//		}
//		
//		return false;
//	}

	
	
}
