class SolidRombus {
    public static void main(String ar[]){
        int a =5;
        for(int i =1 ;i<= a;i++){
            for(int j =1; j<= a-i+1; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}