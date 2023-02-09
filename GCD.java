import java.util.Scanner;
class GCD {
    public static void main(String ar[]){
        int x,y,val=1,gcd=1,count;
        System.out.println("Enter two numbers to calculate GCD");
        Scanner sc  = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
            if(x>y){
                val = y;
            }
            else{
                val =x;
            }

        for(int i =2;i<=val;i++){
                if(x%i==0 && y%i==0){
                    gcd =i;
                    System.out.println("GCD TERM "+i);
                }
        }
        System.out.println("GCD of numbers is "+gcd);
    }
}