public class StringreverseRecurs {
    
    public static void main(String ar[]){
        String val = "Never Settle";
        stringreverse(val,val.length()-1);
    }
    public static void stringreverse(String str , int index){
        if(index == 0){
            System.out.print(str.charAt(index)+" ");
            return;
        }
        System.out.print(str.charAt(index)+" ");
        stringreverse(str,index-1);
        
    }
}
