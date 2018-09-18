import java.util.Scanner;
class ArrayF {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n, i, ans = 0;            
		n = ss.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++)
			a[i] = ss.nextInt();
		for (i = 1; i < n - 1; i++) {
			if ((a[i - 1] < a[i]) && (a[i] > a[i + 1])) {	
				ans++;
			}	
		}
		System.out.println(ans);                    
	}
}	