public class searchSortedRotetedArray{
    public static int search(int arr[], int tar, int si, int ei){
        // base case hit karega tb return kargea -1
        if(si > ei){
            return -1;
        }
        // kaam to find out mid
        int mid = si+(ei-si)/2; // 

        // case found  yahan par dekha mid exist karta hai kya 
        if(arr[mid] == tar){
            return mid;


        }
        // mid on L1 vali condition dekh li 
        if(arr[si] <= arr[mid]){
            // case a: left
            if(arr[si] <= tar && tar <= mid){
                return search(arr, tar, si, mid);

            }else{
                // case b: right
                return search(arr, tar, mid+1, ei);

            }
        }
        // mid on L2 vali condition dekh li 
        else{
            // case c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                // case d: left
                return search(arr,tar, si, mid-1);
            }
        }

    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // outpu -> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}