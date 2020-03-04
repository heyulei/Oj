import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int eight = n/8;
        int six = 0;
        int count = eight;
        int last = 0;
        if(n%8==0){
            System.out.print(eight);
            return; 
        }
        while(count>=0){
            last= n-(8*eight);
            if(last%6 == 0){
                six = last/6;
                System.out.print(six+eight);
                return;
            }
            eight--;
            count--;
        }
        System.out.print(-1);
        return;
    }
}
