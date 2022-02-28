package programs;
import java.util.Scanner;
public class oddseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=1;
        for(int i=0;i<n;i++){
            if(i>0){
                System.out.print(",");
            }
            System.out.print(t);
            t=t+2;
            sc.close();
        }
    }
}
