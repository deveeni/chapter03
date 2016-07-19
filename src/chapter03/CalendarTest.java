package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		
	//	calendar.set(2017, 0, 1);
	//	printDate( calendar );
		
		//calendar.set( CalenCdar.YEAR, 2017);
		
		//�츮�� ������ 10��° �Ǵ³�
		calendar.set( 2013, 07, 21);
		calendar.add(Calendar.YEAR, 10);
	
		printDate(calendar);
	
		//����
		calendar = Calendar.getInstance(); //���÷� ����
		
		//10����
		calendar.add(Calendar.MONTH,-10);
		printDate(calendar);
		
		//������ ������ �� ��° �Ǵ� ��?
		calendar = Calendar.getInstance();
		System.out.println( "������ �� �� " + calendar.get(calendar.DAY_OF_YEAR) + "�� �� �Ǵ� �� �Դϴ�.");
	}
	
	public static void printDate( Calendar calendar ){
		
		String[] DAYS =  {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.print( ( calendar.get( Calendar.YEAR )) + "��");
		System.out.print( calendar.get( Calendar.MONTH ) + "��");
		System.out.print( calendar.get( Calendar.DATE ) + "��");
		System.out.print( DAYS[ calendar.get( Calendar.DAY_OF_WEEK)-1] + "����");
		System.out.print( (calendar.get( Calendar.AM_PM ) == 0 ? "AM" : "PM") + " ");
		
		System.out.print( calendar.get( Calendar.HOUR ) + ":");
		System.out.print( calendar.get( Calendar.MINUTE ) + ":");
		System.out.print( calendar.get( Calendar.SECOND ));
		
		System.out.print( "\n" );
	}

}
