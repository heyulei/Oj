// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            String ret = ret(n);
            System.out.print(ret);
        }
    }
    private static String ret (int n ){
        if (n<10){
            //System.out.print(n+"");
            return n+"";
        }
       // System.out.print(n%10+"");
        return n%10+""+ret(n/10);
    }
}
