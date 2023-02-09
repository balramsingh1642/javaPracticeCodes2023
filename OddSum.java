import java.util.Scanner;
class OddSum{
    
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(),sum=0;
        for(int i=1;i<=t;i++){
                if(i%2!=0){
                    sum+= i;
                }
        }
        System.out.println("Sum of all Odd from 1 to "+t+" is "+sum);
    }
}