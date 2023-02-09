import java.util.Scanner;
public class CountOneInNumber {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = num,count  =0;
        while(t>0){
            if(t%2!=0){
                count++;
            }
            t/=2;
        }
        sc.close();
        System.out.println("Count of 1s in a number are "+ count);
    }
}
