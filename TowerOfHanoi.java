public class TowerOfHanoi {
    public static void main(String ar[]){
        int n =3;
            towerOfHanoiF(n, "S", "H", "D");
    }

    public static void towerOfHanoiF(int n , String src ,String helper , String dest){

        if(n==1){
            System.out.println("transfer disk "+ n+" from "+ src + " to "+ dest);
            return;
        }
        towerOfHanoiF(n-1, src, dest, helper);
        System.out.println("transfer disk -: "+ n+" from "+ src + " to "+ dest);
        towerOfHanoiF(n-1,helper, src, dest);

    }
}
