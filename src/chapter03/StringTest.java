package chapter03;

public class StringTest {

	public static void main(String[] args) {
		
		//escape ���� ���
		char c = '\'';
		String s = "He\"llo\"\t World\n"; 
		
		System.out.println(s);

		
		// + ����
		System.out.println( "Hello" + "World" + 2 ); //append�� �����ε尡 �Ǿ��ִ�. 
		System.out.println( new StringBuffer("Hello").append("World") );
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(2);
		
		System.out.println(sb);
	}

}
