// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer>map = new HashMap<>();
        int size = 0;
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int num = in.nextInt();
            
            int count = 1;
            size++;
            if(map.get(num)!=null){
                count = Integer.parseInt(map.get(num).toString())+1;
                
            }
            map.put(num,count);
        }
        size = size/2;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=size){
                System.out.print(entry.getKey());
                return ;
            }
            
        }
        return;
    }
}
