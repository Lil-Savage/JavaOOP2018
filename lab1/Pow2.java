import java.util.Scanner;
class Pow2 {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, ans = 1;            
		a = ss.nextInt();
		while (ans <= a) {
			System.out.print(ans + " ");
			ans *= 2;
		}                     
	}
}	