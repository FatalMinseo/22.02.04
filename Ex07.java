import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;

		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			if (input % 2 == 0) {
				a++;
			} else {
				b++;
			}
			System.out.println("Ȧ�� ���� : " + b);
			System.out.println("¦�� ���� : " + a);
		}
		sc.close();
	}
}
