import java.util.*;
class DoWhileLoop {
    public static void main(String ar[]){
        int input;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("if you want to print this line again Enter 1 else 0\n");
            input = sc.nextInt();
        } while(input == 1);
        System.out.println("Good Bye");    sc.close();
        
    }
   
}