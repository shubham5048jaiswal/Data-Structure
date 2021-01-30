package list;

public class Pair<X, Y> {
	
	X x;                                 //X= String
	Y y;                                 //Y = int
	
	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	public void Description() {
		System.out.println(x + " and " + y);
	}

}
