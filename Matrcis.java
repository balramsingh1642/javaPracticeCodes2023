import java.util.Scanner;
public class Matrcis {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int rows , cols,search,count=0;
        System.out.println("Enter rows and columns for 2D Matrix");
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] matx = new int[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matx[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search in 2D Matrix");
            search = sc.nextInt();

            for(int i =0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(search == matx[i][j]){
                        count=1;
                        System.out.println("Location of "+search+" is in row "+ (i+1) + " in column "+ (j+1));
                    }
                }
            }
            if(count==0){
                System.out.println("Location of "+search+" is not found in this 2D Matrix ");
            }

    }
}
