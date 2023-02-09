import java.util.Scanner;

class PrimeNumber{
    public static void main(String ar[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        prime(n);
    }
    public static void prime(int a){
        int count =0;
        for(int i=2; i<= a/2;i++){
            if(a%i==0)
                count++;
        }
        if(a==1){
            System.out.println("1 is not a Prime Number");
            
        }
        else if(count==0){
                System.out.println("Prime Number");
        }
            else {
            System.out.println("Not a prime");
        }
    }
}