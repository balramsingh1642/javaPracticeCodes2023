import java.util.Scanner;
public class RecursionSum {
    public static void main(String sr[]){
        // calculate then sum of Natural numbers from 1 to n
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the staring and ending point to calculate sum ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum =0;
        sc.close();
        calculateSum(start, end,sum);
    }

    public static void calculateSum(int start, int end , int s){
        if(start == end){ // base case
            System.out.println("Sum of all natural numbers from "+start+" to end "+ end + " is: "+ (s+start));
            return;
        }
            s = s+start;
            calculateSum(++start,end, s);
            System.out.println("Recursion Iteration "+ start);
    }
}
