import java.util.Scanner;
class Sum {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int b, a, i, ans = 0;            
		b = ss.nextInt();
		for (i = 0; i < b; i++) {     
			a = ss.nextInt();
			ans += a;	
		}                     
		System.out.println(ans);
	}
}	