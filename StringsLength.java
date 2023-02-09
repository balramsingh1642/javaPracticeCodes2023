import java.util.Scanner;
public class StringsLength {
    public static void main(String[] args) {
     Scanner sc  =  new Scanner(System.in);
     System.out.println("Enter your full name and get the total character length");
    //  String name = sc.nextLine();
     StringBuilder sb = new StringBuilder("Namans");
     for(int i =0;i<sb.length()/2;i++){
        char f = sb.charAt(i);
        char b = sb.charAt(sb.length()-i-1);
        sb.setCharAt(i, b);
        sb.setCharAt(sb.length()-i-1,f);
     }

     sb.delete(0, 1);
     sb.append(" tr");
     System.out.println("Reverse of String is "+ sb);
        

    //  System.out.println("Ennter an email Address");
    //     String email = sc.next();
     sc.close();
    //  System.out.println("total length of name is "+ name.length());   

    //  System.out.println(name.replace("balram", "krishna"));

    //  System.out.println("Username from email is "+ email.substring(0, email.indexOf('@')));   

    }
}
