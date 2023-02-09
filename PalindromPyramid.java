class PalindromPyramid{
    public static void main(String ar[]){
        int a =10;
        for(int i =1; i<= a;i++){

            for(int j =1; j<a+1-i;j++){
                System.out.print(" ");
            }
                int k = 1;
            for(int j=1;j<=i;j++){
                System.out.print(k+i-j);
            }
            for(int j=1;j<i;j++){
                k=1;
                System.out.print(k+j);
            }
            System.out.println();
        }
    }
}