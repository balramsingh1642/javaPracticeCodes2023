import java.util.Scanner;
class AvarageNumber{
    public static void main(String ar[]){
        int a,b,c;
        System.out.println("Enter 3 Numbers\n");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        avarage(a,b,c);
    }
    public static void avarage(int x, int y, int z){
        System.out.println("Avarage is "+ (x+y+z)/3);
    }
}