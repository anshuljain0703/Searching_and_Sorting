//package Searching.java;

public class FirstOcc {
    static int firstocc(int [] a,int x){
        int n=a.length;
        int s=0;
        int e=n-1;
        int fo=-1;
        while(s<=e){
          
            int mid=(s+e)/2;
            if(a[mid]==x){
                fo=mid;
                e=mid-1;

               



            }else if(a[mid]<x){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return fo;
    }

    
    public static void main(String [] args){
    int [] a={2,4,5,7,15,20,24,45,50,50,77};
    System.out.println(firstocc(a,50));
    }
}
