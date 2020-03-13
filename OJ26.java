// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            long n = in.nextInt();
            long num = n;
            int []arr = new int [10];
            int count =0;
            while(num/10!=0){
                count++;
                arr[(int)num%10]++;
                num/=10;
            }
            arr[(int)num]++;
            count++;
            for (int i = 0; i <10; i++){
                if(arr[i]!=0){
                    System.out.println(i+":"+arr[i]);
                }
                
            }
        }
        return ;
    }
}
