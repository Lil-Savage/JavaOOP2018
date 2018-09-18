import java.util.Scanner;
class ArrayD {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n, i, ans = 0;            
		n = ss.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++)
			a[i] = ss.nextInt();

		for (i = 1; i < n; i++) {
			if (a[i - 1] < a[i])	
				ans++;
		}
		System.out.print(ans);                    
	}
}	