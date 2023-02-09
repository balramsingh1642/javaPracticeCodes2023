public class SelectionSort {
    public static void main(String ar[]){
        int arr[] = {3,2,6,2,4,8,10,-1,-34,77};

        for(int i =0;i<10;i++){
            int smallest = i;
            for(int j= i+1 ;j<10;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;

        }
       for(int i =0;i<10 ;i++){
        System.out.print(arr[i]+" ");
       }

    }
}
