import java.util.Scanner;
class FunctionsA {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b, c, d;
		a = ss.nextInt();
		b = ss.nextInt();
		c = ss.nextInt();
		d = ss.nextInt();              
		System.out.println(min(a, b, c, d));
	}
	public static int min(int a, int b, int c, int d) {
		int m;
		if (a < b) m = a;
		else m = b;
		if (c < m) m = c;
		if (d < m) m = d;
		return m;
	}
}	