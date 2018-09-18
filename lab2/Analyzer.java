import java.util.Scanner;
class Analyzer {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		Data d = new Data();
		int x;
		boolean flag = false;
		while (!flag) {
			System.out.print("Enter number (Q to quit): ");
			try {
				x = ss.nextInt();
				d.addData(x);
			} catch (Exception e) {
				flag = true;
				System.out.println("Average = " + d.getAverage());
				System.out.println("Maximum = " + d.getMax());
			}   
		}
	} 
}