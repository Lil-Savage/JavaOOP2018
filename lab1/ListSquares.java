import java.util.Scanner;
class ListSquares {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, i = 1;
		a = ss.nextInt();
		while (i * i <= a) {
			System.out.println(i * i);
			i++;
		}
	}
}