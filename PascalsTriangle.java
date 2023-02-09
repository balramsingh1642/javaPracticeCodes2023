class PascalsTriangle{
    public static void main(String ar[]){
        int a=5,sum=0; 
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                sum = 1;
                System.out.print(sum);

            }
            System.out.println();
        }
    }
}