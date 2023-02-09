import java.util.Scanner;
class GretestNumber{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers to check Gretest");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatest(a,b);
    }
    public static void greatest(int x, int y){
        Scanner sc = new Scanner(System.in);
        int number=0;
        do{
            if(x==y){
            System.out.println("Both are Equal");
        } else if(x>y){
            System.out.println(x+ " is Gretest than "+ y);
        } else {
                System.out.println(y+ " is Gretest than "+ x);
        }
        System.out.println("Want to check Again enter 1");
        number = sc.nextInt();
        }while(true);
    }
}