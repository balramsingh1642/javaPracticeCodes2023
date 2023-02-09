import java.util.Scanner;
class CircleCircum{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of A Circle");
        float r = sc.nextFloat();
        circum(r); 
         System.out.println("Enter Age to check Voting Eligibility");
        int age = sc.nextInt();
        sc.close();
        eligibilityCheck(age);
    }
    public static void circum(float x){
        System.out.println(2*3.14*x);
    }
    public static void eligibilityCheck(int x){
        if(x>18){
            System.out.println("You are Eligible for vote");
        } else {
            System.out.println("You are Not Eligible for vote");
        }
    }
}