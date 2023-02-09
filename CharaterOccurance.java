public class CharaterOccurance {
    public static  int first = -1;
        public static int last = -1;
    public static void main(String arp[]){
        String  str ="sjdnaanjdekas";
        char search = 'a';

        occuranceFinder(str,0,search);
    }
    public static void occuranceFinder(String s , int index, char search){
        
        if(index == s.length()){
            System.out.println("First is "+ first + " last is " +last);
            return;
        }
                char oneChar = s.charAt(index);
                if(oneChar == search){
                    if(first == -1){
                        first = index;
                    }
                    else {
                        last = index;
                    }
                }
                occuranceFinder(s, index+1, search);


    }
}
