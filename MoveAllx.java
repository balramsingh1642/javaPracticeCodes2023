public class MoveAllx {
    static int count =0;
    public static void main(String ar[]){
        String str = "Axbxgfxtx";
        String newStr ="";
        moveAllx(str,0,newStr,'x');
    }
    public static void moveAllx(String st, int indx, String newStr,char search){
        if(st.length() == indx){
            for(int i =0 ;i<count;i++){
                newStr+='x';
            }
    
            System.out.println(newStr);
                return;
        }
        char c = st.charAt(indx);
        if(c== search){
            count++;
            moveAllx(st, indx+1, newStr, search);
        }
        else {
            newStr+=c;
            moveAllx(st, indx+1, newStr, search);
        }

        

    }
}