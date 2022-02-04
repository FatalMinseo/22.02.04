import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] idArray = new String[3];
		int[] pwArray = new int[3];

		int menu = 0;
		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			menu = sc.nextInt();

			if (menu == 1) {

				for (int a = 0; a < idArray.length; a++) {
					System.out.print("id : ");
					idArray[a] = sc.next();
					System.out.print("pw : ");
					pwArray[a] = sc.nextInt();
					System.out.println("회원가입 성공!");

					if (a != 2) {
						System.out.println("더 이상 회원가입이 불가능합니다.");
						break;
					}
				}
				System.out.println("로그인을 해주세요.");
			} else if (menu == 2) {
				int b = 0;
				while (b != 1) {
					if (b == 2) {
						System.out.println("로그인 실패!");
					}
					System.out.println("로그인을 해주세요.");
					System.out.print("id : ");
					String inputid = sc.next();
					System.out.print("pw : ");
					int inputpw = sc.nextInt();
					for (int a = 0; a < idArray.length; a++) {
						if (idArray[a].equals(inputid) && pwArray[a] == inputpw) {
							b = 1;
							System.out.println("로그인 성공!");
							break;
						} else {
							b = 2;
						}
					}
				}
			} else if (menu == 3) {
				System.out.println("종료 합니다!");
				break;
			} else {
				System.out.println("다시 입력하세요!");
			}
		}
		sc.close();
	}
}
