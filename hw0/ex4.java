package hw0;

public class ex4 {
    public static void windowPosSum(int[] a, int n) {
      for (int i = 0; i < a.length; i++){
        if (a[i] > 0){
            for (int s = i; s < Math.min(i + n, a.length - 1); s++){
                a[i] = a[i] + a[s + 1];
            }
        }
      }
    }
  
    public static void main(String[] args) {
      int[] a = {1, 2, -3, 4, 5, 4};
      int n = 3;
      windowPosSum(a, n);
  
      // Should print 4, 8, -3, 13, 9, 4
      System.out.println(java.util.Arrays.toString(a));
    }
  }