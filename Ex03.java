
public class Ex03 {

	public static void main(String[] args) {
		int num =1;
		int sum =0;
		
		// do-while �� ���� do �� �ִ� ���� ����
		// while ���� Ȯ�� �ϰ� ���� ����
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
