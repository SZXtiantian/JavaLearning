/*package csp20180903;

import java.util.ArrayList;
import java.util.Scanner;


class row{
	public String lab;
	public String id;
	public int lev;
}

public class Main {
	public static boolean isMatch(int x, row[] rows, ArrayList<String> qus){
		int t = rows[x].lev;
		int q =qus.size() -2;
		for (int j = x - 1; j > 0; j--) {
			if (rows[j].lev == t - 1) {
				if (qus.get(q).charAt(0)!='#'&&qus.get(q).equals(rows[j].lab)) {
					q--;
				}else if (qus.get(q).charAt(0)=='#'&&qus.get(q).equals(rows[j].id)) {
					q--;			
				}
				t = rows[j].lev;
				if (q < 0) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		row[] rows = new row[120];
		int n =scanner.nextInt();
		int m = scanner.nextInt();
		int cnt, mark;
		String str1;
		int tmp1, tmp2;
		String string = scanner.nextLine();
		for (int i = 1; i <= n; i++) {
			rows[i] = new row();
			tmp1 = -1;
			tmp2 = -1;
			cnt = 0;
			
			str1 = scanner.nextLine();
			int len = str1.length();
			char[] str = str1.toCharArray();
			for (int j = 0; j < len; j++) {
				if (str[j] == '.') {
					cnt++;
				}else if (str[j] == '#') {
					tmp2 = j;				
				}else if (tmp1 == -1 && str[j]!= '#') {
					tmp1 = j;
				}
			}
			rows[i].lev = cnt>>1;
			if (tmp2 == -1) {
				rows[i].id="";
				rows[i].lab = str1.substring(tmp1);					
			}else{
				rows[i].lab = str1.substring(tmp1, tmp2 - 1);
				rows[i].id = str1.substring(tmp2);
			}
			rows[i].lab.toLowerCase();						
		}
		ArrayList<String> qus = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			ans.clear();
			qus.clear();
			str1 = scanner.nextLine();
			char[] str = str1.toCharArray();
			for (int j = 0; j < str1.length();) {
				mark = j;
				while(++mark<str1.length()&&str[mark]!=' ');
				String t = str1.substring(j, mark);
				char[] tmp11 = t.toCharArray();
				if (tmp11[0]!='#')t.toLowerCase();
				qus.add(t);
				j= mark+1;
			}
			int se = qus.size();
			for(int j = 1;j <= n; j++){
				if (qus.get(se - 1).charAt(0) == '#'&&qus.get(se - 1).equals(rows[j].id)
						||qus.get(se - 1).charAt(0)!='#'&&qus.get(se - 1).equals(rows[j].lab)) {
					if (se == 1) {
						ans.add(j);
					}else if (isMatch(j, rows, qus)) {
						ans.add(j);
					}
				}
			}
			System.out.print(ans.size());
			ans.sort(null);
			for (int j = 0; j < ans.size(); j++) {
				System.out.print(" "+ans.get(j));
			}
			System.out.println();
		}
		scanner .close();
	}
}
*/