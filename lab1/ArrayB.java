import java.util.Scanner;
class ArrayB {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n, i;            
		n = ss.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = ss.nextInt();
			if (a[i] % 2 == 0)	
				System.out.print(a[i] + " ");
		}                    
	}
}	