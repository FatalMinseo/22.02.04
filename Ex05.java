
public class Ex05 {

	public static void main(String[] args) {
		int sum =0;
		int a = 0;
		while (sum<=1000) {
			a++;
			sum +=a;
		} 
		System.out.println(a);
		System.out.println(1 +"부터 "+ a+"까지 총합 : "+sum);
		// %d : 정수자리
		
		System.out.printf("1부터 %d까지 총합 : %d\n", a, sum);
	}
}
