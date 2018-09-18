import java.util.Scanner;
class MinDivWhile {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, ans = 2;            
		a = ss.nextInt();
		while (a % ans != 0) {
			ans++;
		}                     
		System.out.println(ans);
	}
}	