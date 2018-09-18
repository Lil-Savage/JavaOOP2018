import java.util.Scanner;
class FunctionsC {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b;
		a = ss.nextInt();
		b = ss.nextInt();              
		System.out.println(xor(a, b));
	}
	public static int xor(int a, int b) {
		if (((a == 1) || (b == 1)) && (a != b)) return 1;
		else return 0;
	}
}	