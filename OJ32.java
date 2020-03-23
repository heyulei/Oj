// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int a = 10*30;
        long c = 1 ;
            long b = 1;
            for (int i =0 ;i<30-1;i++){
                c*=2;
                b +=c;
            }
            System.out.print(a+" ");
            System.out.print(b);

        
    }
}
