public class quickSort{
    // print statement func
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    // quick sort algo 
    public static void quickSorts(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }
        // last ele pivote hai
        int pidx = partition(arr,si,ei);
        quickSorts(arr,si,pidx-1); //left part
        quickSorts(arr,pidx+1,ei); // right part

    }
    // partition func
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei]; // ye hamara pivot hai
        int i=si-1; // i ka kaam hai jagah banana 

        for(int j=si; j<ei; j++){ // ye loop 0 se ending index tk jayega
            if(arr[j] <= pivot){ // agar curr ele pivot se kam hai tb i ko jagah banani padegi 
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void main(String args[]){
        // arr creation 
        int arr[] =  {6,3,9,2,5};
        quickSorts(arr, 0, arr.length-1);
        printArr(arr);

    }
}