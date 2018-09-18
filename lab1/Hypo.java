import java.util.Scanner;
class Hypo {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b;
		double ans;
		a = ss.nextInt();
		b = ss.nextInt();
		ans = Math.sqrt(a * a + b * b);
		System.out.println(ans);
	}
}	