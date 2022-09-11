
public class PracBoard02{
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.method();
	}
}

class Parent2 {
	int x = 0;
}

class Child2 extends Parent2{
	public void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}

class Point2D {
	int x;
	int y;
	
	public void Point2d(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

class Point3D extends Point2D{
	int z;
	
	public void Point3D(int a, int b, int c){
		Point2d(a, b);
		this.z = c;
	}
	
}


class Point extends Object{
	int x;
	int y;
	
	Point() {
	this(0, 0);
	}
	
	Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
}


