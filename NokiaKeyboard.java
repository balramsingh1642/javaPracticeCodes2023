public class NokiaKeyboard {
    static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String arp[]){
        String str = "123";
        keyboard(str,0,"");
    }
    public static void keyboard(String str ,int index , String combinations){
        if(index == str.length()){
            System.out.println(combinations);
            return;
        }
        char currChar = str.charAt(index);
        String mapping  = keypad[currChar - '0'];
        for(int i =0;i<mapping.length();i++){
            keyboard(str,index+1,combinations+mapping.charAt(i));
        }

    }

}
