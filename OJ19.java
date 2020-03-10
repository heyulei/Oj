// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            List a = new ArrayList();

            int count = 0;
            
            
            for (int i = 0;i<n;i++){
                a.add(1);
               
            }
            int num = 0;
            int size = a.size();
            boolean b = true;
            while(b){
                for (int i = 0; i<size;i++){
                    if(Integer.parseInt(a.get(i).toString())==1){
                        count++;
                        num++;
                        if(count%3==0){
                       // System.out.print(i);
                        a.set(i,0);
                        }
                    }
                    
                }
                if(num == 1){
                     b= false;
                }
                num = 0;
                
            }
            for (int i = 0; i<size;i++){
                         if(Integer.parseInt(a.get(i).toString())==1){
                             System.out.println(i);
                             //return;
                         }
                     }
           //
        }
    }
}
