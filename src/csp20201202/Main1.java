package csp20201202;

import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int[] arrA = new int[m];
		int[] arrB = new int[m];
		int[] arrC = new int[100000001];
		ArrayList<Integer>list = new ArrayList<>(m);
		int[]arrF= new int[100000001];
		int max = 0, maxnum = 0, flag = 0, flag1 = 0, flag2 = 0;
		for (int i = 0; i < m; i++) {
			arrA[i] = scanner.nextInt();
			arrB[i] = scanner.nextInt();
			if (i > 0) {
				for (int j = i - 1; j >= 0 && arrA[j] > arrA[j + 1]; j--) {
					int temp = arrA[j];
					arrA[j] = arrA[j + 1];
					arrA[j + 1] = temp;
					temp = arrB[j];
					arrB[j] = arrB[j + 1];
					arrB[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			if(arrF[arrA[i]]==0){
				list.add(arrA[i]);
			}
			if (i > 0 && arrA[i] == arrA[i - 1] &&arrF[arrA[i]]<2) {
				if(flag1 == 0&& arrB[i]!= arrB[i -1]){
					arrF[arrA[i]]++;
					flag1++;
				}else if (flag2 == 0&& arrB[i]!= arrB[i -1]){
					arrF[arrA[i]]++;
					flag2++;
				}		
			}else if (i > 0 &&arrA[i] != arrA[i - 1]) {
				arrF[arrA[i]]++;
				flag1 = 0;
				flag2 = 0;
			}else if (i ==0) {
				arrF[arrA[i]]++;
			}
			if (i > 0&& arrC[arrA[i]] == 0) {
				arrC[arrA[i]]+=flag;
				flag = 0;
			}
			if (arrB[i] == 0&&arrF[i]< 2) {
				flag ++;
			}
			if(arrF[arrA[i]]==0){
				list.add(arrA[i]);
			}		
		}
		list.sort(null);
		for (int i = arrB.length - 2; i >= 0; i--) {
			arrB[i] = arrB[i + 1] + arrB[i];
		}
		for (int i = 1; i < list.size(); i++) {		
			arrC[list.get(i)] = arrC[list.get(i - 1)] + arrC[list.get(i)];
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
