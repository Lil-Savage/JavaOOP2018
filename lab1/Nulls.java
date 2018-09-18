import java.util.Scanner;
class Nulls {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int b, a, i, ans = 0;            
		b = ss.nextInt();
		for (i = 0; i < b; i++) {     
			a = ss.nextInt();
			if (a == 0) ans++;	
		}                     
		System.out.println(ans);
	}
}	