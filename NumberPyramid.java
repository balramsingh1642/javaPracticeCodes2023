class NumberPyramid{
    public static void main(String ar[]){
        int a =5;
        for(int i =1 ;i<= 5 ;i++){

            for(int k =1; k<=a-i;k++){
                System.out.print(" ");
            }

            for(int j = 1 ;j<=i;j++){
                    System.out.print(i+" ");
            }
            System.out.println()
;        }

    }
}