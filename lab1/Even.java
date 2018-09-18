import java.util.Scanner;
class Even {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b, i;  
		a = ss.nextInt();
		b = ss.nextInt();
		for (i = a; i <= b; i++)
			if (i % 2 == 0)
				System.out.print(i + " ");
	}
}	