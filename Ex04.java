import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		String[] cmp = { "주먹", "가위", "보" };
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(3);
		System.out.print("어떤 것을 낼 것인가요?");

		String input = sc.next();
		if (input.equals(cmp[a])) {
			System.out.println("비겼어요.");
		} else {
			if (input.equals("주먹")) {
				if (cmp[a].equals("가위")) {
					System.out.println("이겼어요!!");
				} else {
					System.out.println("졌어요ㅠㅠ");
				}
			} else if (input.equals("가위")) {
				if (cmp[a].equals("보")) {
					System.out.println("이겼어요!!");
				} else {
					System.out.println("졌어요ㅠㅠ");
				}
			}
			if (input.equals("보")) {
				if (cmp[a].equals("주먹")) {
					System.out.println("이겼어요!!");
				} else {
					System.out.println("졌어요ㅠㅠ");
				}
			}
		}
		System.out.println("상대방은 " + cmp[a] + "를 냈어요.");
		sc.close();
	}
}
