import java.util.Scanner;
class Counter{
    public static void main(String ar[]){
        counter();
    }

    public static void counter(){
        Scanner sc = new Scanner(System.in);
        int countP=0,countZ=0,countN=0,input;
        int t;
        do{
            System.out.println("Enter your Choice Numbers +ve or -ve and get the counters");
            input = sc.nextInt();
            if(input>=1){
                countP++;
                } else if(input==0){
                    countZ++;             
               } else {
                countN++;
               }
            System.out.println("Want to add more values enter '1' ");
             t = sc.nextInt();
        }while(t == 1);
        sc.close();
        System.out.println("Total count of input Values are ");
        System.out.println("Positive counts "+countP);
        System.out.println("Negative counts "+countN);
        System.out.println("Zero Number counts "+countZ);
    }
}