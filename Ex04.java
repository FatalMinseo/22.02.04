import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		String[] cmp = { "�ָ�", "����", "��" };
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(3);
		System.out.print("� ���� �� ���ΰ���?");

		String input = sc.next();
		if (input.equals(cmp[a])) {
			System.out.println("�����.");
		} else {
			if (input.equals("�ָ�")) {
				if (cmp[a].equals("����")) {
					System.out.println("�̰���!!");
				} else {
					System.out.println("�����Ф�");
				}
			} else if (input.equals("����")) {
				if (cmp[a].equals("��")) {
					System.out.println("�̰���!!");
				} else {
					System.out.println("�����Ф�");
				}
			}
			if (input.equals("��")) {
				if (cmp[a].equals("�ָ�")) {
					System.out.println("�̰���!!");
				} else {
					System.out.println("�����Ф�");
				}
			}
		}
		System.out.println("������ " + cmp[a] + "�� �¾��.");
		sc.close();
	}
}
