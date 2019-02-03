package com.shariq.array.rotation;

import com.shariq.util.Util;

public class Reversal
{
    public void rotateArrayReversal(int arr[],int d){
      reverse(arr,0,d-1);
      reverse(arr,d,arr.length-1);
      reverse(arr,0,arr.length-1);
    }

    private void reverse(int arr[], int start, int end){
        int i=start,j=end;
        while(i<j){
            Util.swap(arr,i,j);
            i++;
            j--;
        }
    }

}
