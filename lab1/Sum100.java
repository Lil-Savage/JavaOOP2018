import java.util.Scanner;
class Sum100 {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, i, ans = 0;            
		for (i = 1; i <= 100; i++) {     
			a = ss.nextInt();
			ans += a;	
		}                     
		System.out.println(ans);
	}
}	