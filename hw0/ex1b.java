package hw0;

public class ex1b {
    public static void DrawTriangle(int n){
        for(int i = 1; i <= n; i++){
            String ans = "*".repeat(i);
            System.out.println(ans);
        }
    }
    public static void main(String[] args){
        DrawTriangle(10);
    }
    
}
