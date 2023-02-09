public class CountPaths {
    public static void main(String ar[]){
        int n =3, m = 3;
        int totalPath = countPath(0,0,n,m);
        System.out.println("Total Counts of Path : "+ totalPath);
    }
    public static int countPath(int i ,int j , int m , int n){

        if(i == n || j == m){
            return 0;
        }
        if( i  == n-1 || j== m-1){
            return 1;
        }


        int downPath = countPath(i+1, j, m, n);

        int rightPath  = countPath(i, j+1, n,m );

        return downPath + rightPath;
    }
}
