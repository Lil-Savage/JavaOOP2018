import java.util.Scanner;
class ArrayG {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n, i, temp;            
		n = ss.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++)
			a[i] = ss.nextInt();
		for (i = 0; i < n / 2; i++) {
			temp = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = temp;	
		}
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");                    
	}
}	