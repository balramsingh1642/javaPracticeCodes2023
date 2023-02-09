import java.util.Scanner;

class Factorial {
    
    public static void main(String ar[]){
        int n;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Factorial value\n");

        n = sc.nextInt();
        factorial(n); 
    }
    public static void factorial(int fact){
       int res = fact,n=fact;
        if(fact<=1){
            System.out.println("Factorial of- "+fact+" is 1");
            
        }
        else{
            while(n>1){             
                    res  *= (--n);
            }
        System.out.println("Factorial of "+fact+" is "+res);
        
    }
    }
    
}