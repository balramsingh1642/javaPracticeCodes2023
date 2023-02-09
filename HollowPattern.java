class HollowPattern {
    public static void main(String ar[]){
        
        for(int a =1 ;a<=5;a++){
            for(int b=1;b<=5;b++){
                if(a==1||b==1||a==5||b==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}