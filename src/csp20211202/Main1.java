package csp20211202;
import java.util.Scanner;
/**
 * 
* @Description csp20211202
* @author TimTim 
* @version
* @date 2022年9月25日上午1:34:58
*  70分，数组开不了那么大，会爆炸
 */
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int N = scanner.nextInt();
		int r = N / (n + 1);
		long sum = 0;
		long[] arrF = new long[N];
		long[] arrG = new long[N];
		for (int i = 0; i < n; i++) {
			arrF[scanner.nextInt()]++;
		}
		for (int i = r; i < N; i += r) {
			arrG[i]++;
		}
		for (int i = 1; i < N; i++) {
			arrF[i] += arrF[i - 1];
			arrG[i] += arrG[i - 1];
			sum += (Math.abs(arrF[i] - arrG[i]));
		}
		System.out.println(sum);
		scanner.close();
	}
}
