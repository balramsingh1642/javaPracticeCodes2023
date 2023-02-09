public class RemoveDuplicate {
    static int count = 0;
    public static void main(String ar[]){
        String str ="asdfghgfdsasdfghgfdsa";
        removeDuplicate(str,0,"");
    }
    public static void removeDuplicate(String st, int index , String newStr1){

        if(index == st.length()){
            System.out.println("Unique String is "+ newStr1);
            return;
        }
        char c = st.charAt(index);
        if(newStr1.indexOf(c)<0){
                newStr1 += c;
        }
        removeDuplicate(st,index+1,newStr1);
    }
}
