import java.util.Scanner;
class NumDiv {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, i, ans = 0;  
		a = ss.nextInt();
		int x = (int) Math.sqrt(a);
		for (i = 1; i <= x; i++) {     
			if (a % i == 0) {
				ans++;
			}	
		}
		ans *= 2;
		if (x * x == a) ans--;
		System.out.println(ans);
	}
}	