package chapter03;

import java.util.concurrent.ForkJoinPool;
import java.util.Formatter;

public class FomatterTest {

	public static void main(String[] args) {

		String name = "��ȿ��";
		int score = 100;
		
		//String Ŭ������ format static �޼��带 ����ϴ� ���
		System.out.println( name + "," + score);
		System.out.println(String.format("�л� %s�� �ڹٽ����� %d�� �޾ҽ��ϴ�.", name, score));
		
		// Formatter�� ����ϴ� ���
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter( sb );
		System.out.println(fm.format("�л� %s�� �ڹٽ����� %d�� �޾ҽ��ϴ�.", name, score));
	}

}
