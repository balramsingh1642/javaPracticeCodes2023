class HollowButterfly{
    public static void main(String ar[]){
        int n =5;
        for(int i =1;i<=n;i++){
            
            for(int j =1; j<=i;j++){
                if(j==i|j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int  k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
           for(int j =1; j<=i;j++){
                if(j==i|j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i =n;i>=1;i--){
            
            for(int j =1; j<=i;j++){
                if(j==i|j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int  k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
           for(int j =1; j<=i;j++){
                if(j==i|j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}