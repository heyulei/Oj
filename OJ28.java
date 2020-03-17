// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    static int count = 100000;
        static int n = -1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int ret = help(a);
            if(n==-1){
                System.out.print(-1);
                return;
            }
            n = 100000-n;
            System.out.print(n);
        }
    }
    private static int help(int a){
        int x = a*4+3;
        int y = a*8+7;
        count--;
        if((x%1000000007)==0||(y%1000000007)==0){
            if(n<count){
                n = count;
            }
            return count;
        }
        if(count == 0||count<n){
            return count;
        }
        int m = help(x);
        int n = help(y);
        count++;
        return m>n?m:n;
    }
}
