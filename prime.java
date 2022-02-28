package programs;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        boolean flag=false;
        if(n>=1){
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
                flag=true;
            }
            if(flag==true){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
            }
        }
        else{
            System.out.println(-1);
        }
        sc.close();          
    }  
}
