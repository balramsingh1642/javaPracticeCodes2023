public class StringPurmutaion {
    public static void main(String ar[]){
        String str ="abc";
        stringPurmutaion(str,"");
    }
    public static void stringPurmutaion(String str , String permutaion){
            if(str.length() == 0){
                System.out.println(permutaion);
                return;
            }

        for(int i =0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            stringPurmutaion(newString, permutaion+currChar);
        }
    }
}
