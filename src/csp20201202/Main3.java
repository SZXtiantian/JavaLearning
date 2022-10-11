package csp20201202;

import java.util.*;

public class Main3 {

    static class Pair{
        public int val;
        public int flag;
        public Pair(int val, int flag){
            this.val = val; this.flag = flag;
        }
    }
 
    static class Comporator implements Comparator<Pair>{
    	@Override
        public int compare(Pair o1, Pair o2) {
            if(o1.val < o2.val) return -1;
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, a, b;
        n = scanner.nextInt();
        List<Pair> list = new ArrayList<>();
        int num1 = 0;
        for(i = 0; i < n; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(b != 0) num1++; 
            list.add(new Pair(a, b));
        }
        list.sort(new Comporator());
        int ans = list.get(0).val;
        int r0 = 0, r1 = num1;
        int pre = list.get(0).val;
        int max = r1;
        for(i = 1; i < n; i++){
            if(list.get(i - 1).flag == 0){
                r0++;
            }else{
                r1--;
            }
            if(r0 + r1 >= max && list.get(i).val != pre){
                max = r0 + r1;
                ans = list.get(i).val;
            }
            pre = list.get(i).val;
        }
        System.out.println(ans);
        scanner.close();
    }
}
