import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		String[] array = { "��", "��" };
		Scanner sc = new Scanner(System.in);

		System.out.println("==== ���� ���� Start! ====");
		System.out.print("���ڸ� �Է��� �ּ��� >> ");
		int a = sc.nextInt();
		for (int b = 1; b <= a; b++) {
			if (b % 2 == 0) {
				System.out.print(array[1]);
			} else {
				System.out.print(array[0]);
			}
		}
		sc.close();
		// System.out.println(Arrays.toString(array));
		
	}
}
