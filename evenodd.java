package programs;
//Finding a number if it is even or odd
/*
ex:
    I1:65849
    O1:this is odd no

    I2:5498
    o1:this is even no
*/
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("this is an even no");
        }
        else{
            System.out.println("this is an odd no");
        }
        sc.close();
    }
}
