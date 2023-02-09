public class IsArraySorted {
    static boolean  t = false;
 public static void main(String ar[]){
    int art[]  = {0,1,2,3,4,5,6};
    boolean v = isArraySorted(art,0);
    System.out.println("Is array strickly Sorted "+v);
 }   
 public static boolean isArraySorted(int[] arr,int indx){
    if(indx == arr.length-1){
        return true;
    }
    if(arr[indx]>= arr[indx+1]){
        t =  false;
        return t;
    }

    return isArraySorted(arr, indx+1);
    
 } 

}
