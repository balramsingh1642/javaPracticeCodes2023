import java.util.HashSet;

public class SubSequences {
    public static void main(String ar[]){
        String str = "abcs";
        HashSet<String> set  = new HashSet<>();
        subSequences(str,0,"",set);
    }
    public static void subSequences(String str1 , int index , String newString,HashSet<String> set){
        if(index == str1.length()){

            if(set.contains(newString)){
                return;
            }
            else {
                System.err.println(newString);
                set.add(newString);
                return;
            }
           
        }
        char currChar = str1.charAt(index);
        subSequences(str1, index+1, newString+currChar,set);

        subSequences(str1, index+1, newString,set);
    }
}
