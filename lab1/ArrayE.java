import java.util.Scanner;
class ArrayE {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int n, i, ans = 0;            
		n = ss.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++)
			a[i] = ss.nextInt();
		boolean flag = false;
		for (i = 1; i < n; i++) {
			if (!flag)
			if (((a[i - 1] > 0) && (0 < a[i])) || ((a[i - 1] < 0) && (0 > a[i]))) {	
				System.out.print("YES");
				flag = true;
			}	
		}
		if (!flag) System.out.println("NO");                    
	}
}	