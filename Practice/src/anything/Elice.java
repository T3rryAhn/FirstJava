package anything;


import java.util.*;


public class Elice {
    public static void solve(int [] n) {
        /* 여기에 코드를 작성해 주세요 */
        
        double avg = 0;
        for(int i = 0; i < n.length; i++){
            avg += n[i];
        }
        avg /= n.length;
        System.out.printf("%.1f\n", avg);
        //System.out.println(avg);

        for(int i = 0; i < n.length; i++){
            if(n[i] > avg){
                System.out.printf("%d ", n[i]);
            }
        }
    }
    
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
    
        String str = scan.nextLine();
        String strs[] = str.split("\\s");
        int n[] = new int[strs.length];
        
        for(int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(strs[i]);
        }
        
        solve(n);
	}
}