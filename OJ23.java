// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int ret = fib(n);
            System.out.print(ret);
        }
    }
    private static int fib (int n){
        if (n <=3){
            return 0;
        }
        int num = n+3;
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i<num; i++){
            if(c>=n&&b<=n){
                return (c-n)<(n-b)?(c-n):(n-b);
            }
            a = b;
            b = c;
            c = a+b;
        }
        return -1;
    }
}
