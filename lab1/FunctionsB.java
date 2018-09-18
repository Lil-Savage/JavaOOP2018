import java.util.Scanner;
class FunctionsB {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		double a;
		int b;
		a = ss.nextDouble();
		b = ss.nextInt();              
		System.out.println(pow(a, b));
	}
	public static double pow(double a, int b) {
		double ans = 1;
		int i;
		for (i = 1; i <= b; i++)
			ans *= a;
		return ans;
	}
}	