public class InsertionSort {
        public static void main(String ar[]){
            int arr[] = {14,6,3,1,-6,-9,11};
            for(int i =1;i<7;i++){
                int j = i-1;
                int current = arr[i];
                while(j>=0 && current < arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }
        
        for(int i =0;i<7;i++){
            System.out.print(arr[i]+" ");
        }

}
}
