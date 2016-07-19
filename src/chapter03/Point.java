package chapter03;


public class Point {
	//���� ������ �Ѵ�. �� ��ü�� ���� �ִ� ������  x,y
	private int x;
	private int y;
	
	public Point(){
		
	}
	
	//�����ڴ� public Ŭ���� �̸��� ����.
	public Point( int x, int y ){
		this.x = x;
		this.y = y;
	}
	public void show(){
		System.out.println( "�� [x=" + x + ",y=" + y +"]�� ���� �׷Ƚ��ϴ�.");
		
	}
	//�� �������
	public void show( boolean visible ){
		if ( visible ) {
			show(); //���׸��� �ҷ�����
			return;
		}
		System.out.println(" [x=" + x + ",y=" + y +"]�� ���� �������ϴ�.");
	
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LangClassTest other = (LangClassTest) obj;
		if ( this.x != x )
			return false;
		if ( this.y != y )
			return false;
		return true;
	}



	
	
	
}
