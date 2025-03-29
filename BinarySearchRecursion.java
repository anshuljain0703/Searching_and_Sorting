//package Searching.java;

public class BinarySearchRecursion {
    static boolean binarysearch(int [] a,int target,int s,int e){
        int n=a.length;
        int mid=(s+e)/2;
        if(s>e) return false;
        if(a[mid]==target){
            return true;
        }else if(a[mid]<target){
          return  binarysearch(a, target,mid+1 ,e);
        }else{
         return   binarysearch(a, target, s, mid-1);
        }
    }
    public static void main(String [] args){
        int [] a={2,4,5,7,15,20,24,45,50,77};
        System.out.println(binarysearch(a,22,0,a.length-1));

    }
    
}
