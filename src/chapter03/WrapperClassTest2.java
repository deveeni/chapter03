package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		//Boxing
		Integer i = new Integer( 10 );
		
		//Unboxing
		int j = i.intValue();
		
		System.out.println( i + "," + j );
		
		//Auto Boxing
		Integer i2 = 10;
		
		//, Auto Unboxing
		int j2 = i + 10; //객체인데 + 를 할 수 있죠. >> int j2 = i.intValue() + 10;
		
		
	}

}
