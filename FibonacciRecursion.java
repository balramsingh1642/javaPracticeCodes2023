public class FibonacciRecursion {
    public static void main(String ar[]){
        int n =10 ,a =0, b =1;

        System.out.print(a+ " "+b+" ");
        fibonacci(a,b,n-2);
    }
    public static void fibonacci(int x ,int y , int n){
        if(n==0){
            return;
        }
        int c = x + y;
        System.out.print(c+" ");
        fibonacci(y,c,n-1);
    }
}
