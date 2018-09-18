import java.util.Scanner;
class MKAD {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b;  
		a = ss.nextInt();
		b = ss.nextInt();
		System.out.println((109 + (a * b) % 109) % 109);
	}
}	