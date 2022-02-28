package programs;
import java.util.Scanner;
public class countBook {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int a=sc.nextInt();
		    System.out.println(a*10);
		    t--;
		}
        sc.close();
	}
    /*
        Count the Notebooks Problem Code: NOTEBOOK
        Add problem to Todo list
        Submit
        You know that 1 kg of pulp can be used to make 1000 pages and 1 notebook consists of 100 pages.

        Suppose a notebook factory receives N kg of pulp, how many notebooks can be made from that?

        Input Format
        First line will contain T, the number of test cases. Then the test cases follow.
        Each test case contains a single integer N - the weight of the pulp the factory has (in kgs).
        Output Format
        For each test case, output the number of notebooks that can be made using N kgs of pulp.

        Constraints
        1≤T≤100
        1≤N≤100
        Sample Input 1 
        3
        1
        100
        50
        Sample Output 1 
        10
        1000
        500
        Explanation
        Test case-1: 1 kg of pulp can be used to make 1000 pages which can be used to make 10 notebooks.

        Test case-2: 100 kg of pulp can be used to make 100000 pages which can be used to make 1000 notebooks.

        https://www.codechef.com/problems/NOTEBOOK
    */
}
