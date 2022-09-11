
public class PracBoard{
	public static void main (String[] args) {
		Child child = new Child();
		child.method();
	}
}

class Parents{
	int x = 50;
}

class Child extends Parents{
	int x = 10;
	
	public void method() {
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}
}