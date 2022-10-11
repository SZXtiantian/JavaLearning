/*package csp20220603;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



class User {
	HashMap<String, Integer> grp;
	public User() {
		grp = new HashMap<>();
	}
}

class Role {
	HashMap<String, Integer> op; // 操作
	HashMap<String, Integer> type; // 资源种类
	HashMap<String, Integer> res; // 资源名称

	Role() {
		op = new HashMap<>();
		type = new HashMap<>();
		res = new HashMap<>();
	}
	public boolean check(String op1, String type1, String res1) {
		if(op.containsKey("*")||op.containsKey(op1))
			if(type.containsKey("*")||type.containsKey(type1))
				if(res.isEmpty()||res.containsKey(res1))
					return true;
		return false;
	}
}

class RoleRelated {
	HashMap<String, Integer> grp;
	public RoleRelated() {
		grp = new HashMap<>();
	}
}

public class Main {
	static int MAX_NUM = 510;

	public static void main(String[] args) {
		HashMap<String, Role> roles = new HashMap<>();
		HashMap<String, RoleRelated>gup = new HashMap<>();
		HashMap<String, User>user = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int q = scanner.nextInt();
		
		 * role[0] = new Role(); role[0].name = "12346";
		 * System.out.println(role[0].name);
		 
		for (int i = 0; i < n; i++) {
			Role r = new Role();
			String roleName = scanner.next();
			int nv = scanner.nextInt();
			for (int j = 0; j < nv; j++) {
				r.op.put(scanner.next(), 1);
			}
			int no = scanner.nextInt();
			for (int j = 0; j < no; j++) {
				r.type.put(scanner.next(), 1);
			}
			int nn = scanner.nextInt();
			for (int j = 0; j < nn; j++) {
				r.res.put(scanner.next(), 1);
			}
			roles.put(roleName, r);                             //角色名--->操作
		}
		for (int i = 0; i < n; i++) {
			System.out.println(roles.get("op"));
			System.out.println(roles.containsKey("op"));
			System.out.println(roles.get("op").op.get("open"));
			System.out.println(roles.get("op").op.get("door"));
			System.out.println(roles.get("op").type.get("door"));
			System.out.println(roles.get("op").type.get("open"));
			System.out.println(roles.get("op").res.get("door"));
		}
		for (int i = 0; i < m; i++) {
			String relRoleName = scanner.next();
			int ns = scanner.nextInt();
			for (int j = 0; j < ns; j++) {
				char strug = scanner.next().charAt(0);
				if (strug == 'u') {
					String usersName = scanner.next();
					User user1 = new User();
					user1.grp.put(relRoleName, 1);
					user.put(usersName, user1);
					//gup.put(relRoleName,usersName );             //角色名-->人名
				} else if (strug == 'g') {
					String roleRelatedName = scanner.next();
					RoleRelated user2 = new RoleRelated();
					user2.grp.put(relRoleName, 1);
					gup.put(roleRelatedName, user2); 
					//gup.put(roleRelatedName, relRoleName);      //组名-->角色名
				}
			}
		}
		System.out.println("----------------------------------------------");
		for (int i = 0; i < n; i++) {
			System.out.println(user.get("sre"));
			System.out.println(user.get("xiaop"));
			System.out.println(gup.get("sre"));
			System.out.println(gup.get("xiaop"));
			System.out.println(user.get("xiaop").grp.get("op"));
			System.out.println(gup.get("sre").grp.get("op"));
		}
		//最后把条件补上
		
		HashMap<Integer, String>mark = new HashMap<>();
		for (int i = 0; i < q; i++) {
			int flag = 0;
			String userName = scanner.next();
			int ng = scanner.nextInt();
			for (int j = 0; j < ng; j++) {
				String ngStr = scanner.next();
				mark.put(j, ngStr);
			}
			String operator = scanner.next();
			String res1 = scanner.next();
			String resName = scanner.next();
			if (roles.get(key))) {
				//查用户
				System.out.println("1");
				continue;
			}else if (condition) {
				//查用户组
				for (int k = 0; k < ng; k++) {
				
					if (condition) {
						flag = 1;
						break;
					}
				}
				if (flag == 1) {
					System.out.println("1");
					continue;
				}
			}
			System.out.println("0");
		}
		scanner.close();
	}

}
*/