import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] idArray = new String[3];
		int[] pwArray = new int[3];

		int menu = 0;
		while (true) {
			System.out.println("1. ȸ������ 2. �α��� 3. ����");
			menu = sc.nextInt();

			if (menu == 1) {

				for (int a = 0; a < idArray.length; a++) {
					System.out.print("id : ");
					idArray[a] = sc.next();
					System.out.print("pw : ");
					pwArray[a] = sc.nextInt();
					System.out.println("ȸ������ ����!");

					if (a != 2) {
						System.out.println("�� �̻� ȸ�������� �Ұ����մϴ�.");
						break;
					}
				}
				System.out.println("�α����� ���ּ���.");
			} else if (menu == 2) {
				int b = 0;
				while (b != 1) {
					if (b == 2) {
						System.out.println("�α��� ����!");
					}
					System.out.println("�α����� ���ּ���.");
					System.out.print("id : ");
					String inputid = sc.next();
					System.out.print("pw : ");
					int inputpw = sc.nextInt();
					for (int a = 0; a < idArray.length; a++) {
						if (idArray[a].equals(inputid) && pwArray[a] == inputpw) {
							b = 1;
							System.out.println("�α��� ����!");
							break;
						} else {
							b = 2;
						}
					}
				}
			} else if (menu == 3) {
				System.out.println("���� �մϴ�!");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���!");
			}
		}
		sc.close();
	}
}
