// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int t = in.nextInt();//T组循环
            for(int i=0; i<t; i++){
                int n = in.nextInt();//n张牌
                //System.out.print("n ="+n+"       ");
                int k = in.nextInt();//k次洗牌循环；
               // System.out.print("k ="+k+"       ");

                ArrayList a1 = new ArrayList();   
                ArrayList a2 = new ArrayList();
                ArrayList a3 = new ArrayList();

                for(int j=0; j<n;j++){
                    a1.add(in.nextInt());
                    
                }
                for(int j=0; j<n;j++){
                    a2.add(in.nextInt());
                }
                for(int j = 0; j<k;j++){
                    for(int l =0;l<n;l++){
                        int numa2=Integer.parseInt(a2.get(l).toString());
                        int numa1=Integer.parseInt(a1.get(l).toString());
                        if(j==0){
                            a3.add(numa1);
                            a3.add(numa2);
                        }else{
                            a3.set(2*l,numa1);
                        a3.set(2*l+1,numa2);
                        }
                    }
                   
                    for(int l = 0;l<n;l++){
                        int num1=Integer.parseInt(a3.get(l).toString());
                        int num2=Integer.parseInt(a3.get(n+l).toString());

                        a1.set(l,num1);
                        a2.set(l,num2);
                    }
                }
                for(int j = 0;j<2*n;j++){
                    int num=Integer.parseInt(a3.get(j).toString());
                    System.out.print(num);
                    if(j!=2*n-1||i!=t-1){
                        System.out.print(" ");
                    }
                }
            }
                        System.out.println();

                    
        }
        
    }
}
