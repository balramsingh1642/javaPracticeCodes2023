public class PlaceTiles {
    public static void main(String st[]){

        // backtracking is used here
        int n = 4, m =2;
        int totalWays = placeTiles(n,m);
        System.out.println("Total ways to set tiles on a floor "+ totalWays);
    }

    public static int placeTiles(int n , int m){
        if(n == m) {
            return 2;
        }
        if( n < m) {
            return 1;
        }

        int verticleWays = placeTiles(n-m,m);

        int horzontalWays = placeTiles(n-1 ,m);
        return verticleWays +horzontalWays;

    }

}
