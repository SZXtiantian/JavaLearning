package csp20180903;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
* @Description
* @author TimTim Email:754595995@qq.com
* @version
* @date 2022年10月20日下午2:29:21
*
 */
class Obj{
	int a;

	public Obj(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
/**
 * 
* @Description
* @author TimTim Email:754595995@qq.com
* @version
* @date 2022年10月20日下午2:29:15
*
 */
class Row{
	public String label;
	public String id;
	public int level;
}
/**
 * 
* @Description 注意大小写敏感
* @author TimTim Email:754595995@qq.com
* @version 2.0
* @date 2022年10月20日下午1:35:58
*
 */
public class Main3 {
	public static boolean isMatch(Row[] rows, Obj begin, Obj cnt, String s){
		for (int i = begin.getA(); i >= 1; i--) {
			if (rows[i].level < cnt.getA()) {
				cnt.setA(rows[i].level);
				begin.setA(i);
				if (s.equals(rows[i].label)||s.equals(rows[i].id) ) {
					return true;
				}
			}
		}
		return false;
	}
	static int t = 2;
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		Row[] rows = new Row[128];
		int n =scanner.nextInt();
		int m = scanner.nextInt();
		int count;
		String str1;
		int temp1, temp2;
		scanner.nextLine();
		for (int i = 1; i <= n; i++) {
			rows[i] = new Row();
			temp1 = -1;
			temp2 = -1;
			count = 0;		
			str1 = scanner.nextLine();
			int length = str1.length();
			char[] str = str1.toCharArray();
			for (int j = 0; j < length; j++) {
				if (str[j] == '.') {
					count++;
				}else if (temp1 == -1 && str[j]!= '#') {
					temp1 = j;
				}else if (str[j] == '#') {
					temp2 = j;				
				}
				rows[i].level = count;
			}
			
			if (temp2 == -1) {
				rows[i].id="";
				rows[i].label = str1.substring(temp1);					
			}else{
				rows[i].label = str1.substring(temp1, temp2 - 1);
				rows[i].id = str1.substring(temp2);
			}
			rows[i].label = rows[i].label.toLowerCase();						
		}
		
		for (int i = 0; i < m; i++) {
			ArrayList<String> ask = new ArrayList<>();
			ArrayList<Integer> ans = new ArrayList<>();
			str1 = scanner.nextLine();
			String[] s = str1.split(" ");
			for (int j = 0; j < s.length; j++) {
				if(s[j].charAt(0) != '#'){
					s[j] = s[j].toLowerCase();
				}
					
				ask.add(s[j]);
			}

			int l = ask.size(), k;
			for(int j = 1;j <= n; j++){
				if (ask.get(l - 1).equals(rows[j].id)||ask.get(l - 1).equals(rows[j].label)) {					
					Obj cnt11 = new Obj(rows[j].level);
					Obj begn  = new Obj(j);
					for (k = l - t; k >= 0; k--) {
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
/*package csp20180903;

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
}*/
