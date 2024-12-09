package hw0;

public class Ex2and3 {
    public static int max(int[] m) {
        int res = m[0];
        for (int i = 1; i < m.length; i++){
            if (m[i] > res){
                res = m[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       int ans = max(numbers);
       System.out.println(ans);      
    }
 }