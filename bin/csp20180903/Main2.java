/*package csp20180903;

import java.util.ArrayList;
import java.util.Scanner;


class obj{
	int a;

	public obj(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
class row{
	public String lab;
	public String id;
	public int lev;
}
*//**
 * 
* @Description 注意大小写敏感
* @author TimTim Email:754595995@qq.com
* @version 2.0
* @date 2022年10月20日下午1:35:58
*
 *//*
public class Main2 {
	public static boolean isMatch(row[] rows, obj begn, obj cnt, String s){
		for (int i = begn.getA(); i >= 1; i--) {
			if (rows[i].lev < cnt.getA()) {
				cnt.setA(rows[i].lev);
				begn.setA(i);
				if (s.equals(rows[i].lab)||s.equals(rows[i].id) ) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		row[] rows = new row[1000];
		int n =scanner.nextInt();
		int m = scanner.nextInt();
		int cnt;
		String str1;
		int tmp1, tmp2;
		scanner.nextLine();
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
				}else if (tmp1 == -1 && str[j]!= '#') {
					tmp1 = j;
				}else if (str[j] == '#') {
					tmp2 = j;				
				}
				rows[i].lev = cnt;
			}
			
			if (tmp2 == -1) {
				rows[i].id="";
				rows[i].lab = str1.substring(tmp1);					
			}else{
				rows[i].lab = str1.substring(tmp1, tmp2 - 1);
				rows[i].id = str1.substring(tmp2);
			}
			rows[i].lab = rows[i].lab.toLowerCase();						
		}
		
		for (int i = 0; i < m; i++) {
			ArrayList<String> ask = new ArrayList<>();
			ArrayList<Integer> ans = new ArrayList<>();
			str1 = scanner.nextLine();
			String[] s = str1.split(" ");
			for (int j = 0; j < s.length; j++) {
				if(s[j].charAt(0) != '#')
					s[j] = s[j].toLowerCase();
				ask.add(s[j]);
			}

			int se = ask.size();
			for(int j = 1;j <= n; j++){
				if (ask.get(se - 1).equals(rows[j].id)||ask.get(se - 1).equals(rows[j].lab)) {
					int k = se - 2;
					obj cnt11 = new obj(rows[j].lev);
					obj begn  = new obj(j);
					for (; k >= 0; k--) {
						if (!isMatch(rows, begn, cnt11, ask.get(k))) {
							break;						
						}
					}
					if (k < 0) {
						ans.add(j);
					}
				}
			}
			System.out.print(ans.size());
			for (int j = 0; j < ans.size(); j++) {
				System.out.print(" "+ans.get(j));
			}
			System.out.println();
		}
		scanner.close();
	}
}
package csp20180903;

import java.util.LinkedList;

public class test {
	public static void main(String[] args) {
		LinkedList<Integer>list = new LinkedList<>();
		for (int i = 18; i > 0; i--) {
			list.addLast(i);
		}
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
	}
}
*/