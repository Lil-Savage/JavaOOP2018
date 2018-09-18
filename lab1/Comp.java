import java.util.Scanner;
class Comp {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, b;  
		a = ss.nextInt();
		b = ss.nextInt();
		if (a > b)
			System.out.println("1");
		else
		if (a < b)
			System.out.println("2");
		else 
			System.out.println("0");
	}
}	