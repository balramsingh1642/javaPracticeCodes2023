import java.util.*;
public class PowerChecker {
    public static void main(String an[]){
        int number,count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check is is power of 2 or not");
        number = sc.nextInt();
        for(int i =2 ;i<= number;i=i+2){
            if(number % i == 0)
           {
            count =0;
            number= number/2;
           }
            else {
                count =1;
                number= number/2;
            }
        }

        

        if(count == 0){
            System.out.println("number is a power of 2");
        } else {
            System.out.println("number is not a power of 2");
        }
       
    }
}
