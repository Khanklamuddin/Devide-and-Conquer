public class DevideConquerBasics{
    // ye print arr hai  hai
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // 
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        // ye recusive func hai
        if(si >= ei){
            return;
        }
          // kaam kya hai 
        int mid = si+(ei-si)/2; //(si+ei)/2
        mergeSort(arr, si,mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr,si,ei, mid);

        
    }
    // mergeSort algorithm
    public static void merge(int arr[], int si, int ei,int mid){
        // ye merge func hai
        // left(0,3) = 4 right (4,6) -> 6-0+1 = 7
        int temp[] = new int[ei-si+1]; // ye merge kerne ke liye
        int i = si; // itrator fr left part
        int j = mid+1; // itrator for right part
        int k = 0; // itrator for temp

        while(i<=mid && j<= ei){
            if(arr[i] <arr[j]){
                temp[k] = arr[i];
                i++; 

            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while(i<=mid){
            temp[k++] = arr[i++]; // i curr value increament
        }
        // right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for( k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

            
        }

    public static void main(String args[]){
        // divide and counquer basics
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}