// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.nextLine();
            int n = in.nextInt();
            int len = s.length();
            int count = 0;
            int prev = 0;
            String ret = "";
            while (count<len){
                char c = s.charAt(count);
                if(c=='C'||c=='G'){
                    int co = count;
                    int nu = 1;
                    String tempRet =c+"";
                    int cur = 1;
                    while(++co<len&&nu++<n){
                        char tem = s.charAt(co);
                        tempRet+=tem;
                        if(tem=='C'||tem=='G'){
                            cur++;
                        }
                    }
                    if(cur==n){
                        System.out.print(tempRet);
                        return ;
                    }
                    if(cur>prev){
                        ret = tempRet;
                        prev = cur;
                    }
                }
                count++;
            }
                   System.out.print(ret);

            return ;
        }
    }
}
