import java.util.Scanner;
class ExactPow {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, ans = 1;            
		a = ss.nextInt();
		while (ans < a) {
			ans *= 2;
		}
		if (ans == a)
			System.out.println("YES");
		else
			System.out.println("NO");                     
	}
}	