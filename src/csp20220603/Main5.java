/*package csp20220603;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class User {
	HashSet<String> rol;
	HashSet<String> grp;

	public User() {
		rol = new HashSet<>();
		grp = new HashSet<>();
	}
}

class Role {
	HashSet<String> opl;
	HashSet<String> opt;
	HashSet<String> opn;

	public Role() {
		opl = new HashSet<>();
		opt = new HashSet<>();
		opn = new HashSet<>();
	}
}

class Group {
	HashSet<String> rol;

	public Group() {
		rol = new HashSet<>();
	}
}

public class Main5 {
	public static boolean check(User user, HashMap<String, Role> mpr, HashMap<String, Group> mpg, String opl,
			String opt, String opn) {
		for (String it : user.rol) {
			if (mpr.get(it).opl.contains("*") || mpr.get(it).opl.contains(opl))
				if (mpr.get(it).opt.contains("*") || mpr.get(it).opt.contains(opt))
					if (mpr.get(it).opn.isEmpty() || mpr.get(it).opn.contains(opn))
						return true;
		}
		for (String it : user.grp) {
			if (mpg.containsKey(it)) {
				for (String it1 : mpg.get(it).rol) {
					if (mpr.get(it1).opl.contains("*") || mpr.get(it1).opl.contains(opl))
						if (mpr.get(it1).opt.contains("*") || mpr.get(it1).opt.contains(opt))
							if (mpr.get(it1).opn.isEmpty() || mpr.get(it1).opn.contains(opn))
								return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Role> mpr = new HashMap<>();
		HashMap<String, Group> mpg = new HashMap<>();
		HashMap<String, User> mpu = new HashMap<>();

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int q = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			Role r = new Role();
			String roleName = scanner.next();
			int nv = scanner.nextInt();
			for (int j = 0; j < nv; j++) {
				r.opl.add(scanner.next());
			}
			int no = scanner.nextInt();
			for (int j = 0; j < no; j++) {
				r.opt.add(scanner.next());
			}
			int nn = scanner.nextInt();
			for (int j = 0; j < nn; j++) {
				r.opn.add(scanner.next());
			}
			mpr.put(roleName, r);
		}
		String name = null;
		for (int i = 0; i < m; i++) {
			String rname = scanner.next();
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				char ch = scanner.next().charAt(0);
				name = scanner.next();
				if (ch == 'g') {
					if (mpg.containsKey(name)) {
						mpg.get(name).rol.add(rname);
					} else {
						Group group = new Group();
						group.rol.add(rname);
						mpg.put(name, group);
					}
				} else if (ch == 'u') {
					if (mpu.containsKey(name)) {
						mpu.get(name).rol.add(rname);
					} else {
						User user = new User();
						user.rol.add(rname);
						mpu.put(name, user);
					}
				}
			}
		}
		String uname = null;
		for (int i = 0; i < q; i++) {
			ArrayList<User> help = new ArrayList<>();
			uname = scanner.next();
			int ng = scanner.nextInt();
			for (int j = 0; j < ng; j++) {
				String name1 = scanner.next();
				User user1 = new User();
				user1.grp.add(name1);
				help.add(user1);
			}
			String x = scanner.next();
			String y = scanner.next();
			String z = scanner.next();
			
			if (mpu.containsKey(uname) &&check(mpu.get(uname), mpr, mpg, x, y, z)) {
				System.out.println(1);
				continue;
			}
			int flag = 1;
			for (int j = 0; j < ng; j++) {				
				//mpu.put(uname, help.get(j));//
				if (check(mpu.get(uname), mpr, mpg, x, y, z)) {
					flag = 0;
					System.out.println(1);
					break;
				}	
			}
			if (flag == 1) {
				System.out.println(0);
			}
			mpu.get(uname).grp.clear();	
		}
		scanner.close();
	}
}*/