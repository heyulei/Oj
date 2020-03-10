// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.nextLine();
            String [] a = s.split(" ");
            int [] b = new int [a.length-1];
            for (int i = 0; i<a.length-1;i++){
                b[i]= Integer.parseInt(a[i]);   
            }
            int k = Integer.parseInt(a[a.length-1]);
            for (int i =0;i<b.length; i++){
                for (int j = 0;j<b.length-i-1;j++){
                    if(b[j]>b[j+1]){
                        int tmp = b[j];
                        b[j] = b[j+1];
                        b[j+1]= tmp;
                    }
                }
                
            }
            for (int i = 0;i<k;i++){
                System.out.print(b[i]);
                if(i!=k-1){
                    System.out.print(" ");
                }
            }
        }
    }
}
