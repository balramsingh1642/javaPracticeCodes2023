import java.util.Scanner;
import java.util.Scanner;
public class Factorialrecusrion {
    public static void main(String are[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial Number");
        int n = sc.nextInt();
       int res = factorial(n,1);
        sc.close();
        System.out.println("Factorial value is "+ res);
    }
    public static int factorial(int n,int res){
            if(n==1||n ==0){
                return 1;
            }
          res = n* factorial(n-1 ,res);
        return res;
    }
}
