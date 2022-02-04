
public class Ex03 {

	public static void main(String[] args) {
		int num =1;
		int sum =0;
		
		// do-while 문 먼저 do 에 있는 로직 실행
		// while 조건 확인 하고 로직 실행
		//
		//do {} while; {}
		do {
			sum += num;
			num++;
		} while(sum<=1000); {
			System.out.println(num +", "+sum );
			}
	}
}
