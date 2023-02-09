class HalfPyramid{
    public static void main(String ar[]){
        int n =5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("======------------>");


        // Inverted Half Pyramind 
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i+1;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}