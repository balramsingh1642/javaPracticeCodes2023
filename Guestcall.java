import java.util.*;;
public class Guestcall {
    public static void main(String ar[]){
        int n =3;
        ArrayList<Integer> guestWays = new ArrayList<>();
        callGuest(n,guestWays);
    }
    public static void callGuest(int n , ArrayList<Integer> subset){
            if(n==0) {
                printGuests(subset);
                return;
            }
            subset.add(n);
            callGuest(n-1, subset);

            subset.remove(subset.size()-1);
            callGuest(n-1, subset);
    }

    public static void printGuests(ArrayList<Integer> subset){
        for(int i =0; i< subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
}
