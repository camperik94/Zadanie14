
public class Rysowanie {
	private int x;
	private int y;
	private int a;
	private int b;
	private String zn;

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

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getZn() {
		return zn;
	}

	public void setZn(String zn) {
		this.zn = zn;
	}

	public Rysowanie(int x, int y, int a, int b, String zn) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.zn = zn;
	}

	public void funkcja() {
		for (int i = 1; i < y; i++) {
			System.out.println();
		}
		for (int u = 1; u <= a; u++) {
			for (int j = 1; j < x + b; j++) {
				if (j < x) {
					System.out.print(" ");
				} else {
					System.out.print(zn);
				}
			}
			System.out.println();
		}
	}
}
