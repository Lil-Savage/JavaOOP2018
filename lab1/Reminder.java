import java.util.Scanner;
class Reminder {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b, c, d, i;  
		a = ss.nextInt();
		b = ss.nextInt();
		c = ss.nextInt();
		d = ss.nextInt();
		for (i = a; i <= b; i++)
			if (i % d == c)
				System.out.print(i + " ");
	}
}	