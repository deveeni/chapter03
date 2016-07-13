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
		
		// == 객체인 경우에는 동일한 객체 여부만 확인해 본다. 
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		//equals -> 객체의 내용 비교(동등성)
		Point p4 = new Point( 10,20 );
		System.out.println( p1 == p4 );
		System.out.println( p1.equals( p4 )); //동등성을 같다고 하고 싶은거지.
		
		String s1 = new String( "hello" );
		String s2 = new String( "hello" );
		System.out.println( s1 == s2 );
		System.out.println( s1.equals( s2 ) ); //안에 내용이 같으니까
	
		
	
	}

	
	private int x;


	
//	@Override
//	public boolean equals(Object obj) {
//		
//		//재정의할때는 첫번째로
//		if( this == obj ){
//			return true;
//		}
//		if(	this.getClass() != obj.getClass()){
//			return false;
//		}
//		
//		Point other = (Point)obj; //x,y를 뽑아내야하기 때문에
//		if( this.x == other.getX() && this.y == other.getY()){
//			return true;
//		}
//		
//		return false;
//	}

	
	
}
