import java.util.Scanner;
class ArrayC {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n, i, ans = 0;            
		n = ss.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = ss.nextInt();
			if (a[i] > 0)	
				ans++;
		}
		System.out.print(ans);                    
	}
}	