import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int answer = rd.nextInt(10)+1;
		int input = 0;
		int cnt =0;
		while (input != answer) {
			System.out.print("1~10 정수 입력 : ");
			input = sc.nextInt();
			cnt++;
		}
		System.out.println("랜덤 수 : " + answer);
		System.out.println("정답 입력 수 : "+ cnt);
		sc.close();
	}
}
