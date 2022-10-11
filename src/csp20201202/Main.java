package csp20201202;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int[] arrA = new int[m];
		int[] arrB = new int[m];
		int[] arrC = new int[100000001];
		ArrayList<Integer>list = new ArrayList<>(m);
		int[]arrF= new int[100000001];
		int max = 0, maxnum = 0,flag = 0;
		for (int i = 0; i < m; i++) {
			arrA[i] = scanner.nextInt();
			arrB[i] = scanner.nextInt();
			if (i > 0&& arrC[arrA[i]] == 0) {
				arrC[arrA[i]]+=flag;
				flag = 0;
			}
			if (arrB[i] == 0) {
				flag ++;
			}
			/*if (arrB[i] == 0&&arrC[arrA[i] + 1]==0) {
				arrC[arrA[i] + 1]++;			
			}*/
			if(arrF[arrA[i]]==0){
				list.add(arrA[i]);
			}
			arrF[arrA[i]]++;
		}
		list.sort(null);
		for (int i = arrB.length - 2; i >= 0; i--) {
			arrB[i] = arrB[i + 1] + arrB[i];
		}
		for (int i = 1; i < list.size(); i++) {			
			arrC[list.get(i)] = arrC[list.get(i - 1)] + arrC[list.get(i)];
			System.out.println(arrC[list.get(i)]);
		}
		for (int i = 0; i < m; i++) {
			arrB[i] += arrC[arrA[i]];
			if (maxnum < arrB[i]) {
				maxnum = arrB[i];
				max = i;
			} else if (maxnum == arrB[i]) {
				max = arrA[max] < arrA[i] ? i : max;
			}
		}
		System.out.println(arrA[max]);
		scanner.close();
	}
}
