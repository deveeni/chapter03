package chapter03;


public class Point {
	//점을 찍으려 한다. 점 객체가 같고 있는 공통은  x,y
	private int x;
	private int y;
	
	public Point(){
		
	}
	
	//생성자는 public 클래스 이름과 같다.
	public Point( int x, int y ){
		this.x = x;
		this.y = y;
	}
	public void show(){
		System.out.println( "삡 [x=" + x + ",y=" + y +"]에 점을 그렸습니다.");
		
	}
	//점 사라지게
	public void show( boolean visible ){
		if ( visible ) {
			show(); //점그리기 불러오기
			return;
		}
		System.out.println(" [x=" + x + ",y=" + y +"]에 점을 지웠습니다.");
	
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
