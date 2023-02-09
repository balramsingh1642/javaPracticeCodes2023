import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String ar[]) {
        int rows , cols;
        System.out.println("Enter the rows and columns for Spriral Matrix");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][]  spiralMatrix = new int[rows][cols];

        int rowStart =0 ;
        int colsStart =0;
        int rowsEnd = rows-1;
        int colsEnd = cols-1;
        System.out.println("Enter the elements");
        for(int i =0; i< rows; i++){
            for(int j=0 ;j< cols; j++){
                spiralMatrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        while(rowStart<= rowsEnd && colsStart<= colsEnd ){
            
            // 1 row
            for(int i = colsStart; i<=colsEnd;i++){
                System.out.print(spiralMatrix[rowStart][i]+" ro1w ");
            }
            rowStart++;
           
            // 2
            for(int j = rowStart; j<=rowsEnd;j++){
                System.out.print(spiralMatrix[j][colsEnd]+ " & ");
            }
            colsEnd--;
            
            // 3
           if(rowStart< rowsEnd){
            for(int k = colsEnd ;k >= colsStart;k--){
                System.out.print(spiralMatrix[rowsEnd][k]+" % ");
            }
            rowsEnd--;
           }
            
            // 4
            if(colsStart<colsEnd){
                for(int m =rowsEnd; m>= rowStart; m--){
                    System.out.print(spiralMatrix[m][colsStart]+" ");
                }
                colsStart++;
            }
            
            System.out.println();
        }

    }    
}
