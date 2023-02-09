import java.util.*;
class Calc {

    public static void main(String arg[]){

    int operation, val1,val2,res =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the operation Type: \n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for division\n5 for Remainder\n");
    operation = sc.nextInt();
     System.out.println("enter the two values for the Operation \n");
    val1 = sc.nextInt();
    val2 = sc.nextInt();
    sc.close();
   

    switch(operation) {

        case 1: {
            res = val1 +val2;
             System.out.println("Output from operation "+operation + " is "+ res);
            break;
        }
        case 2: {
            res = val1 - val2;
             System.out.println("Output from operation "+operation + " is "+ res);
            break;
        }
        case 3: {
            res = val1 * val2 ;
             System.out.println("Output from operation "+operation + " is "+ res);
            break;
        }
        case 4 :{
            res = val1 / val2;
             System.out.println("Output from operation "+operation + " is "+ res);
            break;
        }
        case 5: {
            res = val1 % val2 ;
             System.out.println("Output from operation "+operation + " is "+ res);
            break;
        }
        default :{
            System.out.println("Wrong opreation selected");
        }
    }

   
    }

}