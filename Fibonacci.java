import java.util.Scanner;
class Fibonacci{
    public static void main(String ar[]){
        int n,f=0,sec=1,term=0;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Fibonacci series term");
            n= sc.nextInt();
            for(int i=0;i<=n;i++){
                 term = f+sec;
                 System.out.print(term+ " ");
                 f = sec;
                 sec = term;

            }
    }
}