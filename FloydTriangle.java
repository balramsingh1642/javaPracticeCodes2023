class FloydTriangle{
    public static void main(String ar[]){
        int a=5,k=1;
        for(int i =1 ;i<= a;i++){
            for(int j =1;j<= i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}