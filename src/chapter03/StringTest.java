package chapter03;

public class StringTest {

	public static void main(String[] args) {
		
		//escape 문자 사용
		char c = '\'';
		String s = "He\"llo\"\t World\n"; 
		
		System.out.println(s);

		
		// + 연산
		System.out.println( "Hello" + "World" + 2 ); //append가 오버로드가 되어있다. 
		System.out.println( new StringBuffer("Hello").append("World") );
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(2);
		
		System.out.println(sb);
	}

}
