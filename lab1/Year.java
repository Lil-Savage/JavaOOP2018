import java.util.Scanner;
class Year {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a;  
		a = ss.nextInt();
		if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}	