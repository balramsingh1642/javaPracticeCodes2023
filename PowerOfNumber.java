import java.util.Scanner;
class PowerOfNumber{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and its power ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        power(x,y);
    }
    public static void power(int a, int b){
        int powerC =1;
        for(int i=1;i<=b;i++){
           powerC *= a;
        }
        System.out.println("power of "+a+" is "+ powerC);
    }
}