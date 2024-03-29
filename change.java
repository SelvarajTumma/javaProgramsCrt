package programs;
import java.util.Scanner;
public class change {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int m=sc.nextInt();
		    System.out.println(100-m);
		    t--;
		}
        sc.close();
	}
    /*
        Chef went shopping and bought items worth X rupees (1≤X≤100). Unfortunately, Chef only has a single 100 rupees note.

        Since Chef is weak at maths, can you help Chef in calculating what money he should get back after paying 100 rupees for those items?

        Input Format
        First line will contain T, the number of test cases. Then the test cases follow.
        Each test case consists of a single line containing an integer X, the total price of items Chef purchased.
        Output Format
        For each test case, output in a single line the money Chef has to receive back.

        Constraints
        1≤T≤100
        1≤X≤100
        Sample Input 1 
        3
        1
        25
        100
        Sample Output 1 
        99
        75
        0
        Explanation
        Test case-1: Since chef paid 100 rupees for items worth 1 rupee. He should get back 99 rupees.

        Test case-2: Since chef paid 100 rupees for items worth 25 rupees. He should get back 75 rupees.

        https://www.codechef.com/problems/SHOPCHANGE
    */
}
