import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String src = in.nextLine();
            String rec = in.nextLine();
            int size = rec.length();
            int len = src.length();
            String ret = "";
            Map map = new HashMap();
            for (int i = 0; i < size; i++){
                char c = rec.charAt(i);
                map.put(c,1);
            }
            for (int i=0; i<len; i++){
                char c = src.charAt(i);
                if (map.get(c)==null){
                    
                    ret += c;
                }
            }
            System.out.print(ret);
            return;
        }
    }
}
/*
 int size = rec.length();
            int len = src.length();
            String ret = "sss";
            Map map = new HashMap();
            for (int i = 0; i < size; i++){
                char c = rec.charAt(i);
                map.put(c,1);
            }
            for (int i=0; i<len; i++){
                char c = src.charAt(i);
                if (true){
                    ret += c;
                }
            }
            System.out.print(ret);
            return;


*/
