
public class Ex05 {

	public static void main(String[] args) {
		int sum =0;
		int a = 0;
		while (sum<=1000) {
			a++;
			sum +=a;
		} 
		System.out.println(a);
		System.out.println(1 +"���� "+ a+"���� ���� : "+sum);
		// %d : �����ڸ�
		
		System.out.printf("1���� %d���� ���� : %d\n", a, sum);
	}
}
