package application;

public class Program {

	public static void main(String[] args) {
		
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("-------------------------------------------");
		
		int a;
		double c;
		a = 5;
		c = 2 * a;
		System.out.println(a);
		System.out.println(c);
		
		System.out.println("-------------------------------------------");
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		System.out.println("-------------------------------------------");

		int d, e;
		double resultado;
		d = 5;
		e = 2;
		resultado = d / e;
		System.out.println(resultado);
		
		System.out.println("-------------------------------------------");

		resultado = (double) d / e;
		System.out.println(resultado);
		
	}

}
