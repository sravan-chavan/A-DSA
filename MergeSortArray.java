//A-DSA Exp-1 Merge Sort in java..

import java.util.*;
public class MergeSortArray{
    public static void main(String[] args) {
        //int array[]={15,5,24,8,1,3,16,10,20};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the Array: ");
      int n = sc.nextInt();

        int [] array;
        array = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }
        Mergesort(array, 0, array.length-1);
        print(array);
    }

    //sorting arrays 
    public static void Mergesort(int array[],int si,int ei){
        if(si >= ei){
            return;
        }
        //mid calculation
        int mid = si + (ei - si)/2; 
        Mergesort(array, si, mid); //solve left part
        Mergesort(array, mid+1 , ei); //solve right part
        merge(array,si,ei,mid);
    }

    //merging 
    public static void merge(int array[],int si ,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i = si; //left iterator
        int j = mid + 1; //right iterator
        int k = 0;  //iterator for temp
        while (i<=mid && j<= ei){
            if(array[i]<array[j]){
                temp[k]=array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        //remaining elements of left
        while(i<=mid){
            temp[k++]=array[i++];
        }

        //remaining elements of right
        while(j<=ei){
            temp[k++] = array[j++];
        }

        //coping from temp to original array
        for(k = 0,i = si;k<temp.length;k++,i++){
           array[i]= temp[k] ;
        }
    }
    
    //printing array
    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}