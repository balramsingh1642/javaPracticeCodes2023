import java.util.Scanner;

public class NumberConverter {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();
       String a = decimalToBinary(num);
       binartToDecimal(a);
       
    }
    public static String decimalToBinary(int n){
        int t = n;
        String res ="";
        while(t>0){
            int rem = t%2;
            res = res+rem;
            t/=2;
        }
        String[] rev = res.split("");
        String newResult = "";
        for(int i=0;i< rev.length;i++){
                newResult += rev[rev.length-i-1];
        }
        System.out.println("Decimal to Binary of a "+ n + " is "+ newResult);
        return newResult;
    }
    public static void binartToDecimal(String str){
        int res = 0;
        String s[] = str.split("");
        for(int i=0;i< s.length;i++){
             res += Integer.parseInt(s[s.length-i-1])*(Math.pow(2, i));
        }
        System.out.println(res);
    }
   
}
