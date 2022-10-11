package csp20220302;
import java.util.Scanner;
/**
 * 
* @Description 20220302
* @author TimTim 
* @version
* @date 2022年9月25日上午1:37:13
*  差分数组加前缀和
 */
public class Main {
	static int MAXNUM = 400000;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arr = new int[MAXNUM];
		for (int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			int c = scanner.nextInt();
			if (t - c  + 1 <= 1) {
				arr[0]++;
			} else {
				arr[t - c  + 1]++;
			}
			arr[t + 1]--;
		}
		for (int i = 1; i < arr.length; i++) {
			arr[i] +=arr[i - 1];
		}
		for (int i = 0; i < m; i++) {
			System.out.println(arr[scanner.nextInt() + k]);
		}
		scanner.close();
	}
}
