package csp20220302;
import java.util.Scanner;
/**
 * 
* @Description
* @author TimTim 
* @version
* @date 2022年9月25日上午1:36:32
*  超时！！！
 */
public class Main1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = scanner.nextInt();
			int c = scanner.nextInt();
			arrB[i] = arrA[i] - c;
		}
		while (m-- != 0) {
			int m1 = scanner.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (k + m1 <= arrA[i] && arrB[i] < k + m1) {
					count++;
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}
}
