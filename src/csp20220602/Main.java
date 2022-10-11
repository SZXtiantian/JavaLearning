package csp20220602;

import java.util.Scanner;
/**
 * 
* @Description csp20220602
* @author TimTim 
* @version 1.0
* @date 2022年9月23日下午11:18:02
*
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int l = scanner.nextInt();
		int s = scanner.nextInt();
		int[][] arrA = new int[n][2];
		int[][] arrB = new int[s + 1][s + 1];
		int count = 0, temp = 0;
		for (int i = 0; i < n; i++) {
			arrA[i][0] = scanner.nextInt();
			arrA[i][1] = scanner.nextInt();
		}
		for (int i = s; i >= 0; i--) {
			for (int j = 0; j <= s; j++) {
				arrB[i][j] = scanner.nextInt();
				if (arrB[i][j] == 1) {
					temp++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			int flg1 = 0, flg2 = 0;
			for (int j = 0; j < n; j++) {
				int x = arrA[j][0] - arrA[i][0], y = arrA[j][1] - arrA[i][1];
				if (x < 0 || y < 0 || x >= s + 1 || y >= s + 1 || arrA[i][0] + s > l || arrA[i][1] + s > l){
					continue;
				}
				if (arrB[x][y] == 1) {
					flg1++;
				} else if (arrB[x][y] == 0) {
					flg2++;
					break;
				}
			}
			if (flg1 == temp && flg2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
