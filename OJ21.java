// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int num = stepn(n);
            int ret = ret(num);
            System.out.print(ret);
        }
    }
    private static int stepn(int n ){
            if (n==1){
                return 1;
            }
            return n*stepn(n-1);
        }
     private static int ret(int n ){
         if (n<10){
             if(n == 0){
                 return 1;
             }
             return 0;
         }
         if(n%10 == 0){
             return 1+ret(n/10);
         }
             return 0;
         
         
     }
}
