import java.util.Scanner;
class Square {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b, i;  
		a = ss.nextInt();
		b = ss.nextInt();
		for (i = a; i <= b; i++) {
			int x = (int) Math.sqrt(i);
			if (x * x == i)
				System.out.print(i + " ");
		}
	}
}	