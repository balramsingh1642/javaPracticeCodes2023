public class BubbleSort {
    public static void main(String ar[]){
        int arr[]  = {47,4,2,0,11,3,0,76,-1,34};
        
        for(int i =0;i<10;i++){
            for(int j =0;j<10-i-1;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else {
                        continue;
                }
            }
        }
        for(int i =0 ;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
