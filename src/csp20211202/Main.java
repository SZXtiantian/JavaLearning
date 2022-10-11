package csp20211202;

import java.util.Scanner;
/**
 * 
* @Description csp20211202
* @author TimTim 
* @version 1.0
* @date 2022年9月25日上午1:26:41
*  一定要加速不然过不了
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int N = scanner.nextInt();
		int r = N / (n + 1);
		long sum = 0;
		long[] arrF = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			arrF[i] = scanner.nextInt();
		}
		int j = 0;
		for (int m = 0; m < N; m++) {
			if (j + 1 <= n && m % r == 0 && m + r - 1 < arrF[j + 1]) {
				sum += (Math.abs(j - m / r) * r);
				m+=(r-1);
			} else {
				sum += (Math.abs(j - m / r));
			}
			if (j + 1 <= n && m + 1 == arrF[j + 1]) {
				j++;
			}
		}
		System.out.println(sum);
		scanner.close();
	}
}
