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

	public boolean check(HashMap<String, Role> mpr, HashMap<String, Group> mpg, HashMap<String, User> mpu, String opl,
			String opt, String opn) {
		for (String it : rol) {
			if (mpr.get(it).opl.contains("*") || mpr.get(it).opl.contains(opl))
				if (mpr.get(it).opt.contains("*") || mpr.get(it).opt.contains(opt))
					if (mpr.get(it).opn.isEmpty() || mpr.get(it).opn.contains(opn))
						return true;
		}
		for (String it : grp) {
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

public class Main3 {

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
			mpr.put(roleName, r); // 角色名--->操作
		}
		for (int i = 0; i < n; i++) {
			System.out.println(mpr.get("op"));
			System.out.println(mpr.containsKey("op"));
			System.out.println(mpr.get("op").opl.contains("open"));
			System.out.println(mpr.get("op").opl.contains("door"));
			System.out.println(mpr.get("op").opt.contains("door"));
			System.out.println(mpr.get("op").opt.contains("open"));
			System.out.println(mpr.get("op").opn.contains("door"));
		}
		String name = null;
		for (int i = 0; i < m; i++) {
			String rname = scanner.next();
			int k = scanner.nextInt();
			
			
			for (int j = 0; j < k; j++) {
				char ch = scanner.next().charAt(0);//
				name = scanner.next();
				if (ch == 'g') {
					if (mpg.containsKey(name)) {
						mpg.get(name).rol.add(rname);
						Group group2 = new Group();
						group2.rol.add(rname);
						mpg.get(name).rol.;
					}else{
						Group group = new Group();
						group.rol.add(rname);
						mpg.put(name, group);
					}
					
				} else {
					if (mpu.containsKey(name)) {
						mpg.get(name).rol.add(rname);
						Group group2 = new Group();
						group2.rol.add(rname);
						mpg.get(name).rol.;
					}else{
						User user = new User();
						user.rol.add(rname);
						mpu.put(name, user);
					}
				}
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println(mpu.get("sre"));
		System.out.println(mpu.get("xiaop"));
		System.out.println(mpg.get("sre"));
		System.out.println(mpg.get("xiaop"));
		System.out.println(mpu.get("xiaop").grp.contains("op"));
		System.out.println(mpu.get("xiaop").rol.contains("op"));
		System.out.println(mpg.get("sre").rol.contains("op"));

		System.out.println("----------------------------------------------");
		
		 * for (String a : mpu.get("xiaop").) {
		 * System.out.println(mpu.get("xiaop").grp); //
		 * System.out.println(mpg.get("sre").rol.contains("op")); }
		 

		for (int i = 0; i < q; i++) {
			ArrayList<User> help = new ArrayList<>();
			String uname = scanner.next();
			int ng = scanner.nextInt();
			for (int j = 0; j < ng; j++) {
				String name1 = scanner.next();
				User user1 = new User();
				user1.grp.add(name1);
				help.add(user1);
				// mpu.put(uname, user1);
			}
			String x = scanner.next();
			String y = scanner.next();
			String z = scanner.next();

			int flag = 1;
			for (int j = 0; j < ng; j++) {
				if (mpu.get(name).check(mpr, mpg, mpu, x, y, z)) {
					flag = -1;
					System.out.println("1");
					break;
				}
				mpu.put(uname, help.get(j));
				if (mpu.get(uname).check(mpr, mpg, mpu, x, y, z)) {
					flag = 0;
					System.out.println("1");
					break;
				}
			}
			if (flag == 1) {
				System.out.println("0");
			}
			// System.out.println(mpu.get(uname).check(mpr, mpg, mpu, x, y, z));
			if (flag != -1) {
				mpu.get(uname).grp.clear();
			}
		}
		scanner.close();
	}
}*/