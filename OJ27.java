import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        int n = -1;
        int a = A^B;
        int b = (A&B)<<1;
            n = b;
        while(n!=0){
            int x = a^b;
            int y = (a&b)<<1;
            a = x;
            b= y;
            n = y;
            
        }return a;
    }
}
