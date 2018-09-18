import java.util.Scanner;
class Max {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b;  
		a = ss.nextInt();
		b = ss.nextInt();
		if (b > a) a = b;
		System.out.println(a);
	}
}	