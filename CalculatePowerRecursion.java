import java.util.Scanner;
public class CalculatePowerRecursion {
    public static void main(String ar[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n and its power");
        int x = sc.nextInt();
        int pow = sc.nextInt();
        sc.close();
        System.out.println(calculatePow(x,pow));
    }

    public static int calculatePow(int n ,int pow){
        if(pow == 0) {
            return 1;
        }
        if(n == 0){
            return 1;
        }
        int res =1;
        if(pow % 2 == 0){
            return calculatePow(n,pow/2) * calculatePow(n,pow/2);
        }
        else
        {
            res = calculatePow(n,pow/2) * calculatePow(n,pow/2) ;
            res = res*n;
        }
        return res;
    }
    
}
