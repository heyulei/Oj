// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            /*if(((a+c)%2)!=0||((d+b)%2)!=0||((d-b)%2)!=0){
                System.out.print("NO");
                return;
            }*/
            int A = (a+c)/2;
            int B = (d+b)/2;
            int C = (d-b)/2;
            
            if(b+d>=0&&a+c>=0&&a+b+d>=0&&d-b>=0&&d+b+a==C&&a+c==2*A&&d+b==2*B&&d-b==2*C&&A+B==C&&c-a==2*B){
                
                
                    System.out.print(A+" "+B+" "+C);
                return;
                
            }
        else{
                System.out.print("No");
                return;
               /* A = (a+c)/2;
                B = (d+b)/2;
                C = (d-b)/2;
                A = 2;
                B = 1;
                C = 3;
                if(A+B==C){
                    System.out.print(A+" "+B+" "+C);
                return;
                }else{
                    System.out.print("No");
                    return;
                    */
                }
           
            
        }
    }
}
