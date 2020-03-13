import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int []B = new int[A.length];
        
        for(int i = 0; i<A.length;i++){
            B[i]=1;
            for(int j = 0; j<A.length;j++){
                if(i!=j){
                    B[i]*=A[j];
                }
            }
        }
        return B;
    }
}
