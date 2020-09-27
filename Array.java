public class Array {
    public static int maxSum(int arr[],int n, int k){
        if(n<k)
        {
            System.out.println("Invalid");
            return -1;
        }

        //calculating first window of size k
        int res = 0;
        for(int i=0;i<k;i++){
            res += arr[i];
        }

        //calculating for current window by adding
        //next element in current window and 
        //removing first from previous window.

        int current_sum = res;
        for(int i=k; i<n; i++){
            current_sum += arr[i]- arr[i-k];
            res = Math.max(res, current_sum);
        }
        return res;
    }
    public static void main(String[] args){
        int arr[]= {2,4,5,6,8,10};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    
    }
}
