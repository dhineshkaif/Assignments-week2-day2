package week2.day1;

public class Calculator {
	public void add(int m, int n) {
		int o = m + n;
		System.out.println(o);
	}

	public void sub(int g, int h) {
		int k = g - h;
		System.out.println(k);

	}

	public void multi(double s, double l) {
		double b = s * l;
		System.out.println(b);
	}

	public void divide(float c, float j) {
		float x = c / j;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Calculator fun = new Calculator();
		fun.add(4, 5);
		fun.divide(0.5f, 0.8f);
		fun.sub(44, 55);
		fun.multi(5.5, 4.4);

	}

}
