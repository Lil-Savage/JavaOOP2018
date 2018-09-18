import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b;  
		a = ss.nextInt();
		b = ss.nextInt();
		if (((a != 1) && (b != 1)) || ((a == 1) && (b == 1)))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}	